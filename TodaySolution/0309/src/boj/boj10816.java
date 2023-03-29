package boj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boj10816 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//N입력
		int N = sc.nextInt();
		//N개 숫자 배열 큐로 입력
		Queue<Long> card = new LinkedList<>();
		for(int i=0; i<N; i++) {
			card.add(sc.nextLong());
		}
		//M 입력
		int M = sc.nextInt();
		//M개 숫자 배열
		Long[] nums = new Long[M];
		
		//숫자 같을 때 카운트하는 배열 선언
		int[] cnt = new int[M];
		for(int i=0; i<M; i++) {
			nums[i] = sc.nextLong();
			for(int j=0; j<N; j++) {
				if(nums[i]==card.peek()) {
					cnt[i]++;
					card.add(card.poll());
				}else if(nums[i]!=card.peek()) {
					card.add(card.poll());
				}			
			}
		}
		
		for(int i=0; i<M; i++) {
			System.out.print(cnt[i]+" ");
		}

	}
}