import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb;
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			sb= new StringBuilder();
			
			int R = sc.nextInt();
			String S = sc.next();
			char[] s = S.toCharArray();
			for(int i=0; i<s.length; i++) {
				for(int j=0; j<R; j++) {
					sb.append(s[i]);
				}
			}
			System.out.println(sb);
			
		}
	}
}