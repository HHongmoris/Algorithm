import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int T = N/4;
		
		for(int i=0; i<T-1; i++) {
			System.out.print("long ");
		}
		System.out.print("long int");
	}

}