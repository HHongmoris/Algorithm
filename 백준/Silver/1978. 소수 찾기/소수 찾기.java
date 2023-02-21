import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//N과 숫자 배열nums 입력 받기
		int N = sc.nextInt();
		int[] nums = new int[N];
		for(int i=0; i<N; i++) {
			nums[i] = sc.nextInt();
		}
		//전체 숫자 수(N)에서 소수가 아닌 수들 빼기
		int ans = N;
		for(int i=0; i<N; i++) {
			if(nums[i]==1) {
				ans -= 1;
			}else if(nums[i]==2) {
				ans = ans;
			}else {
				for(int j=2; j<nums[i]; j++) {
					if(nums[i]%j == 0) {
						ans-=1;
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}
}