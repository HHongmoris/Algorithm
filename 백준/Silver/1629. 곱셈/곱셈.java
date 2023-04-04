import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		BigInteger C = sc.nextBigInteger();
		
		BigInteger ans = A.modPow(B, C);
		System.out.println(ans);
	}
}