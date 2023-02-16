import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		//테스트 케이스 수, N, M, 파리 수 배열 입력 받기
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[][] fly = new int[N][N];
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					fly[r][c] = sc.nextInt();
				}
			}
			//파리 배열에서 MxM 크기에 들어있는 경우를 모두 구하고
			//그 파리채에 잡힌 파리 수 합을 각각 구하여
			//그들 중 최댓값을 출력한다.
			//파리채 배열 생성
			//파리 배열에서 MxM에 잡힌 값들 합산
			int[][] flyNums = new int[N-M+1][N-M+1];
			for(int r=0; r<=N-M; r++) {
				for(int c=0; c<=N-M; c++) {
					for(int i=r; i<r+M; i++) {
						for(int j=c; j<c+M; j++) {
							flyNums[r][c] += fly[i][j];
						}
					}
				}
			}
			//flyNums 배열에서 최댓값 출력
			int max = 0;
			for(int r=0; r<=N-M; r++) {
				for(int c=0; c<=N-M; c++) {
					if(max<flyNums[r][c]) {
						max = flyNums[r][c];
					}
				}
			}
			System.out.println("#"+t+" "+max);
			
		}
	}
}