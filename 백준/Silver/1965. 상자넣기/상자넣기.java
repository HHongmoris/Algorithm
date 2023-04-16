import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//상자 개수
		int N = sc.nextInt();
		int[] size = new int[N+1];
		int[] dp = new int[N+1];
		
		//상자 크기
		for(int i=1; i<=N; i++) {
			size[i] = sc.nextInt();
		}
		
		int max = 0;	//구하려는 최대값
		dp[0] = 0;	
		dp[1] = 1;	//초기값 상자가 1개 뿐일 때
		
		if(N>1) {
			for(int i=2; i<=N; i++) {
				dp[i] = 1; // 초기값 설정
				for(int j=1; j<i; j++) {
					if(size[j] < size[i] && dp[i] < dp[j]+1) {
						dp[i] = dp[j]+1;
					}
				}
				max = Math.max(max, dp[i]);
			}
		}
		
		System.out.println(max);
	}
}