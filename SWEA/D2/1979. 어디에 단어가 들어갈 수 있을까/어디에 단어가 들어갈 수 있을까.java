import java.util.Scanner;

//어디에 단어가 들어갈 수 있을까
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트 케이스 수 입력
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			//가로 세로 길이 N, 단어 길이 K 입력
			int N = sc.nextInt();
			int K = sc.nextInt();
			//NxN 행렬 입력
			int[][] puzzle = new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					puzzle[i][j] = sc.nextInt();
				}
			}
			
			//퍼즐에서 빈칸 탐색 
			//- 연속된 1의 개수를 각 줄마다 구하고 
			//- 0이 나오거나 마지막칸인 순간 그 개수를 K와 비교
			int cnt = 0;	//칸 수 세는 용도
			int ans = 0; 	//K와 빈칸이 일치하는 수 합(정답)
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(puzzle[i][j]==1 && j<N-1) {
						cnt++;
					}else if(puzzle[i][j]==1 && j==N-1){
						cnt++;
						//칸이 0일 때 지금까지의 cnt가 K와 일치하면 ans에 +1
						if(cnt == K) {
							ans++;
							//다음을 위해 바로 초기화
							cnt = 0;
						}else cnt = 0;
					}else {
						//칸이 0일 때 지금까지의 cnt가 K와 일치하면 ans에 +1
						if(cnt == K) {
							ans++;
							//다음을 위해 바로 초기화
							cnt = 0;
						}else cnt = 0;
					}
				}
			}
			
			for(int j=0; j<N; j++) {
				for(int i=0; i<N; i++) {
					if(puzzle[i][j]==1 && i<N-1) {
						cnt++;
					}else if(puzzle[i][j]==1 && i==N-1){
						cnt++;
						//칸이 0일 때 지금까지의 cnt가 K와 일치하면 ans에 +1
						if(cnt == K) {
							ans++;
							//다음을 위해 바로 초기화
							cnt = 0;
						}else cnt = 0;
					}else {
						//칸이 0일 때 지금까지의 cnt가 K와 일치하면 ans에 +1
						if(cnt == K) {
							ans++;
							//다음을 위해 바로 초기화
							cnt = 0;
						}else cnt = 0;
					}
				}
			}
			
			//정답 출력
			System.out.println("#"+t+" "+ans);
			
		}
		
	}
}