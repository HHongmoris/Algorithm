import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//10개의 테스트 케이스
		for(int t=1; t<=10; t++) {
			//덤프 횟수 입력
			int dump = sc.nextInt();
			//100개의 상자 높이 배열로 입력
			int[] box = new int[100];
			for(int i=0; i<100; i++) {
				box[i] = sc.nextInt();
			}
			
			//덤프 횟수만큼 덤프 작업 반복
			for(int d=0; d<dump; d++) {
				//최대, 최소값, 각 값의 인덱스 값 구하기
				int max = 0;
				int min = 1000;
				int maxIdx = 0;
				int minIdx = 0;
				for(int i=0; i<100; i++) {
					if(box[i]>max) {
						max = box[i];
						maxIdx = i;
					}
					if(box[i]<min) {
						min = box[i];
						minIdx = i;
					}
				}
				//최대값, 최소값 찾은 후 덤프 작업 진행
				box[maxIdx] = box[maxIdx]-1; 
				box[minIdx] = box[minIdx]+1; 
			}
			
			//덤프가 끝난 후 최대와 최소 새로 구하고 그 차 구하기
			int max = 0;
			int min = 1000;
			for(int i=0; i<100; i++) {
				if(box[i]>max) {
					max = box[i];
				}
				if(box[i]<min) {
					min = box[i];
				}
			}
			int ans = max - min;
			//출력
			System.out.println("#"+t+" "+ans);
		}
		
	}
}