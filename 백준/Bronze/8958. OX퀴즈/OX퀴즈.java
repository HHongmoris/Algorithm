import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			
			char[] ox = sc.next().toCharArray();
			int ans = 0;
			int score = 0;
			for(int i=0; i<ox.length; i++) {
				if(ox[i]=='O') {
					score++;
				}else score = 0;
				ans +=score;
			}
			System.out.println(ans);
		}
	}
}