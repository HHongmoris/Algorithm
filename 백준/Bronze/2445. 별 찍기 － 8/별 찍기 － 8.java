import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0; i<N-1; i++) {
			for(int j=0; j<2*N; j++) {
				if(i >= j || i >= 2*N-1-j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=N; i<2*N; i++) {
			for(int j=0; j<2*N; j++) {
				if(2*N-1-i >= j || i <= j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}