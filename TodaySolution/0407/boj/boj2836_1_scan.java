package boj;

import java.util.Scanner;

public class boj2836_1_scan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//N과 M 입력
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		//탈 곳과 목적지 2차 배열로 입력
		int[][] stop = new int[N][2];
	
		for(int i=0; i<N; i++) {
			stop[i][0] = sc.nextInt();	//출발점
			stop[i][1] = sc.nextInt();	//도착점
		}
		

		int st = 0;
		int ed = 0;
		int sum = 0;
		
		//초기값 설정
		for(int i=0; i<N; i++) {
			if(stop[i][0]>stop[i][1]) {
				st = stop[i][0];
				ed = stop[i][1];
				sum = st - ed;
				break;
			}
		}
		

		for(int i=0; i<N; i++) {
			if(stop[i][0]>stop[i][1]) {				
				if(st<stop[i][1]) {	//새로운 마디 시작
					st = stop[i][0];
					ed = stop[i][1];
					sum += st-ed;
				}else {	//겹칠 때
					if(st<stop[i][0]) {	//st가 새로운 선 안에 있을 때
						sum += stop[i][0] - st;
						st = stop[i][0];
					}
				}
			}
		}
		
		System.out.println( M + 2*sum);
	}
}
