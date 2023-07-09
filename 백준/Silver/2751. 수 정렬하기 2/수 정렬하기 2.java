import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		//우선순위 큐 사용하여 정렬
		PriorityQueue<Integer> nums = new PriorityQueue<>();
		for(int i=0; i<N; i++) {
			nums.add(Integer.parseInt(br.readLine()));
		}

		for(int i=0; i<N; i++) {
			bw.write(String.valueOf(nums.poll()+"\n"));
		}
		bw.close();
	}
}