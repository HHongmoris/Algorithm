import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] board;
    static boolean[] visited;
    static int N;
    static int Min = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        board = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);

        System.out.println(Min);
    }

    public static void dfs(int idx, int depth) {
        if(depth == N / 2) {
            int startTeam = 0, linkTeam = 0;

            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) { // 중복 방지
                    if (visited[i] && visited[j]) {
                        startTeam += board[i][j];
                        startTeam += board[j][i];
                    }
                    else if (!visited[i] && !visited[j]) {
                        linkTeam += board[i][j];
                        linkTeam += board[j][i];
                    }
                }
            }

            // 두 팀의 점수 차이 (절댓값)
            int val = Math.abs(startTeam - linkTeam);

            if (val == 0) {
                System.out.println(val);
                System.exit(0);
            }

            Min = Math.min(val, Min);
            return;
        }

        for (int i = idx; i < N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }
}