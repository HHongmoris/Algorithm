package boj;

import java.util.Scanner;

public class boj2747 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//n 입력
		int N = sc.nextInt();
		
		int a = 0;
		int b = 1;
		int c = 0;;
		int cnt = 1;
		if(N == 1) {
			System.out.println(1);
		}else {
			while(cnt<N) {
				++cnt;
				c = a+b;
				a = b;
				b = c;
			}
			
			System.out.println(c);
			
		}
		
	}
}
