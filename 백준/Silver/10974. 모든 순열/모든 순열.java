import java.util.Scanner;

public class Main {
	static int[] nums;
	static int N;
	static int[] ans;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//N 입력
		N = sc.nextInt();
		
		nums = new int[N];
		for(int i=0; i<N; i++) {
			nums[i] = i+1;
		}
		ans = new int[N];
		
		permutation(0, 0);
		
	}
	
	public static void permutation(int idx, int vst) {
		//base case
		if(idx == N) {
			for(int i=0; i<N; i++) {
				System.out.print(ans[i]+" ");
				
			}
			System.out.println();
			return;
		} 
			

		//recursive case
		for(int j=0; j<N; j++) {
			//vst가 방문한 위치 말해주기 때문에 & 쓰고 0이 아니면 이전에 방문했다!
			if((vst&(1<<j)) != 0) {
				continue;
			}
			ans[idx] = nums[j];
			permutation(idx+1, (vst | (1<<j)));
			
		}		
		
	}
}