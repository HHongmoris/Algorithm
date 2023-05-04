import java.util.Scanner;

public class Main {
	static int[] dp0;
	static int[] dp1;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트케이스 수
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			
			
			System.out.println(fibo0(N)+" "+fibo1(N));
			 
		}
	}
	
	public static int fibo0(int n) {
		dp0 = new int[41];
		dp0[0] = 1;
		dp0[1] = 0;
		if(n>=2) {
			for(int i=2; i<=n; i++){
				dp0[i] = dp0[i-2] +dp0[i-1];
			}				
		}
		return dp0[n];
	}
	public static int fibo1(int n) {
		dp1 = new int[41];
		dp1[0] = 0;
		dp1[1] = 1;
		if(n>=2) {
			for(int i=2; i<=n; i++){
				dp1[i] = dp1[i-2] +dp1[i-1];
			}				
		}
		return dp1[n];
	}
}