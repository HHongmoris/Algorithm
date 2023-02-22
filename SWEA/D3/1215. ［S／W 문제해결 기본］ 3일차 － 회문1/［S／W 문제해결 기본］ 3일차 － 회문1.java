import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		//테스트 케이스 10개
		for(int t=1; t<=10; t++) {
			//회문 길이 L 입력
			int L = sc.nextInt();
			//8x8 배열 입력받음
			String[][] abc = new String[8][8];
			for(int i=0; i<8; i++) {
				abc[i] = sc.next().split("");
			}
			
			//가로와 세로를 나눠서 계산한다.
			//각각을 탐색하고 찾을 때 마다 cnt를 하나씩 올린다.
			int cnt = 0;
			
			//1. 가로
			boolean flag1 = true;
			for(int i=0; i<8; i++) {
				for(int j=0; j<=8-L; j++) {
					for(int k=0; k<L/2; k++) {
						if(abc[i][j+k].equals(abc[i][j+L-1-k])) {
							flag1 = true;
						}else {
							flag1 = false;
							break;
						}
					}
					if(flag1) {
						cnt++;
					}
				}
			}
			//2.세로
			boolean flag2 = true;
			for(int j=0; j<8; j++) {
				for(int i=0; i<=8-L; i++) {
					for(int k=0; k<L/2; k++) {
						if(abc[i+k][j].equals(abc[i+L-1-k][j])) {
							flag2 = true;
						}else {
							flag2 = false;
							break;
						}
					}
					if(flag2) {
						cnt++;
					}
				}
			}
			
			System.out.println("#"+t+" "+cnt);
		}
	}
}