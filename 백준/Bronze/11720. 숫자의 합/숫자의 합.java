import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		char[] nums = sc.next().toCharArray();
		
		int ans = 0;
		for(int i=0; i<N; i++) {
			ans += nums[i]-48;
		}
		
		System.out.println(ans);
	}
}