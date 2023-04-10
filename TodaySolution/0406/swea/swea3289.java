package swea;

import java.util.Scanner;


public class swea3289 {
	static int[] p;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb;
		//테스트케이스 수
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			sb = new StringBuilder();
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			p = new int[n+1];
			for(int i=0; i<=n; i++) {
				makeset(i);
			}
			
			for(int i=0; i<m; i++) {
				int func = sc.nextInt();
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				if(func == 0) {
					//두 집합을 통합
					union(a, b);
				}else if(func == 1) {
					//a와 b를 포함하는 집합이 같은지 확인
					if(findset(a)==findset(b)) {
						sb.append(1);
					}else sb.append(0);
				}
				
			}
			System.out.println("#"+t+" "+sb);
		}

	}
	
	//x를 포함하는 집합을 찾는 연산
	static int findset(int x) {
		if(x != p[x]) {
			p[x] = findset(p[x]);
		}
		return p[x];
	}
	//x, y를 포함하는 두 집합을 통합
	static void union(int x, int y) {
		p[findset(y)] = findset(x);
	}
	//멤버 x를 포함하는 새로운 집합 생성
	static void makeset(int x) {
		p[x] = x;
	}
	
}
