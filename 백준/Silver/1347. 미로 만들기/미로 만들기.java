import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	//적은 내용 길이
		//적은 내용 char 배열에 저장
		char[] road = new char[N];
		road = sc.next().toCharArray();
		
		int maxR = 0;
		int minR = 0;
		int maxC = 0;
		int minC = 0;
		
		//시작 점 좌표 : R=0, C=0
		int r=0;
		int c=0;
		
		int[] dr = {1, 0, -1, 0};
		int[] dc = {0, -1, 0, 1};
		int d = 0;
		
		for(int i=0; i<N; i++) {
			if(road[i]=='R') {
				d = (d+1)%4;
			}else if(road[i]=='L') {
				if(d==0) {
					d=3;
				}else d--;
			}else if(road[i]=='F') {
				r = r + dr[d];
				c = c + dc[d];
				maxR = Math.max(maxR, r);
				minR = Math.min(minR, r);
				maxC = Math.max(maxC, c);
				minC = Math.min(minC, c);

			}
		}
		
		char[][] maze = new char[maxR-minR+1][maxC-minC+1];
		if(minR<0) r = 0-minR;
		else r =0;
		
		if(minC<0) c = 0-minC;
		else c=0;
		
		maze[r][c] = '.';
		d = 0;
		for(int k=0; k<N; k++) {
			if(road[k]=='R') {
				d = (d+1)%4;
			}else if(road[k]=='L') {
				if(d==0) {
					d=3;
				}else d--;

			}else if(road[k]=='F') {
				r = r + dr[d];
				c = c + dc[d];
				maze[r][c] = '.';
				
			}
		}
		for(int i=0; i<maxR-minR+1; i++) {
			for(int j=0; j<maxC-minC+1; j++) {
				if(maze[i][j]=='\u0000') {
					maze[i][j] = '#';
				}	
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}
	}
}