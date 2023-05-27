import java.util.Scanner;

public class Solution {
	// 최대 수 구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트 케이스 수 스케너로 입력 받기
		int T = sc.nextInt();
		//각 테스트 케이스 별 정답 출력
		for(int tc=1; tc<=T; tc++) {
			//10개의 수는 0이상 10000 이하의 정수이므로
			//0 미만의 값을 max로 선언하고 각 값을 입력받을 때마다
			//값을 비교하여 더 큰 값을 max값으로 설정
			int max = -1;
			for(int i=0; i<10; i++) {
				int n = sc.nextInt();
				if( n > max) {
					max = n;
				}
			}
			
			// 10개의 정수 비교 다 끝났으면 max 출력
			System.out.println("#"+tc+" "+max);
			
		}
	}
}