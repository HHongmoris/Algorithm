import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if( B+C < 60 ) {
			System.out.println(A+" "+(B+C));
		}else if( B+C >= 60 ) {
			if( A+(B+C)/60 > 23 ) {
				System.out.println(((A+(B+C)/60)-24)+" "+((B+C)%60));
			}else {
				System.out.println((A+(B+C)/60)+" "+((B+C)%60));
			}	
		}		
	}
}