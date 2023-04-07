import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		//N과 M 입력
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		//탈 곳과 목적지 2차 배열로 입력
		int[][] stop = new int[N][2];
	
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			stop[i][0] = Integer.parseInt(st.nextToken());	//출발점
			stop[i][1] = Integer.parseInt(st.nextToken());	//도착점
		}
		

		Arrays.sort(stop, (o1, o2) -> {
			if(o1[1] == o2[1]) {
				return Integer.compare(o1[0], o2[0]);
			}else {
				return Integer.compare(o1[1], o2[1]);
			}
		});
		
		long fr = 0;
		long ed = 0;
		long sum = 0;
		
		//초기값 설정
		for(int i=0; i<N; i++) {
			if(stop[i][0]>stop[i][1]) {
				fr = stop[i][0];
				ed = stop[i][1];
				sum = fr - ed;
				break;
			}
		}
		
		for(int i=0; i<N; i++) {
			if(stop[i][0]>stop[i][1]) {				
				if(fr<stop[i][1]) {	//새로운 마디 시작
					fr = stop[i][0];
					ed = stop[i][1];
					sum += fr-ed;
				}else {	//겹칠 때
					if(fr<stop[i][0]) {	//st가 새로운 선 안에 있을 때
						sum += stop[i][0] - fr;
						fr = stop[i][0];
					}
				}
			}
		}
		
		long total = M + 2*sum;
		System.out.println(total);

	}
}