import java.util.Scanner;

//달팽이 숫자
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트케이스 수 입력
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			//달팽이 크기 N 입력
			int N = sc.nextInt();
			//달팽이 배열 생성
			int[][] snail = new int[N][N];
			
			//델타 배열로 탐색
			// 방향키 d
			int d = 0;
			int[] dr = {0, 1, 0, -1};
			int[] dc = {1, 0, -1, 0};
			
			//(0, 0)값 설정
			int num = 1;
			int r = 0;
			int c = 0;
			
			//num이 N*N 넘어가면 끝
			while(num<=N*N) {
				
				snail[r][c] = num;
				num++;
				//다음 칸 탐색
				int nr = r + dr[d%4];
				int nc = c + dc[d%4];
				
				//범위 밖이거나 숫자가 채워져 있으면 방향전환
				if(nr<0 || nr>=N || nc<0 || nc>=N || snail[nr][nc]!=0) {
					d++;
				}
				//다음 좌표로 가도록 설정
				r = r + dr[d%4];
				c = c + dc[d%4];					
				
			}

			//출력
			System.out.println("#"+t);
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					System.out.print(snail[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}