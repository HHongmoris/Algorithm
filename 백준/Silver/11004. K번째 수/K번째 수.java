import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		PriorityQueue<Integer> nums = new PriorityQueue<>();
		
		for(int i=0; i<N; i++) {
			int a = Integer.parseInt(st.nextToken());
			nums.add(a);
		}
		
		for(int i=0; i<K-1; i++) {
			nums.poll();
		}
		
		System.out.println(nums.peek());
		
		bw.close();
		
	}
}