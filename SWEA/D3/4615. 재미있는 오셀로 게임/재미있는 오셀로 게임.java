import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 수 입력
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			//보드의 길이와 돌 놓는 횟수 M 입력
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			//보드판 배열로 설정
			int[][] board = new int[N][N];
			//초기 상태 돌 배치
			board[N/2-1][N/2-1] = 2;
			board[N/2-1][N/2] = 1;
			board[N/2][N/2] = 2;
			board[N/2][N/2-1] = 1;
			
			
			//M번 돌 놓기
			for(int i=0; i<M; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int r = y-1;
				int c = x-1;
				board[r][c] = sc.nextInt();
				//이제부터 8방 탐색 시작
				//놓은 돌로부터 모든 방향에 자신과 같은 돌 있으면
				//그 사이에 있는 돌은 색 바꾸기
				//델타 탐색 가봅시다
				int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1};
				int[] dc = {0, 0, -1, 1, -1, 1, -1, 1};
				//방향키 d
				for(int d=0; d<8; d++) {
					for(int k=1; k<N; k++) {
						int nr = r + dr[d]*k;
						int nc = c + dc[d]*k;
						//nr, nc 범위 잡기
						if(nr>=0&&nr<N&&nc>=0&&nc<N) {
							if(board[r][c]==1 && board[nr][nc]==1) {
//								if(board[nr][nc]==board[r][c]) {
									//그 사이에 있는 돌들을 어떻게 바꾸지...?
									//바꾸기 로직 뾰로롱
									for(int l=1; l<k; l++) {
										int nrI = r+dr[d]*l;
										int ncI = c+dc[d]*l;
										if(board[nrI][ncI]==2) {
											board[nrI][ncI]=1;
										}else if(board[nrI][ncI]==0) break;
									}
									break;
//								}else continue;
							}else if(board[r][c]==2 && board[nr][nc]==2) {
//								if(board[nr][nc]==board[r][c]) {
									//그 사이에 있는 돌들을 어떻게 바꾸지...?
									//바꾸기 로직 뾰로롱
									for(int l=1; l<k; l++) {
										int nrI = r+dr[d]*l;
										int ncI = c+dc[d]*l;
										if(board[nrI][ncI]==1) {
											board[nrI][ncI]=2;
										}else if(board[nrI][ncI]==0) break;
									}
									break;
//								}else continue;
							}else if(board[nr][nc]==0) break;
						}else continue;
					}
				}
			}
			//흑돌 수 계산
			int cntB = 0;
			//백돌 수 계산
			int cntW = 0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(board[i][j]==1) cntB++;
					else if(board[i][j]==2) cntW++;
				}
			}
			
			
			//게임이 끝난 후 보드 위의 돌 개수 출력
			System.out.println("#"+t+" "+cntB+" "+cntW);
		}
	}
}