import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		
		int[] length = new int[4];
		int min = Integer.MAX_VALUE;
		
		length[0] = x;
		length[1] = y;
		length[2] = w-x;
		length[3] = h-y;
		
		for(int i=0; i<4; i++) {
			min = Math.min(min, length[i]);
		}
		System.out.println(min);
		
	}
}