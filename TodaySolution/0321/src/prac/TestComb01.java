package prac;

import java.util.Arrays;

public class TestComb01 {
	static String[] 재료 = {"소고기", "돼지", "닭", "패티", "많이"};
	static int N = 재료.length;
	static int R = 3;
	static String[] sel = new String[R];
	public static void main(String[] args) {
		combination(0, 0);
	}
	
	public static void combination(int idx, int sidx) {
		//base case
		if(sidx==R) {
			System.out.println(Arrays.toString(sel));
			return;
		}
		if(idx==N) {
			return;
		}
		
		//recursive case
		sel[sidx] = 재료[idx];
		combination(idx+1, sidx+1);
		combination(idx+1, sidx);
		
	}
}
