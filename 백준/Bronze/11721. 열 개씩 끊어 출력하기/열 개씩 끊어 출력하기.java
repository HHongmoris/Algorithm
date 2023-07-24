import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] st = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			st[i] = str.charAt(i);
		}
		
		int n = 0;
		while(n < str.length()) {
			for(int i=n; i<n+10 && i<str.length(); i++) {
				System.out.print(st[i]);
			}
			n+=10;
			System.out.println();
		}
	}
}