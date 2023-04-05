package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Dijkstra {
	static class Node{
		int v, w;

		public Node(int v, int w) {
			this.v = v;
			this.w = w;
		}
		
		
	}
	
	static final int INF = Integer.MAX_VALUE;
	static int V, E;	//V: 정점, E: 간선
	static List<Node>[] adjList; //인접리스트
	static int[] dist;	//최단 길이를 저장할 배열
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(input);
		
		V = sc.nextInt();
		E = sc.nextInt();
		
		adjList = new ArrayList[V];
		for(int i=0; i<V; i++) {
			adjList[i] = new ArrayList<>();
		}
		
		dist = new int[V];
		Arrays.fill(dist, INF);
		
		//입력 받기
		for(int i=0; i<E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int W = sc.nextInt();
			
			//유향 그래프
			adjList[A].add(new Node(B, W)); //인접리스트 노드 추가
			//아래의 한줄 코드가 위의 4줄을 커버하지만 익숙치 않은 상황이라면 자제할 것
//			adjList[sc.nextInt()].add(new Node(sc.nextInt(), sc.nextInt()));
			
		}
		dijkstra(0);
		
		System.out.println(Arrays.toString(dist));
		
	}
	
	
	private static void dijkstra(int start) {
		boolean[] visited = new boolean[V];
		
		dist[start] = 0; //시작 노드까지의 거리는 0
		
		
		for(int i=0; i<V-1; i++) {
			int min = INF;
			int idx = -1;
			
			//선택하지 않은 정점 중 dist가 가장 짧은 것을 골라
			for(int j=0; j<V; j++) {
				if(!visited[j] && min>dist[j]) {
					min = dist[j];
					idx = j;
				}
			}
			
			if(idx == -1) break; //선택할 친구 없다 =-> 멈춰
			
			visited[idx] = true; //선택
			
			//갱신할 수 있으면 갱신
			for(int j=0; j<adjList[idx].size(); j++) {
				Node curr = adjList[idx].get(j);
				
				//방문하지 않았고, 연결도 되었고 (인접행렬일 때나 해당)
				//이미 가지고 있는 값보다 더 굉장한 값이 있다면 갱신
				if(!visited[curr.v] && dist[curr.v]>dist[idx] + curr.w)
					dist[curr.v] = dist[idx] + curr.w;
			}
		}
	}


	static String input = "6 11\r\n" 
			+ "0 1 4\r\n" 
			+ "0 2 2\r\n" 
			+ "0 5 25\r\n" 
			+ "1 3 8\r\n" 
			+ "1 4 7\r\n" 
			+ "2 1 1\r\n" 			 	
			+ "2 4 4\r\n" 
			+ "3 0 3\r\n" 
			+ "3 5 6\r\n" 
			+ "4 3 5\r\n" 
			+ "4 5 12\r\n" + "";
}