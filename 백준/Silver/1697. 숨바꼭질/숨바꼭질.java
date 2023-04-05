
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N;
	static int K;

	//방문처리용
	static boolean[] visited;
	//작업할 큐
	static Queue<Integer> queue;
	static int time;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		K = sc.nextInt();

		visited = new boolean[100001];
		queue = new LinkedList<>();
		
		System.out.println(BFS_soomba(N));
		
	}
	
	static int BFS_soomba(int v) {
		queue.add(v);
		visited[v] = true;
		time = 0;
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			
			for(int i=0; i<size; i++) {
				
				int next = queue.poll();
				if(next==K) {
					return time;
				}

				if(next-1>=0 && next-1<=100000 && !visited[next-1]) {
					visited[next-1] = true;
					queue.add(next-1);
				}
				if(next+1>=0 && next+1<=100000 && !visited[next+1]) {
					visited[next+1] = true;
					queue.add(next+1);
				
				}
				if(next*2>=0 && next*2<=100000 && !visited[next*2]) {
					visited[next*2] = true;
					queue.add(next*2);
				}
			}
			
			time++;
			
		}
		
		return time;
	}
	
	
}