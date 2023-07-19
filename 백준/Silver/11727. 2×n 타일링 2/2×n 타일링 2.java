import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] dp = new int[N+1];

        dp[0] = 1;  //index가 2일 때를 고려하여 dp[0] = 1로 설정
        dp[1] = 1;

        for(int i=2; i<N+1; i++){
            dp[i] = (dp[i-1] + 2*dp[i-2])%10007;
        }

        System.out.println(dp[N]%10007);
    }
}