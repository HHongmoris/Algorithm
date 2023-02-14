import java.util.Scanner;

public class Main{
	public static int factorial(int N){
		int ans = 1;
		for(int i=1; i<=N; i++) {
			ans *= i;
		}
		return ans;
	}
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(factorial(N));
	}
}