package swea;

import java.util.Scanner;

public class swea10726 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트케이스 수 입력
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			//N 입력
			int N = sc.nextInt();
			//M 입력
			int M = sc.nextInt();
			//최종 판단을 위한 flag 선언
			boolean flag = true;
			
			//N번만큼 2로 나누었을 때 1이 나오면 통과
			//안나오면 OFF
			for(int i=0; i<N; i++) {
				if(M%2==1) {
					flag = true;
					M = M/2;
					continue;
				}else {
					flag = false;
					break;
				}
			}			
			//결과 출력
			if(flag) {
				System.out.println("#"+t+" "+"ON");
			}else {
				System.out.println("#"+t+" "+"OFF");
			}
			
		}
		
	}
}
