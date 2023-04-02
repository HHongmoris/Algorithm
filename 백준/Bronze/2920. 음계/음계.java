import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[8];
		int flag = 0;
		for(int i=0; i<8; i++) {
			nums[i] = sc.nextInt();
		}
		
		for(int i=0; i<7; i++) {
			if(nums[i] == i+1 && nums[i+1] == i+2) {
				flag = 1;
			}else if(nums[i]==8-i && nums[i+1]==7-i) {
				flag = 2;
			}else {
				flag = 3;
				break;
			}
			
		}

		
		switch (flag) {
		case 1:
			System.out.println("ascending");
			break;
		case 2:
			System.out.println("descending");
			break;
		case 3:
			System.out.println("mixed");
			break;
		}
		
	}
}