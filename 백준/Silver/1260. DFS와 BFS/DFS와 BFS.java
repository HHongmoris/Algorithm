import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static boolean[] visited1;
	static boolean[] visited2;
	static LinkedList<Integer>[] list;
	static Queue<Integer> queue; 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//N, M, V 입력
		N = sc.nextInt();
		M = sc.nextInt();
		int V = sc.nextInt();
		
		visited1 = new boolean[N+1];
		visited2 = new boolean[N+1];
		list = new LinkedList[N+1];
		queue = new LinkedList<>();
		
		for(int i=0; i<=N; i++) {
			list[i] = new LinkedList<Integer>();
		}
		
		//간선이 연결하는 두 정점 번호 리스트에 입력
		for(int i=0; i<M; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			list[v1].add(v2);
			list[v2].add(v1);
		}
		
		for(int i=0; i<=N; i++) {
			Collections.sort(list[i]);
		}
		
		DFS(V);
		System.out.println();
		BFS(V);
		
	}
	
	public static void DFS(int v) {
		//v 방문하면 true
		visited1[v] = true;
		System.out.print(v+" ");
		
		for(int i=0; i<list[v].size(); i++) {
			int next = list[v].get(i);
			if(!visited1[next]) {
				DFS(next);
			}
		}
	}
	
	public static void BFS(int v) {
		queue.add(v);
		visited2[v] = true;
		
		while(!queue.isEmpty()) {
			int curr = queue.poll();
			System.out.print(curr+" ");
			
			for(int i=0; i<list[curr].size(); i++) {
				int next = list[curr].get(i);
				if(!visited2[next]) {
					queue.add(next);
					visited2[next] = true;
				}
			}
		}
		
	}
	
}