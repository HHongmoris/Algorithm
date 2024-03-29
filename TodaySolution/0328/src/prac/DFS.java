package prac;

public class DFS {
	
	static int N;
	static int[][] adj;
	static boolean[] visited;
	
	public static void main(String[] args) {
		adj = new int[][] 
				{{ 0, 1, 1, 0, 0, 1, 0 }, 
		         { 1, 0, 0, 1, 0, 0, 1 }, 
		         { 1, 0, 0, 1, 0, 0, 0 },
		         { 0, 1, 1, 0, 0, 0, 1 },
		         { 0, 0, 0, 0, 0, 1, 1 },
		         { 1, 0, 0, 0, 1, 0, 0 }, 
		         { 0, 1, 0, 1, 1, 0, 0 } };
		N = 7;
		visited = new boolean[N];
		
		DFS(0);
	}
	
	public static void DFS(int v) {
		//v에 대한 방문 표시
		visited[v] = true;	//방문했으면 true로 바꾸기
		System.out.println(v+1);	//방문한 것 출력
		
		for(int i=0; i<N; i++) {
			if(!visited[i] && adj[v][i]==1) {	//방문 안한 곳이고 간선이 있을 때
				DFS(i);
			}
		}
		
	}
}
