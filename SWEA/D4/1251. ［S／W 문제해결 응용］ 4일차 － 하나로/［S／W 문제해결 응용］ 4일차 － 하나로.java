import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
	static int[] p;	//대표 저장할 배열
	
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
			
			//섬들의 좌표를 활용하여 정점과 간선의 배열로 새롭게 선언
			//섬들을 모두 잇는 간선의 개수 : (Nx(N-1))/2
			int idx = 0;
			int road = (N*(N-1))/2;
			double[][] edges = new double[road][3];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(i<j) {
						edges[idx][0] = i;	//첫번째 정점
						edges[idx][1] = j;	//이어지는 정점
						edges[idx][2] = (Math.pow(island[i][0]-island[j][0], 2)+Math.pow(island[i][1]-island[j][1], 2));
						idx++;
					}
				}
			}
			
			//크루스칼 1단계 : 간선 정렬(오름차순)
			Arrays.sort(edges, new Comparator<double[]>() {

				@Override
				public int compare(double[] o1, double[] o2) {
					return Double.compare(o1[2], o2[2]);
				}
			});
			
			//크루스칼 2단계
			// - V-1개의 간선을 뽑는데, 사이클이 발생 안하는 것들만 뽑기
			p = new int[N];
			for(int i=0; i<N; i++){
				makeset(i);
			}
			
			double ansRoad = 0;	//최소 길이 저장할 곳
			int pick = 0;		//뽑은 간선 수
			
			for(int i=0; i<road; i++) {
				//i 번째 간선 체크
				int x = (int) edges[i][0];
				int y = (int) edges[i][1];
				
				//x와 y의 대표가 다르면 사이클 아님
				if(findset(x) != findset(y)) {
					union(x, y);
					ansRoad += edges[i][2];
					pick++;
				}
				
				if(pick == N-1) break;
			}
			
			double ans = E*ansRoad;
			System.out.println("#"+t+" "+Math.round(ans));
			
		}
		
	}
	
	//메서드 만들기
	static int findset(int x) {
		if(x != p[x]) {
			p[x] = findset(p[x]);
		}
		return p[x];
	}
	
	static void makeset(int x) {
		p[x] = x;
	}
	
	static void union(int x, int y) {
		p[findset(y)] = findset(x);
	}
	
}