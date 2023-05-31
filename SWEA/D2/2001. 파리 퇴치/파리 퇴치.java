import java.util.Scanner;

//파리퇴치
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트케이스 수 입력
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			//파리 있는 영역의 크기 N, 파리채 크기 M 입력
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			//파리 있는 영역 NxN 행렬 입력
			int[][] fly = new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					fly[i][j] = sc.nextInt();
				}
			}
			
			//파리채 영역인 MxM에 들어있는 파리의 수를 모두 구한 뒤
			//가장 큰 값을 max로 저장
			// - fly배열의 인덱스를 0부터 N-M까지 해야 범위 넘어가지 않고 가능
			int max = 0;
			for(int i=0; i<=N-M; i++) {
				for(int j=0; j<=N-M; j++) {
					//파리채 안에 있는 파리 수 (한칸 갈때마다 초기화 위해 여기에 생성)
					int sum = 0;	
					//여기부터 파리채 영역
					for(int k=i; k<i+M; k++) {
						for(int l=j; l<j+M; l++) {
							sum += fly[k][l];
						}
					}
					
					if(max<sum) max = sum;
				}
			}
			
			//결과 출력
			System.out.println("#"+t+" "+max);
		}
	}
}