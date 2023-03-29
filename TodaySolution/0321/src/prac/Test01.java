package prac;
//부분집합 모두 구하기
public class Test01 {
	static String[] 재료 = {"참", "우", "삼"};
	static int N;
	static boolean[] sel;
	
	public static void main(String[] args) {
		N = 3;
		sel = new boolean[N];
		
		powerset(0);
	}
	
	public static void powerset(int idx) {
		//base case : 재귀 빠져나가는 조건
		if(idx==N) {
			String tmp = "";
			for(int i=0; i<N; i++) {
				if(sel[i]) {
					tmp += 재료[i];
				}
			}
			System.out.println(tmp);
			return;
		}
		
		//recursive : 자신을 호출하는 조건
		sel[idx] = true;
		powerset(idx+1);
		
		sel[idx] = false;
		powerset(idx+1);
	}
	
}
