import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] dp = new int[N+1][10];
        for(int i=0; i<10; i++) {
            dp[0][i] = 0;
            dp[1][i] = 1;
        }
        for(int i=2; i<N+1; i++){
            dp[i][0] = 1;
            for(int j=1; j<10; j++){
                dp[i][j] = (dp[i][j-1]+dp[i-1][j])%10007;
            }
        }

        int ans = 0;
        for(int i=0; i<10; i++){
            ans += (dp[N][i]%10007);
        }

        System.out.println(ans%10007);
    }
}