package boj;

import java.util.Scanner;

public class Q1244 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//스위치 개수 입력
		int N = sc.nextInt();
		//스위치 배열 입력
		int[] sw = new int[N];
		for(int i=0; i<N; i++) {
			sw[i] = sc.nextInt();
		}
	
		//학생 수 입력
		int st = sc.nextInt();
		//학생 성별, 받은 수 입력
		for(int i=0; i<st; i++) {
			//학생 성별 입력
			int s = sc.nextInt();
			//받은 스위치 번호
			int num = sc.nextInt() -1;
			
			//남학생일 때
			if(s==1) {
				//배수만 바꾸기
				for(int j=1; j<=N/(num+1); j++) {
					sw[(num+1)*j -1] = OnOff(sw[(num+1)*j -1]);
				}
			}else if(s==2) {	//여학생일 때
				//자기 자신과 자신을 중심으로 대칭일 때까지만 바꾸기
				sw[num] = OnOff(sw[num]);
				for(int j=1; j<N/2; j++) {
					if(num-j>=0&&num+j<N) {
						if(sw[num+j]==sw[num-j]) {
							sw[num+j] = OnOff(sw[num+j]);
							sw[num-j] = OnOff(sw[num-j]);
						}else break;					
					}
				}
			}
		}
		
		//출력
		if(N!=21) {
			if(N>21) {
				for(int k=0; k<20; k++) {
					System.out.print(sw[k]+" ");				
				}
				System.out.println();
				for(int k=20; k<N-1; k++) {
					System.out.print(sw[k]+" ");				
				}
				System.out.print(sw[N-1]);
			}else {
				for(int k=0; k<N-1; k++) {
					if(k<20) {
						System.out.print(sw[k]+" ");
					}
				}
				System.out.print(sw[N-1]);
			}
			
		}else {
			for(int k=0; k<20; k++) {
				System.out.print(sw[k]+" ");				
			}
			System.out.println();
			System.out.print(sw[21]);				
		}
	}
	//스위치가 1이면 0으로, 0이면 1로 바꾸는 메소드 만들기
	public static int OnOff(int a) {
		if(a==1) {
			return 0;
		}else {
			return 1;
		}
	}
}
