import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String sum;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			sum = br.readLine();
			st = new StringTokenizer(sum);
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			bw.write("Case #"+(i+1)+": "+A+" + "+B+" = "+(A+B)+"\n");
		}
		bw.close();
	}
}