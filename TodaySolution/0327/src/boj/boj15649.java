package boj;

import java.util.Scanner;

public class boj15649 {
	static int N;
	static int M;
	static int[] nums;
	static int[] ans;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		nums = new int[N];
		ans = new int[M];
		
		for(int i=0; i<N; i++) {
			nums[i] = i+1;
		}
		
		perm(0, 0);
		
	}
	
//	public static void comb(int idx, int sidx) {
//		//base case
//		if(sidx==M) {
//			for(int i=0; i<M; i++) {
//				System.out.print(ans[i]+" ");
//			}
//			System.out.println();
//			return;
//		}
//		
//		//recursive case
//		for(int i=idx; i<=(N-M+sidx); i++) {
//			ans[sidx] = nums[i];
//			comb(i+1, sidx+1);
//		}
//		
//	}
	
	public static void perm(int idx, int vst) {
		if(idx == M) {
			for(int i=0; i<M; i++) {
				System.out.print(ans[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<N; i++) {
			if((vst&(1<<i))!=0) {
				continue;
			}
			
			ans[idx] = nums[i];
			perm(idx+1, (vst|(1<<i)));
		}
		
		
	}
}
