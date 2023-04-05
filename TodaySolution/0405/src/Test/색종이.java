package Test;

import java.util.Arrays;
import java.util.Scanner;

public class 색종이 {
	
	//카운트 배열
	static int[] cntPaper;
	static final int N = 10;// 한 변의 길이
	static int[][] paper;	//종이의 배열
	static boolean[][] visited;	//방문처리용
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트케이스 수 입력
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			paper = new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					paper[i][j] = sc.nextInt();
				}
			}//종이 입력 완료
			
			visited = new boolean[N][N];
			DFS(0, 0);
			System.out.println(Arrays.toString(cntPaper));
			
		}
	}
	
	static void DFS(int r, int c) {
		if(r==N && c==N) {
			return;
		}
		
		boolean check = false;
		int idx = -1;
		
		for(r=0; r<N; r++) {
			for(c=0; c<N; c++) {
				for(int k=0; k<5; k++) {
					int nr = r+k;
					int nc = c+k;
					if(nr>=0 && nr<N && nc>=0 && nc<N && !visited[nr][nc]) {
						for(int i=r; i<=nr; i++) {
							for(int j=c; j<=nc; j++) {
								if(paper[i][j]==1) {
									visited[i][j] = true;
									
								}else {
									check = true;
									break;
								}
							}
							if(!check) break;	
						}
						if(!check) break;
						idx = k;
					}
				}
				
			}
		}
		
		
		cntPaper[idx]++;

	}
}
