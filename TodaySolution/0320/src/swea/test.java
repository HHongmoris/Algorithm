package swea;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		
//		int N= sc.nextInt();
//		int temp = 0;
//		char num = 0;
//		
//		temp = num*((int) (Math.pow(16, N/4-1)));
//		
//		
//		System.out.println(temp);
		int temp = 0;
		for(int i=0; i<3; i++) {
			temp += (10)*((int)Math.pow(16, 2-i));
			
		}
		System.out.println(temp);
	}
}
