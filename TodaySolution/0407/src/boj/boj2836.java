package boj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class boj2836 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//N과 M 입력
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		//탈 곳과 목적지 2차 배열로 입력
		int[][] stop = new int[N][2];
		//가장 먼 지점 파악
		int far = 0;
		for(int i=0; i<N; i++) {
			stop[i][0] = sc.nextInt();	//출발점
			stop[i][1] = sc.nextInt();	//도착점
			far = Math.max(stop[i][0], far);
			far = Math.max(stop[i][1], far);
		}
		
		Arrays.sort(stop, (o1, o2) -> {
			return o1[0] - o2[0];
		});
		
		
		int total = 0;
		int rev = 0;	//역행으로 가는 부분
		int revSum = 0;
		int st = 0;
		int ed = Integer.MAX_VALUE;
		//역행으로 가는 부분 체크
		for(int i=0; i<N; i++) {

//			if(stop[i][0]>stop[i][1]) {
//				if(st<stop[i][0]) st = stop[i][0];
//				if(ed>stop[i][1]) ed = stop[i][1];									
//				rev = st - ed;
//				
//				if(stop[i][1]>st) {
//					revSum += rev;
//				}
//			}
			
			Back(stop[i][0], stop[i][1]);
		}
		
		total = M + 2*lenS;

//		if(revSum == 0) {
//			total = M + 2*rev;
//		}else {
//			total = M + 2*revSum;
//			
//		}
		System.out.println(total);
		
	}
	
	static int len;
	static int lenS;
	
	static void Back(int a, int b) {
		int ed = Integer.MAX_VALUE;
		int st = Integer.MIN_VALUE;
		
		
		if(b>st) st = b;
		if(a<ed) ed = a;
		
		if(a>st) {
			len = st - ed;
			st = b;
			ed = a;
			Back(st, ed);
		}
		lenS += len;
	}
}
