// 문제 : 다음은 연결되어있는 두 개의 정점 사이의 간선을 순서대로 나열해 놓은 것이다
// 모든 정점을 탐색하여 화면에 경로를 출력하시오. ( 시작 정점을 1로 시작하시오. )
// 입력 : 7 8
// 1 2 1 3 2 4 2 5 4 6 5 6 6 7 3 7


package prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
	static List<Integer>[] adjList;	//인접행렬
	static int V; //정점 개수
	static int E; //간선 개수
	static boolean[] visited; //방문처리
	static Queue<Integer> queue; //작업할 큐
	
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
		}//인접리스트 완성
		
		visited = new boolean[V+1]; 
		
		for(int i=0; i<=V; i++) {
			Collections.sort(adjList[i]);
		}
		queue = new LinkedList<>();
		
		BFS(1);
		
		
	}
	
	static void BFS(int v) {
		
		queue.add(v);
		visited[v] = true;
		
		while(!queue.isEmpty()) {
			int curr = queue.poll();
			System.out.print(curr+" ");
			
			//큐에서 뽑은 curr을 시작점으로 아래 코드를 돌려야한다!!
			for(int i=0; i<adjList[curr].size(); i++) {
				int check = adjList[curr].get(i);
				if(!visited[check]) {
					queue.add(check);
					visited[check] = true;
				}
			}
				
			
		}
	}
	
}
