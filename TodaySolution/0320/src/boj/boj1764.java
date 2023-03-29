package boj;

import java.util.PriorityQueue;
import java.util.Scanner;

public class boj1764 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//듣도 못한 사람
		int N = sc.nextInt();
		//보도 못한 사람
		int M = sc.nextInt();
		//듣도 못한 사람 배열로 입력
		String[] noL = new String[N];
		for(int i=0; i<N; i++) {
			noL[i] = sc.next();
		}
		//보도 못한 사람 배열로 입력
		String[] noS = new String[M];
		for(int i=0; i<M; i++) {
			noS[i] = sc.next();
		}
		
		//듣도보도못한 큐 생성
		PriorityQueue<String> noLS = new PriorityQueue<>();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(noL[i].equals(noS[j])) {
					noLS.add(noL[i]);
				}else continue;
			}
		}
		System.out.println(noLS.size());
		while(!noLS.isEmpty()) {
			System.out.println(noLS.poll());
		}
		
	}
}
