package boj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class boj1753 {
	static class Node{
		int v;	//도착지점
		int w;	//가중치

		public Node(int v, int w) {
			this.v = v;
			this.w = w;
		}	
	}
	
	static int V;	//정점 개수
	static int E;	//간선 개수
	static List<Node>[] adjList;	//인접리스트
	static int[] dist;	//시작 정점부터 i까지 최소 길이 저장할 배열
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		V = sc.nextInt();
		E = sc.nextInt();
		//시작 정점
		int start = sc.nextInt();
		
		adjList = new ArrayList[V+1];
		
		for(int i=0; i<=V; i++) {
			adjList[i] = new ArrayList<>();
		}
		//정점과 간선 입력
		for(int i=0; i<E; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();
			
			adjList[u].add(new Node(v, w));
		}
		//입력 완료
		
		dist = new int[V+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		
		Dijkstra(start);
		for(int i=1; i<=V; i++) {
			if(dist[i] == Integer.MAX_VALUE) {
				System.out.println("INF");
			}else {
				System.out.println(dist[i]);
			}
		}
		
	}
	
	static void Dijkstra(int s) {
		boolean[] visited = new boolean[V+1];
		
		dist[s] = 0;	//시작노드부터 시작노드까지 거리 0
		
		for(int i=0; i<V; i++) {
			int min = Integer.MAX_VALUE;
			int idx = -1;
			
			//선택하지 않은 정점 중 dist가 가장 짧은 것을 고른다
			for(int j=0; j<=V; j++) {
				if(!visited[j] && min>dist[j]) {
					min = dist[j];
					idx = j;
				}
			}
			
			//선택한 것이 없으면 멈춤
			if(idx == -1) break;
			
			//선택할 때
			visited[idx] = true;
			
			//갱신가능하면 갱신
			for(int j=0; j<adjList[idx].size(); j++) {
				Node curr = adjList[idx].get(j);

				//방문 안하고 연결되어있고 이미 가지고 있는 값보다 좋은 값이 있다면 갱신
				if(!visited[curr.v] && dist[curr.v] > dist[idx]+curr.w) {
					dist[curr.v] = dist[idx]+curr.w;
				}
			}
			
			
		}
		
		
	}
	
	
}
