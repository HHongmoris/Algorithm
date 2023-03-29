package boj;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 9명 키 배열로 입력
		int[] key = new int[9];
		//입력 받으면서 9명 키 합산
		int sum = 0;
		for(int i=0; i<9; i++) {
			key[i] = sc.nextInt();
			sum += key[i];
		}
		
		//전체 합에서 2명 뺐을 때 100인 둘 고르기
		int no1 = 0;
		int no2 = 0;
		for(int i=0; i<8; i++) {
			for(int j=i+1; j<9; j++) {
				if(sum-key[i]-key[j]==100) {
					no1 = i;
					no2 = j;
					break;
				}
			}
		}
		
		PriorityQueue<Integer> newK = new PriorityQueue<>();
		//no1, no2 뺀 7명을 오름차순으로 새로운 배열에 입력
//		int[] newK = new int[7];
		for(int i=0; i<9; i++) {
			if(i!=no1 && i!=no2) {
				 newK.add(key[i]);
			}
		}
		
		while(!newK.isEmpty()) {
			System.out.println(newK.poll());
		}
	}
}
