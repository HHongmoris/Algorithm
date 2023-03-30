package boj;

import java.util.Scanner;

public class boj2630 {
	static int N;
	static int[][] paper;
	static int cnt0 = 0;
	static int cnt1 = 0;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//N 입력
		int N = sc.nextInt();
		//색종이 색 입력
		paper = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				paper[i][j] = sc.nextInt();
			}
		}
		
		check(0, N-1, 0, N-1);
		System.out.println(cnt0);
		System.out.println(cnt1);
		
		
	}
	
	public static void check(int si, int ei, int sj, int ej) {
		boolean okay = true;
		int color = paper[si][sj];
		int next = (ei-si+1)/2;
		//recursive case
		//종이 색이 다르면 바로 4등분
		for(int i=si; i<=ei; i++) {
			for(int j=sj; j<=ej; j++) {
				if(paper[i][j]!=color) {
					check(si, ei-next, sj, ej-next);
					check(si+next, ei, sj, ej-next);
					check(si, ei-next, sj+next, ej);
					check(si+next, ei, sj+next, ej);
					okay = false;
					break;
				}
			}
			if(!okay) break;
		}
		//종이 색이 같은 경우 (okay==true) 색깔별로 카운트
		if(okay) {
			if(color==1) cnt1++;
			else if(color==0) cnt0++;
		}
		
		//base case		=> 이거 아래에 써도 상관없나..? 위에 쓰면 값이 다르다
		if(!okay || next==0) {
			return;
		}
	}
}
