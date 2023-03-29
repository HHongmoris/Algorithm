package boj;

import java.util.PriorityQueue;
import java.util.Scanner;

public class boj285 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//N, M 입력 받기
		int N = sc.nextInt();
		Long M = sc.nextLong();
		// 나무 높이 배열로 입력
		PriorityQueue<Long> treeQ = new PriorityQueue<>();
		for(int i=0; i<N; i++) {
			treeQ.add(sc.nextLong());
		}
		
		Long[] tree = new Long[N];
		for(int i=0; i<N; i++) {
			tree[i] = treeQ.poll();
		}
		
		//절단기 높이 선언
		//우선 나무들 높이의 중간 값으로 선언
		Long H = tree[N/2-1];
		Long sum = 0L;
		while(sum!=M) {
			sum = 0L;
			for(int i=N/2; i<N; i++) {
				sum += tree[i] - H;
			}
			if(sum>M) {
				H++;
			}else if(sum<M) {
				H--;
			}			
		}
		
		System.out.println(H);
		

		
	}
}
