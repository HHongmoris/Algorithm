import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int n = N/5;
		
		if(N<8 && N%3!=0 && N%5!=0) {
			System.out.println(-1);
		}else {
			switch (N%5) {
			case 0:
				System.out.println(n);
				break;
			case 1:
				System.out.println(n+1);
				break;
			case 2:
				System.out.println(n+2);
				break;
			case 3:
				System.out.println(n+1);
				break;
			case 4:
				System.out.println(n+2);
				break;
			}			
		}
		
	}
}