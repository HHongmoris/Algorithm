import java.util.Scanner;

import org.omg.PortableInterceptor.INACTIVE;

public class Main {
	static int M;	//배추 밭의 가로 길이
	static int N;	//배추 밭의 세로 길이
	static int[][] baechoo;	//배추 밭의 배열
	static boolean[][] visited;	//방문처리할 배열
	static int cnt;	//지렁이 수
	static int min;	//최소값
	//DFS에서 활용할 델타 배열
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		//테스트 케이스 수 입력
		int T = sc.nextInt();
		for(int t=1; t<= T; t++) {
			//가로 길이
			M = sc.nextInt();
			//세로 길이
			N = sc.nextInt();
			//배추 수 입력
			int K = sc.nextInt();
			//배추 밭 배열 입력
			//배추 좌표의 값은 1로 처리
			baechoo = new int[N][M];
			for(int i=0; i<K; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				baechoo[y][x] = 1;
			}//배추 밭 입력 완료
			
			visited = new boolean[N][M];
			min = Integer.MAX_VALUE;
			cnt = 0;
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					if(DFS_baechoo(i, j)) {
						cnt++;
					}
				}
			}
			
			min = Math.min(min, cnt);
			
			sb.append(min+"\n");			
		}
		System.out.println(sb);
		
	}
	
	static boolean DFS_baechoo(int r, int c) {
		//base case
		if(visited[r][c] || baechoo[r][c]==0) return false;
		
		//recursive case
		visited[r][c] = true;
		for(int d=0; d<4; d++) {
			int nr = r+dr[d];
			int nc = c+dc[d];
			if(nr>=0 && nr<N && nc>=0 && nc<M) {
				if(baechoo[nr][nc] != 0) {
				DFS_baechoo(nr, nc);
				}
			}
		}
		
		return true;
	}
	
	
}