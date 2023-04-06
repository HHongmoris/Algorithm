package swea;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class swea7465 {
	static int N;	//마을에 사는 사람 수(정점 수)
	static int M;	//관계 수(간선 수)
	static List<Integer>[] adjList; //인접리스트
	static boolean[] visited;
	static int cnt;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();	//테스트케이스 수 입력
		for(int t=1; t<=T; t++) {
			N = sc.nextInt();
			M = sc.nextInt();
			adjList = new ArrayList[N+1];
			visited = new boolean[N+1];
			
			for(int i=0; i<=N; i++) {
				adjList[i] = new ArrayList<>();
			}
			
			//서로 아는 사람의 번호 입력
			for(int i=0; i<M; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				//무향 그래프 이므로 인접리스트에 각각 추가
				adjList[a].add(b);
				adjList[b].add(a);
			}
			//입력 완료

			cnt = 0;
			for(int i=1; i<=N; i++) {
				if(DFS(i)) cnt++;
			}
			
			sb.append("#"+t+" "+cnt+"\n");
			
		}
		System.out.println(sb);
	}

	//관계 있는 사람 번호 지나가면 방문처리
	static boolean DFS(int v) {
		if(visited[v])
			return false;
		visited[v] = true;
		for(int i=0; i<adjList[v].size(); i++) {
			int next = adjList[v].get(i);	
			DFS(next);
		}
		
		return true;
	}
}
