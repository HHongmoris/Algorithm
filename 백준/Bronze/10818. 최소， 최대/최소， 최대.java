import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int[] nums = new int[N];
		
		for(int i=0; i<N; i++) {
			nums[i] = sc.nextInt();
			if(nums[i]>max) max = nums[i];
			if(nums[i]<min) min = nums[i];
		}
		
		System.out.println(min+" "+max);
	}
}