package swea;



import java.util.Scanner;

public class swea1949_1 {
    static int N;
    static int K;
    static int[][] map;
    static int max;            //최대 높이
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int cnt;            //등산로 거리 계산
    static boolean[][] visited;    //방문처리
    static boolean useK;    //공사 여부 판단
    static int maxC;        //최대 이동거리
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //테스트 케이스 수 입력
        int T = sc.nextInt();
        
        for(int t=1; t<=T; t++) {
            
            N = sc.nextInt();    //한 변의 길이
            K = sc.nextInt();    //최대 공사 가능 깊이
            
            //지도 입력
            map = new int[N][N];
            max = 0;     //최고 봉우리 높이
            
            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    map[i][j] = sc.nextInt();
                    max = Math.max(max, map[i][j]);
                }
            }    //입력 완료
            
            //가장 높은 등산로 찾고 거기서 root 탐색
            maxC = 0;
            
            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    
                    if(map[i][j]==max) {
                        
                        visited = new boolean[N][N];    //초기화
                        useK = false;        //초기화
                        
                        maxF = Integer.MIN_VALUE;
                        
                        root(i, j, 1);
                        
                        maxC = Math.max(maxC, maxF);
                    }
                }
            }
            
            System.out.println("#"+t+" "+maxC);
        }
    }
    
    static int maxF;
    
    static void root(int r, int c, int cnt) {
        
        visited[r][c] = true;    //방문처리
        
        //현재 지점에서 사방 탐색
        for(int d=0; d<4; d++) {
            int nr = r + dr[d];
            int nc = c + dc[d];
            
            if(nr>=0&&nr<N&&nc>=0&&nc<N) {
                
                //반환 조건
                if(visited[nr][nc] || (useK && map[r][c]<=map[nr][nc])) continue;
                
                           
                //현 위치보다 주변이 낮을 때 이동하고 카운트
                if(map[r][c]>map[nr][nc]) {
 
                    root(nr, nc, cnt+1);
                  
                    visited[nr][nc] = false;

                    //주변 높이가 현재 높이보다 높을 때
                }else if (map[r][c]<=map[nr][nc]) {    
                    //공사 안했고 높이차가 K 이하일 때 -> 공사 가능
                    if(!useK && map[nr][nc]-map[r][c] <= K) {
                        
                        int temp = map[nr][nc];
                        
                        //공사 사용
                        useK = true;
                        //현재 위치보다 1 낮춤
                        map[nr][nc] = map[r][c] - 1;
            
                        root(nr, nc, cnt+1);
                                  
                        useK = false;
                        //현재 위치보다 1 낮춤
                        map[nr][nc] = temp;
                        visited[nr][nc] = false;
                        
                        
                        
                    }else{    //공사 이미 했거나 불가
                        continue;
                    }
                }
            }
        } 
        
        if(maxF < cnt) maxF = cnt;
        
    }
}