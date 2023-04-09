import java.util.Scanner;

public class Main {
	static int[][] dp;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			dp = new int[k+1][n+1];
			
			for (int i = 1; i <= n; i++) {
                dp[0][i] = i;
            }
			
			System.out.println(func(k, n));
			
		}
	}
	
	static int func(int a, int b) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        	}
		}
		return dp[a][b];
	}
}