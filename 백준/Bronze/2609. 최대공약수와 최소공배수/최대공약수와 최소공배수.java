import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int gcd = getGCD(a, b);
		int lcm = a*b/gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);
		
	}
	
	public static int getGCD(int a, int b) {
		if(b == 0) {
			return a;
		}
		return getGCD(b, a%b);
	}
}