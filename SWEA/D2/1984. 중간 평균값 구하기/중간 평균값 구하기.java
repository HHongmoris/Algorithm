import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트 케이스 수 스케너로 입력 받기
		int T = sc.nextInt();
		//각 테스트 케이스 별 정답 출력
		for(int tc=1; tc<=T; tc++) {
			//10개의 수를 하나의 배열로 입력받기
			int[] nums = new int[10];
			//배열로 입력받으면서 최대, 최소값 찾고 전체 합 구하기
			//최대는 max를 -1으로 최소는 min을 10001으로 설정하고
			//각 값을 비교하여 더 큰값을 max, 작은 값은 min으로 초기화를 이어나간다.
			//(전체합은 sum)
			int max = -1;
			int min = 10001;
			int sum = 0;

			for(int i=0; i<10; i++) {
				nums[i] = sc.nextInt();
				if(max<nums[i]) max = nums[i];
				if(min>nums[i]) min = nums[i];
				
				sum += nums[i];
			}

			//10번의 과정이 끝났다면 sum에서 max와 min을 빼주고 평균값을 구한다.
			// -> 소수점 첫째자리에서 반올림 : Math.round() 메소드 사용
			//   - 소수점 첫째자리이기 때문에 나누는 수에 소수점 첫째자리로
 			int ans = (int)Math.round((sum - max - min)/8.0);
			System.out.println("#"+tc+" "+ans);
		}
	}
}