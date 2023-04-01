import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[9];
		int idx = 0;
		int max = 0;
		for(int i=0; i<9; i++) {
			nums[i] = sc.nextInt();
			if(nums[i]>max) {
				idx = i;
				max = nums[i];
			}
		}
		
		System.out.println(max);
		System.out.println(idx+1);
	}
}