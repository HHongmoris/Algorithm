package swea;

import java.util.Scanner;

public class swea4012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트케이스 수 
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			//식재료 개수 N입력
			int N = sc.nextInt();
			//Sij 입력
			int[][] Sng = new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					Sng[i][j] = sc.nextInt();
				}
			}
			
			//0부터 N-1까지의 수를 배열로 선언
			int[] nums = new int[N];
			for(int i=0; i<N; i++) {
				nums[i] = i;
			}
			
			//N개의 수 중 절반만 선택 -> 조합
			
			
			
		}
		
	}
	
	//조합의 메서드 선언
	public static void combination(int idx, int sidx) {
		
	}
	
}
