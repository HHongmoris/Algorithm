import java.util.Scanner;

public class Solution {
	static int N;
	static int[][] cheese;
	static int max;
	static boolean[][] visited;
	static int cnt;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		//테스트케이스 수 입력
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			//치즈 한 변의 길이 N
			N = sc.nextInt();
			//치즈 맛 입력
			cheese = new int[N][N];
			
			int maxC = 0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					cheese[i][j] = sc.nextInt();
					maxC = Math.max(maxC, cheese[i][j]);
				}
			}//치즈 맛 입력

			//테스트 케이스마다 max값 초기화!!!!!!
			max = 0;
			//도둑이 날마다 먹는 것을 0으로 체크
			for(int day=0; day<=100; day++) {
				//치즈 맛의 최대값이 도둑이 먹는 것과 같으면 멈춤
				cnt = 0;
				visited = new boolean[N][N];
				//도둑이 먹을 수 있는 맛 넘어서면 break
				if(maxC+1==day) break;
				
				//도둑이 먹는 치즈는 0으로
				for(int i=0; i<N; i++) {
					for(int j=0; j<N; j++) {
						if(cheese[i][j]==day) {
							cheese[i][j] = 0;
						}
					}
				}
			
				//DFS 돌렸을 때 true면 cnt++
				for(int i=0; i<N; i++) {
					for(int j=0; j<N; j++) {
						
						if(DFS_cheese(i, j)) cnt++;
					}
				}
				if(cnt>max) max = cnt;
								
			}
			sb.append("#"+t+" "+max+"\n");
			
		}
		System.out.println(sb);
	}
	
	//상하좌우 인접해있는 부분 탐색을 위한 델타 배열 선언
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	
	static boolean DFS_cheese(int r, int c) {

		//base case
		if(cheese[r][c] == 0 || visited[r][c]) {
			return false;
		}		
		
		//치즈가 도둑에게 먹힌 부분이 아니면 방문처리와 함께 탐색 시작
		visited[r][c] = true;
		//상하좌우 탐색
		for(int d=0; d<4; d++) {
			int nr = r+dr[d];
			int nc = c+dc[d];
			
			if(nr<N&&nr>=0&&nc<N&&nc>=0) {
				if(cheese[nr][nc] != 0) {
					DFS_cheese(nr, nc);
				}
			}
			
		}
		
		return true;
		
	}
}