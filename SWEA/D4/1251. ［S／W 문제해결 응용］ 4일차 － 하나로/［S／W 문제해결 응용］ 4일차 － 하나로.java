import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {
	static class Edge implements Comparable<Edge>{
		int st;
		int ed;
		double w;
		
		public Edge(int st, int ed, double w) {
			this.st = st;
			this.ed = ed;
			this.w = w;
		}

		@Override
		public int compareTo(Edge o) {
			return Double.compare(this.w, o.w);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//테스트 케이스 입력
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			//섬 개수 N 입력
			int N = sc.nextInt();
			
			
			//섬의 위치와 간선을 저장할 배열 선언
			int[][] island = new int[N][2];
			for(int i=0; i<N; i++) {
				island[i][0] = sc.nextInt(); //x좌표
			}
			for(int i=0; i<N; i++) {
				island[i][1] = sc.nextInt(); //y좌표
			}
			
			//환경 부담 세율 입력
			double E = sc.nextDouble();
			
			//인접 리스트
			List<Edge>[] adjList = new ArrayList[N];
			
			for(int i=0; i<N; i++) {
				adjList[i] = new ArrayList<>();
			}

			int road = (N*(N-1))/2;
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(i<j) {
						int A = i;	//첫번째 정점
						int B = j;	//이어지는 정점
						//가중치
						double W = (Math.pow(island[i][0]-island[j][0], 2)+Math.pow(island[i][1]-island[j][1], 2));
						
						adjList[A].add(new Edge(A, B, W));
						adjList[B].add(new Edge(B, A, W));
						
					}
				}
			}
			
			//방문처리
			boolean[] visited = new boolean[N];
			
			PriorityQueue<Edge> pq = new PriorityQueue<>();
			
			//시작 정점 뽑고 시작
			visited[0] = true;
			
			pq.addAll(adjList[0]);
			
			//뽑은 정점 개수(시작점 뽑고 시작해서 1로 시작)
			int pick = 1;
			double ansRoad = 0;
			
			//pick < N 이면 계속 뽑기
			while(pick != N) {
				Edge e = pq.poll();
				if(visited[e.ed]) continue; //연결된 정점 뽑았으면 다음으로
				
				ansRoad += e.w;		//가중치 더하기
				pq.addAll(adjList[e.ed]);	//pq에 연결된 정점 정보 추가
				visited[e.ed] = true;		//방문처리!
				pick++;		//뽑은 정점 개수 카운트
			}
			
			//환경 부담금 계산
			double ans = E*ansRoad;
			System.out.println("#"+t+" "+Math.round(ans));
			
		}
		
	}
}