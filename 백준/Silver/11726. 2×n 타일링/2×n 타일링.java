import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] dp = new int[n+1];
		//규칙이 존재한다.
		//dp[n] = dp[n-1] + dp[n-2]
		dp[0] = 0;
		dp[1] = 1;
		if(n>=2) {
			dp[2] = 2;
			for(int i=3; i<n+1; i++) {
				dp[i] = (dp[i-1]+dp[i-2])%10007;
			}			
		}
		
		int ans = dp[n] % 10007;
		System.out.println(ans);
		
	}
}