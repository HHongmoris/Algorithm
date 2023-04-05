import java.util.Scanner;

import org.omg.CORBA.INTERNAL;

public class Main {
	
	static int R;
	static int C;
	static char[][] map;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	static int cnt;
	static boolean[][] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//지토 크기 R, C 입력
		R = sc.nextInt();
		C = sc.nextInt();
		
		//지도 2차원 배열로 선언
		//테두리에 바다 하나 더 있다고 가정하고 지도 입력
		map = new char[R+2][C+2];
		for(int i=1; i<=R; i++) {
			char[] sub = sc.next().toCharArray();
			for(int j=1; j<=C; j++) {
				map[i][j] = sub[j-1];
			}
		}
		
		for(int i=0; i<=R+1; i++) {
			map[i][0] = '.';
			map[i][C+1] = '.';
		}
		for(int i=0; i<=C+1; i++) {
			map[0][i] = '.';
			map[R+1][i] = '.';
		}
		//지도 입력 끝
		
		visited = new boolean[R+2][C+2];
		
		//50년 뒤 지도로 만들기
		for(int r=0; r<R+2; r++) {
			for(int c=0; c<C+2; c++) {
				Earth(r, c);
			}
		}
		
		
		//탐색하면서 남은 섬의 위치 파악
		int maxR = Integer.MIN_VALUE;
		int minR = Integer.MAX_VALUE;
		int maxC = Integer.MIN_VALUE;
		int minC = Integer.MAX_VALUE;
		for(int i=0; i<R+2; i++) {
			for(int j=0; j<C+2; j++) {
				if(map[i][j]=='X') {
					maxR = Math.max(maxR, i);
					minR = Math.min(minR, i);
					maxC = Math.max(maxC, j);
					minC = Math.min(minC, j);
				}
			}
		}
		
		//출력
		for(int i=minR; i<=maxR; i++) {
			for(int j=minC; j<=maxC; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
	
	//섬 주변에서 바다 3, 4곳이면 섬 가라앉는 메서드
	static void Earth(int r, int c) {
		if(map[r][c]=='X') {
			cnt = 0;
			for(int d=0; d<4; d++) {
				int nr = r+dr[d];
				int nc = c+dc[d];
				
				if(nr>=0 && nr<R+2 && nc>=0 && nc<C+2 ) {
					if(map[nr][nc]=='.'&& !visited[nr][nc]) {
						cnt++;
					}
				}
			}
			if(cnt >= 3) {
				map[r][c] = '.';
				visited[r][c] = true;
			}
			
		}else return;
		
	}
}