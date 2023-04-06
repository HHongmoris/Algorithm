import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[10];
		for(int i=0; i<10; i++) {
			nums[i] = sc.nextInt() % 42;
		}
		int cnt = 0;
		for(int i=0; i<9; i++) {
			for(int j=i+1; j<10; j++) {
				if(nums[i]==nums[j]) {
					nums[j] = -1;
				}
			}
		}
		for(int i=0; i<10; i++) {
			if(nums[i]!=-1) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}