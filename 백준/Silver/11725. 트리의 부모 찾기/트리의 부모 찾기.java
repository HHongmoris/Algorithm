import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int N;
	static List<Integer>[] adjList;
	static boolean[] visited;
	static int[] tree;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		adjList = new ArrayList[N+1];
		tree = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			adjList[i] = new ArrayList<>();
		}
		for(int i=1; i<N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			adjList[a].add(b);
			adjList[b].add(a);
		}
		visited = new boolean[N+1];
		
		DFS(1);
		

		for(int i=2; i<=N; i++) {
			System.out.println(tree[i]);
		}
		

	}
	
	static void DFS(int v){
		visited[v] = true;
		
		for(int i=0; i < adjList[v].size(); i++) {
			int conn = adjList[v].get(i);
			if(!visited[conn]) {
				tree[conn] = v;
				DFS(conn);
			}
		}
		
	}
}
