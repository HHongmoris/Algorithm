// 문제 : 다음은 연결되어있는 두 개의 정점 사이의 간선을 순서대로 나열해 놓은 것이다
// 모든 정점을 탐색하여 화면에 경로를 출력하시오. ( 시작 정점을 1로 시작하시오. )
// 입력 : 7 8
// 1 2 1 3 2 4 2 5 4 6 5 6 6 7 3 7


package prac;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class testBFS {
	static int V;	//정점 개수
	static int E;	//간선 개수
	static List<Integer>[] adjList; 	//인접리스트
	static boolean[] visited;	//방문처리할 배열
	static Queue<Integer> queue;	//BFS 작업할 큐
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		V = sc.nextInt();
		E = sc.nextInt();
		adjList = new ArrayList[V+1];
		
		for(int i=0; i<=V; i++) {
			adjList[i] = new ArrayList<>();
		}
		for(int i=0; i<E; i++) {
			int st = sc.nextInt();
			int ed = sc.nextInt();
			
			adjList[st].add(ed);
			adjList[ed].add(st);
		}
		//인접리스트 완성
		
		visited = new boolean[V+1];
		queue = new LinkedList<>();
		
		BFS(1);
		
		
	}
	
	static void BFS(int v) {
		//시작점 방문처리하고 큐에 넣기
		visited[v] = true;
		queue.add(v);
		
		//큐가 빌때까지 반복수행
		//인접리스트로 연결된 것은 방문처리와 함께 큐에 추가
		while(!queue.isEmpty()) {
			//큐에서 빼고 출력
			int a = queue.poll();
			System.out.print(a+" ");
			
			//a와 연결된 정점들 탐색
			for(int i=0; i<adjList[a].size(); i++) {
				int b = adjList[a].get(i);
				if(!visited[b]) {
					queue.add(b);
					visited[b] = true;
				}
			}
			
		}
	}
}
