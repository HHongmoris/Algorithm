package swea;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class 보물상자 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트케이스 수 입력
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			//숫자 개수 N, 크기 순서 K 입력
			int N = sc.nextInt();
			int K = sc.nextInt();
			//N개의 숫자 입력
			String str = sc.next();
			//N개의 숫자 큐에 입력하기
			Queue<Character> nums = new LinkedList<>();
			for(int i=0; i<N; i++) {
				nums.add(str.charAt(i));
			}
			//10진수로 바꾼 수 우선순위 큐로 선언
			PriorityQueue<Integer> nums10 = new PriorityQueue<>();
			
			//N/4회 만큼 돌려야함
			for(int r=0; r<N/4; r++) {
				//1회
				for(int j=0; j<4; j++) {
					//nums 큐에서 N/4개씩 숫자를 빼서 배열에 넣고 그 배열을 통해 16진수에서 10진수로 바꾸기
					char[] num16 = new char[N/4];
					for(int c=0; c<N/4; c++) {
						num16[c] = nums.poll();
						nums.add(num16[c]);
					}
					//16진수에서 10진수로 바꾸기
					int temp = 0;
					for(int i=0; i<N/4; i++) {
						char st = num16[i];  
						if(st=='A') {
							temp += (10)*((int)Math.pow(16, N/4-i-1));
						}else if(st=='B') {
							temp += (11)*((int)Math.pow(16, N/4-i-1));
						}else if(st=='C') {							
							temp += (12)*((int)Math.pow(16, N/4-i-1));
						}else if(st=='D') {
							temp += (13)*((int)Math.pow(16, N/4-i-1));
						}else if(st=='E') {
							temp += (14)*((int)Math.pow(16, N/4-i-1));
						}else if(st=='F') {
							temp += (15)*((int)Math.pow(16, N/4-i-1));
						}else {
							temp += (st-48)*((int)Math.pow(16, N/4-i-1));							
						}
					}
					//완성된 10진수 nums10에 삽입
					nums10.add(temp);
				}
				nums.add(nums.poll());
				
			}// 10진수로 모두 바꾼 뒤 우선순위 큐에 넣기 완료			
					
			//중복되는 것들 제거
			for(int i=0; i<N; i++) {
				int sample = nums10.poll();
				if(sample!=nums10.peek()) {
					nums10.add(sample);
				}else if(sample==nums10.peek()) {
					continue;
				}
			}
			
			//K번째 수 출력
			for(int i=0; i<N-K; i++) {
				nums10.poll();
			}
			System.out.println("#"+t+" "+nums10.peek());
			
			
		}

	}
}
