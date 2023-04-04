// 문제 : 다음은 연결되어있는 두 개의 정점 사이의 간선을 순서대로 나열해 놓은 것이다
// 모든 정점을 탐색하여 화면에 경로를 출력하시오. ( 시작 정점을 1로 시작하시오. )
// 입력 : 7 8
// 1 2 1 3 2 4 2 5 4 6 5 6 6 7 3 7


package prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class testDFS {
	static int V;	//정점 수
	static int E;	//간선 수 
	static List<Integer>[] adjList;	//인접리스트 활용
	static boolean[] visited;	//방문처리 할 배열
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		V = sc.nextInt();
		E = sc.nextInt();
		//인접리스트 초기화 선언
		//정점이 1부터 V까지라서 인덱스를 맞춤
		adjList = new ArrayList[V+1];
		for(int i=0; i<=V; i++) {
			adjList[i] = new ArrayList<>();
			
		}
		//방문처리할 배열 초기화
		visited = new boolean[V+1];
		
		//인접리스트에 연결된 정점들 입력
		for(int i=0; i<E; i++) {
			int st = sc.nextInt();
			int ed = sc.nextInt();
			
			adjList[st].add(ed);
			adjList[ed].add(st);
		}
		//정점 정렬
		for(int i=0; i<=V; i++) {
			Collections.sort(adjList[i]);
		}
		
		//1부터 시작
		DFS(1);
		

		
	}
	
	//DFS 메서드
	static void DFS(int v) {
		//v 방문하면 방문처리
		visited[v] = true;
		//방문한 곳 출력
		System.out.print(v);
		
		//v와 연결된 정점 탐색
		for(int i=0; i<adjList[v].size(); i++) {
			int conn = adjList[v].get(i);
			if(!visited[conn]) {
				DFS(conn);
			}
		}
		
	}
}
