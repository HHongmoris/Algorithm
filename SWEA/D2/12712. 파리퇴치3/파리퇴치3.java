import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        //테스트 케이스 수 입력
        int T = sc.nextInt();
        for(int t=1; t<=T; t++) {
            //N 입력
            int N = sc.nextInt();
            //M 입력
            int M = sc.nextInt();
            //파리 수 배열로 입력
            int[][] fly = new int[N][N];
            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    fly[i][j] = sc.nextInt();
                }
            }

            //어디에 뿌려야할지 탐색 => 델타배열 사용
            //1. 상하좌우
            int[] dr1 = {-1, 1, 0, 0};
            int[] dc1 = {0, 0, -1, 1};
            //방향키 d
            int d = 0;
            //탐색 좌표 설정
            int r = 0;
            int c = 0;
            int m = 0;

            //죽인 파리 수 합산
            int sum1 = 0;
            //최대 파리 수 저장
            int max1 = 0;

            for(r=0; r<N; r++) {
                for(c=0; c<N; c++) {
                    sum1 = fly[r][c];
                    for(d=0; d<4; d++) {
                        for(m=1; m<M; m++) {
                            int nr1 = r + dr1[d] * m;
                            int nc1 = c + dc1[d] * m;
                            //범위 설정
                            if(nr1>=0&&nr1<N&&nc1>=0&&nc1<N) {
                                sum1 = sum1 + fly[nr1][nc1];
                            }else break;
                        }
                    }

                    if(sum1>max1) {
                        max1 = sum1;
                    }
                }
            }

            //2. 대각선
            int[] dr2 = {-1, -1, 1, 1};
            int[] dc2 = {-1, 1, -1, 1};
 
            //탐색 좌표 설정
            d = 0;
            //죽인 파리 수 합산
            int sum2 = 0;
            
            //최대 파리 수 저장
            int max2 = 0;

            for(r=0; r<N; r++) {
                for(c=0; c<N; c++) {

                    sum2 = fly[r][c];
                    for(d=0; d<4; d++) {
                        for(m=1; m<M; m++) {
                            int nr2 = r + dr2[d] * m;
                            int nc2 = c + dc2[d] * m;
                            //범위 설정
                            if(nr2>=0&&nr2<N&&nc2>=0&&nc2<N) {
                                sum2 += fly[nr2][nc2];
                            }else break;
                        }
                    }
                    if(sum2>max2) {
                        max2 = sum2;
                    }
                }
            }
            //max1과 max2 중 더 큰 값 출력
            if(max1>max2) {
                System.out.println("#"+t+" "+max1);
            }else System.out.println("#"+t+" "+max2);
        }
	}
}