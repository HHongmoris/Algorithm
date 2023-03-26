import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트케이스 입력
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			//점원 수 N, 선반높이 B 입력
			int N = sc.nextInt();
			int B = sc.nextInt();
			
			//점원 키 배열로 입력 받기
			int[] H = new int[N];
			for(int i=0; i<N; i++) {
				H[i] = sc.nextInt();
			}
			
			//점원의 키 조합하여 모든 경우 비교
			//비트 마스킹 사용
			//키의 합 sum 계산, 차의 최솟값 ans 선언
			int ans = Integer.MAX_VALUE;
			for(int i=0; i<(1<<N); i++) {
				int sum = 0;
				for(int j=0; j<N; j++) {
					if((i&(1<<j))!=0) {
						continue;
					}
					
					sum += H[j];
				}
				if(sum<B) continue;
				if(ans>(sum-B)) ans = (sum-B);
			}
			
			
			System.out.println("#"+t+" "+ans);
			
		}
		
	}
}