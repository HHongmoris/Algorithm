import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] stair = new int[N + 1];
        int[] dp = new int[N + 1];

        // 계단마다 점수 입력
        for (int i = 1; i <= N; i++) {
            stair[i] = sc.nextInt();
        }

        dp[1] = stair[1];  // 첫 번째 계단을 반드시 밟아야 하므로 dp[1] 초기화
        if (N > 1) {  // 두 번째 계단을 오르는 경우도 고려
            dp[2] = stair[1] + stair[2];
        }

        for (int i = 3; i <= N; i++) {  // dp의 인덱스
            dp[i] = Math.max(dp[i - 2] + stair[i], dp[i - 3] + stair[i - 1] + stair[i]);
        }

        System.out.println(dp[N]);
    }
}