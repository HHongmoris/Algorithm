package boj;

import java.util.Scanner;

public class boj2747_dp {
	static int[] dp;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//n 입력
		int N = sc.nextInt();
		dp = new int[N+1];
		
		System.out.println(fibo(N));
		
	}
	
	static int fibo(int n) {
		if(n==1 || n==2) return 1;
//		if(dp[n]!=0) return dp[n];
		
		dp[n] = fibo(n-1) + fibo(n-2);
		return dp[n];
		
		
	}

}
