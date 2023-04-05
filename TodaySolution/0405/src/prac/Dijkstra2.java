package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Dijkstra2 {
	static class Node{
		int v;
		int w;
		
		public Node(int v, int w) {
			this.v = v;
			this.w = w;
		}
	}
	
	static int V;
	static int E;
	static List<Node>[] adjList;	//인접리스트
	static int[] dist;	//시작정점부터 i까지의 최소 길이 저장한 배열
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(input);

		V = sc.nextInt();
		E = sc.nextInt();
		
		adjList = new ArrayList[V];
		for(int i=0; i<V; i++) {
			adjList[i] = new ArrayList<>();
		}
		
		dist = new int[V];
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		for(int i=0; i<E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int W = sc.nextInt();
			
			adjList[A].add(new Node(B, W));
		}
		
		dijkstra(0);
		
		System.out.println(Arrays.toString(dist));
		
		
	}
	
	static void dijkstra(int s) {
		boolean[] visited = new boolean[V];
		
		dist[s] = 0;
		
		for(int i=0; i<V-1; i++) {
			int min = Integer.MAX_VALUE;
			int idx = -1;
			
			
			//선택하지 않은 정점 중 dist가 가장 짧은 것을 고른다
			for(int j=0; j<V; j++) {
				if(!visited[j] && min>dist[j]) {
					min = dist[j];
					idx = j;
				}
			}
			
			if(idx==-1) break; //선택한 것이 없다
			
			visited[idx] = true;
			
			//갱신할 수 있으면 갱신
			for(int j=0; j<adjList[idx].size(); j++) {
				Node curr = adjList[idx].get(j);
				
				if(!visited[curr.v] && dist[curr.v]>dist[idx] + curr.w) {
					dist[curr.v] = dist[idx] + curr.w;
				}
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

