import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 수 입력
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			//숫자 개수 N 입력
			int N = sc.nextInt();
			//N개 숫자 입력
			//우선순위 큐로 입력받기
			PriorityQueue<Integer> nums = new PriorityQueue<>();
			
			for(int i=0; i<N; i++) {
				nums.add(sc.nextInt());
			}
			//출력
			System.out.print("#"+t);
			while(!nums.isEmpty()) {
				System.out.print(" "+nums.poll());
			}
			System.out.println();
			
		}
	}
}