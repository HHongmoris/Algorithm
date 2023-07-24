import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		//앞은 자릿수, 뒤는 그 자릿수가 어떤 숫자인지
		long[][] dp = new long[101][10];
		
		dp[1][0] = 0;
		
		for(int i=1; i<10; i++) {
			dp[1][i] = 1;
		}
		
		for(int i=2; i<N+1; i++) {
			for(int j=0; j<10; j++) {
				if(j==9) {
					dp[i][9] = dp[i-1][8];
				}else if(j==0) {
					dp[i][0] = dp[i-1][1];
				}else {
					dp[i][j] = (dp[i-1][j-1]+dp[i-1][j+1])%1000000000;
				}
			}
		}
		
		long ans = 0;
		for(int i=0; i<10; i++) {
			ans += dp[N][i];
		}
		
		System.out.println(ans%1000000000);
	}
}