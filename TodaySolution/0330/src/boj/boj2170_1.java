package boj;

import java.util.Scanner;

public class boj2170_1 {
	static int[][] line;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//전부 두배를 해서 연결이 안된 부분을 찾는다
		//리스트에 배열로 받아서 끊어진 부분들을 구분할 수 있도록 설정
		
		//N 입력
		int N = sc.nextInt();
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int[][] line = new int[N][2];
		for(int i=0; i<N; i++) {
			line[i][0] = sc.nextInt();
			min = Math.min(line[i][0], min);
			line[i][1] = sc.nextInt();
			max = Math.max(line[i][1], max);
			
		}
		
	}
	
	public static void lineMaker(int n) {
		if(line[n+1][0]>=line[n][0] && line[n+1][0]<=line[n][0]) {
			
		}
	}
}