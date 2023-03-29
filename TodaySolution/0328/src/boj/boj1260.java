package boj;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class boj1260 {
	static int N;
	static int M;
	static boolean[] visited;
	static LinkedList<Integer>[] list;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//N, M, V 입력
		N = sc.nextInt();
		M = sc.nextInt();
		int V = sc.nextInt();
		
		visited = new boolean[N+1];
		list = new LinkedList[N+1];
		
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
		visited[v] = true;
		System.out.print(v+" ");
		
		for(int i=0; i<list[v].size(); i++) {
			int next = list[v].get(i);
			if(!visited[next]) {
				DFS(next);
			}
		}
	}
	
	public static void BFS(int v) {
		visited[v] = true;
		System.out.print(v+" ");
		
		for(int i=0; i<list[v].size(); i++) {
			if(!visited[i] && list[v].contains(i)) {
				BFS(v);
			}
		}
		
	}
	
}
