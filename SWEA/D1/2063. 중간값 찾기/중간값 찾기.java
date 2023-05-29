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
		// 크기 순으로 정렬하기
		Arrays.sort(nums);
		//중간값이기 때문에 N/2번째 수 출력
		System.out.println(nums[N/2]);
	}
}