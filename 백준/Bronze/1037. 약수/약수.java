import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nc = sc.nextInt();
		
		int[] nums = new int[nc];
		for(int i=0; i<nc; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		
		int ans = nums[0] * nums[nc-1];
		System.out.println(ans);
	}
}