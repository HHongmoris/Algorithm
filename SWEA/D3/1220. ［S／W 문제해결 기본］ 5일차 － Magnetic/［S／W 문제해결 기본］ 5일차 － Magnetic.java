import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		//10개의 테스트 케이스
		for(int t=1; t<=10; t++) {
			//한 변의 길이 입력
			int N = sc.nextInt();
			//테이블 초기 모습 입력
			int[][] table = new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					table[i][j] = sc.nextInt();
				}
			}
			
			//교착상태 카운트
			int cnt = 0;
			
			//자성체가 N극(1)이면 아래만, S극(2)이면 위만 탐색
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					//자성체가 N극일 때
					if(table[i][j]==1) {
						for(int k=1; k<N-i; k++) {
							if(i+k<N) {
								//자성체 아래에 아무것도 없을 때
								if(table[i+k][j]==0) continue;
								//자성체 아래에 N극이 있을 때
								else if(table[i+k][j]==1) {
									table[i][j] = 0;
									break;									
								} 
								//자성체 아래에 S극이 있을 때
								else if(table[i+k][j]==2) {
									cnt++;
									table[i+k][j] = 0;
									table[i][j] = 0;
									break;
								}								
							}else break;
						}
					//자성체가 S극일 때
					}else if(table[i][j]==2) {
						for(int k=1; k<i+1; k++) {
							if(i-k>=0) {
								//자성체 위에 아무것도 없을 때
								if(table[i-k][j]==0) continue;
								//자성체 위에 N극이 있을 때
								else if(table[i-k][j]==1) {
									cnt++;
									table[i-k][j] = 0;
									table[i][j] = 0;
									break;
									//자성체 위에 S극이 있을 때
								}else if(table[i-k][j]==2) {
									table[i][j] = 0;
									break;																	
								} 
							}else break;
						}
					}
				}
			}
			//결과 출력
			System.out.println("#"+t+" "+cnt);
			
		}
	}
}