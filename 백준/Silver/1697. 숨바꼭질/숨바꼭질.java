import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N;
    static int K;
    static boolean[] visited;
    static Queue<Integer> queue;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();
        visited = new boolean[100001];
        queue = new LinkedList<>();

        int time = BFS(N);
        System.out.println(time);
    }

    static int BFS(int start) {
        queue.add(start);
        visited[start] = true;
        int time = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int current = queue.poll();

                if (current == K) {
                    return time;
                }

                if (current - 1 >= 0 && !visited[current - 1]) {
                    visited[current - 1] = true;
                    queue.add(current - 1);
                }
                if (current + 1 <= 100000 && !visited[current + 1]) {
                    visited[current + 1] = true;
                    queue.add(current + 1);
                }
                if (2 * current <= 100000 && !visited[2 * current]) {
                    visited[2 * current] = true;
                    queue.add(2 * current);
                }
            }

            time++;
        }

        return time;
    }
}