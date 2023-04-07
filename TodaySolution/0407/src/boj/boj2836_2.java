package boj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class boj2836_2 {
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
		
//		Arrays.sort(stop, (o1, o2) -> {
//			return o1[0] - o2[0];
//		});
		int st = 0;
		int ed = M;
		int sum = st - ed;
		int sumI = 0;
		int cnt = 0;
		for(int i=0; i<N; i++) {
			if(stop[i][0]>stop[i][0]) {
				
				int newS = stop[i][0];
				int newE = stop[i][1];
				
				if(newS > ed) {
					st = newS;
					ed = newE;
					
					sum += (newS - newE);
				}
				else {
					if(newS > st) {
						sum += newS - st;
						st = newS;
					}
				}
			}
			
		}
//			if(stop[i][0]>stop[i][1]) {
////				st = stop[i][0];
////				ed = stop[i][1];
//				st = Math.max(st, stop[i][0]);
//				ed = Math.min(ed, stop[i][1]);
//				
//				sumI = st - ed;
////				System.out.println(sum);
//			}else if(st<stop[i][1]) {
//				sum += sumI;
//				cnt++;
//				st = stop[i][0];
//				ed = stop[i][1];
//				System.out.println("썸"+sum);
//			}					
//		}
		
		int total = 0;
//		if(sum == 0) {
//			total = M + 2*sumI;
//		}else {
//			total = M + 2*sum;
//		}
		
		total = M + 2*sum;
		System.out.println(total);
		System.out.println(cnt);
		
		
	}
}
