package swea;

import java.util.Scanner;

public class swea2817 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트 케이스 수 입력
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			//N입력
			int N = sc.nextInt();
			//K 입력
			int K = sc.nextInt();
			//N개의 숫자 입력
			int[] nums = new int[N];
			for(int i=0; i<N; i++) {
				nums[i] = sc.nextInt();
			}
			//합이 K가 되는 경우 카운트
			int cnt = 0;
			//nums의 부분집합 만들기
			//부분집합 요소들의 합 = sum
			//sum이 K와 같으면 카운트
			//비트마스킹 활용
			
			for(int i=0; i<(1<<N); i++) {
				int sum = 0;
				for(int j=0; j<N; j++) {
					if((i&(1<<j))!=0) {
						sum+=nums[j];				
					}
				}
				if(sum==K) {
					cnt++;
				}
			}
			
			System.out.println("#"+t+" "+cnt);
			
			
		}
		
	}
}
