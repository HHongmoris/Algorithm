import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		System.out.println(fac(N));
	}
	
	static long fac(int n) {
		if(n==0) return 1;
		
		long ans = 1;
		for(int i=1; i<=n; i++) {
			ans *= i;
		}
		
		return ans;
	}
}