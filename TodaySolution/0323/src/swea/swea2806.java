package swea;

import java.util.Scanner;

public class swea2806 {
	static int[] nq;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트 케이스 수 입력
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			
			
			
		}
	}
	
	public static void nQueen(int N) {
		nq = new int[N];
		if(N==1) {
//			return 1;
		}
		
		for(int i=0; i<N; i++) {
			(nq[i]!=nq[i-1])&&(nq[i]!=nq[i+1]) 
		}
	}
}
