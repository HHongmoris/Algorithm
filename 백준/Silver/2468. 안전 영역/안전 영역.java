import java.util.Scanner;
	
	public class Main {
		static int N;
		static int[][] cheese;
		static int max;
		static boolean[][] visited;
		static int cnt;
		
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//한 변의 길이 N
			N = sc.nextInt();
			
			cheese = new int[N][N];
			
			int maxC = 0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					cheese[i][j] = sc.nextInt();
					maxC = Math.max(maxC, cheese[i][j]);
				}
			}
	
	
			max = 0;
	
			for(int day=0; day<=100; day++) {
	
				cnt = 0;
				visited = new boolean[N][N];
	
				if(maxC+1==day) break;
				
	
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
			System.out.println(max);
		}
		
		//상하좌우 인접해있는 부분 탐색을 위한 델타 배열 선언
		static int[] dr = {-1, 1, 0, 0};
		static int[] dc = {0, 0, -1, 1};
		
		static boolean DFS_cheese(int r, int c) {
	
			//base case
			if(cheese[r][c] == 0 || visited[r][c]) {
				return false;
			}		
			
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