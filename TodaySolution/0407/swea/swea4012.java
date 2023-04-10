package swea;
//요리사 다시 해야함
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class swea4012 {
	
	
	static int[] food;	//N개의 재료
	static int[] foodCheck; //절반 나눈 요리재료
	static List<Integer>[] list;	//후보 비교할 리스트 생성
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int R = N/2;
			
			int[][] synergy = new int[N][N];
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					synergy[i][j] = sc.nextInt();
				}
			}
			//재료별 시너지 입력 완료
			
			list = new ArrayList[12870];
			for(int i=0; i<12870; i++) {
				list[i] = new ArrayList<>();
			}
			
			comb(0, 0, N, R);
			
			
			
		}
	}
	
	public static void comb(int idx, int sidx, int N, int R) {
		int num = 0;
		//R개 다 뽑았을 때, N개 전부 봤을 때
		if(sidx == R || idx == N) {
			for(int i=0; i<R; i++) {
				list[idx++].add(foodCheck[i]);
			}
			return;
		}
		
		
		foodCheck[sidx] = food[idx];	//후보군에 저징
		comb(idx+1, sidx, N, R);	//이번 재료 안씀
		comb(idx+1, sidx+1, N, R);	//이번 재료 씀

		
	}
}
