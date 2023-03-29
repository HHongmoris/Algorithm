package swea;

import java.util.Scanner;

public class swea1217 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//10개의 테스트 케이스
		for(int t=0; t<10; t++) {
			int tc = sc.nextInt();
			//N, M 입력
			long N = sc.nextLong();
			long M = sc.nextLong();
			
			long ans = pow(N, M);
			System.out.println("#"+tc+" "+ans);
		}
	}
	//거듭제곱 메서드
	public static long pow(long N, long M) {
		//지수가 0일 때 (N의 0제곱은 1)
//		if(M==0) {
//			return 1;
//		}
		//지수가 짝수일 때
		if(M%2 == 0) {
			return pow(N, M/2)*pow(N, M/2);
		}else {		//지수가 홀수일 때
			return N*pow(N, M-1);
		}
	}
}
