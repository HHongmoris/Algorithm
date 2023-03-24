import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static int[] nums;
	static int[] ans;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//N과 M 압력
		N = sc.nextInt();
		M = sc.nextInt();
		
		nums = new int[N];
		//N개의 자연수 입력
		for(int i=0; i<N; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		ans = new int[M];
		
		perm(0, 0);
		
	}
	
	public static void perm(int idx, int vst) {
		//수 목록 오름차순으로 정렬하고 시작하기
		
		//base case
		if(idx==M) {
			for(int i=0; i<M; i++) {
				System.out.print(ans[i]+" ");
			}
			System.out.println();
			return;
		}
		
		//recursive case
		for(int i=0; i<N; i++) {
			if((vst&(1<<i))!=0) continue;
			else {
			ans[idx] = nums[i];
			perm(idx+1, (vst | (1<<i)));//썼어 다음
			}
		}
		
	}
}