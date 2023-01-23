import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if( A!=B && A!=C && B!=C ) {
			System.out.println(Math.max(A, Math.max(B, C)) * 100);
		}else if( A==B && B==C) {
			System.out.println((10000+ A*1000));
		}else {
			if(A==B) {
				System.out.println((1000+ A*100));
			}else if(A==C) {
				System.out.println((1000+ A*100));
			}else {
				System.out.println((1000+ C*100));
			}
		}
	
	}
}