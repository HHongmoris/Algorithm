import java.util.Arrays;
import java.util.Scanner;
//중간값 찾기
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//점수 개수 N입력
		int N = sc.nextInt();
		//크기가 N인 배열로 N개의 수 입력
		int[] nums = new int[N];
		for(int i=0; i<N; i++) {
			nums[i] = sc.nextInt();
		}
		
		//크기 순으로 정렬
		//1. 맨 앞 숫자부터 맨 뒤까지 탐색하며 최소값 찾는다.
		//2. 최소값이 맨 앞에 오도록 swap
		//3. 인덱스를 0부터 순차적으로 올라가며 탐색하고 위 방법을 반복
		for(int i=0; i<N-1; i++) {
			//idx를 시작점인 i로 초기화
			int idx = i;
			for(int j=i+1; j<N; j++) {
				//뒤 숫자가 더 작을 경우 그 인덱스 값을 idx로 초기화
				if(nums[idx]>nums[j]) {
					idx = j;
				}
			}
			//swap
			int temp = nums[idx];
			nums[idx] = nums[i];
			nums[i] = temp;
		}
		
		
		//중간값이기 때문에 N/2번째 수 출력
		System.out.println(nums[N/2]);
	}
}