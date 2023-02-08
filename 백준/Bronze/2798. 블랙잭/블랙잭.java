import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] num = new int[N];
		
		//N개 숫자 배열로 입력
		for(int i=0; i<N; i++) {
			num[i] = sc.nextInt();
		}
		
		int ans = 0;
		for(int a=0; a<N; a++) {
			for(int b=0; b<N; b++) {
				for(int c=0; c<N; c++) {
					if( a!=b && b!=c && c!=a) {
						int sum = num[a]+num[b]+num[c];
						if( sum <= M) {
							if( sum > ans) {
								ans = sum;
							}
						}
					}
					
					
				}
			}
		}
		System.out.println(ans);
	}
}