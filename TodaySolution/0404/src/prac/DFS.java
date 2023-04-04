// 문제 : 다음은 연결되어있는 두 개의 정점 사이의 간선을 순서대로 나열해 놓은 것이다
// 모든 정점을 탐색하여 화면에 경로를 출력하시오. ( 시작 정점을 1로 시작하시오. )
// 입력 : 7 8
// 1 2 1 3 2 4 2 5 4 6 5 6 6 7 3 7


package prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DFS {
	static List<Integer>[] adjList;	//인접행렬
	static int V; //정점 개수
	static int E; //간선 개수
	static boolean[] visited; //방문처리
	
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
		
		
		DFS(1);
	}
	
	static void DFS(int v) {
		visited[v] = true;	//정점 지나갔으니 방문처리
		System.out.print(v+" ");	//출력
		//인접리스트 탐색(간선으로 연결되어있는지)
		for(int i=0; i<adjList[v].size(); i++) {
			int next = adjList[v].get(i);
			
			if(!visited[next]) {	//방문 안했으면 DFS 재귀 호출
				DFS(next);
			}
		}
	}
	
}
