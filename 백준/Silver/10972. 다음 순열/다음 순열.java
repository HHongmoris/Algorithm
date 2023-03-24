import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int arr[] = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		if(nextP(arr)) {
			for(int n : arr) {
				sb.append(n).append(" ");
			}
			System.out.println(sb.toString());
		}else {
			System.out.println(-1);
		}
		
	}
	
	
	//next-permutation
	//
	public static boolean nextP(int[] p) {
		int N = p.length;
		
		//기준 찾기
		int originIdx = N-2;
		
		//자신 뒤에 수가 나보다 크면 기준이 될 수 있음
		//뒤에서부터 접근하면서 p[originIdx] 보다 큰 p[originIdx+1]을 찾아야함
		while(originIdx >= 0 && p[originIdx] >= p[originIdx+1]) {
			--originIdx;
		}
		
		//맨 앞까지 왔는데 타겟, 기준 없음 -> 내림차순으로 순열이 정렬되었다.
		if(originIdx == -1) return false;
		
		
		//기준과 swap할 타겟 찾기
		int targetIdx = N-1;
		
		while(p[targetIdx] <= p[originIdx]) {
			targetIdx--;
		}
		
		//기준과 타겟 교환
		swap(p, originIdx, targetIdx);
		
		int k=N-1;
		
		int i=originIdx+1;
		
		while(i<k) {
			swap(p, i++, k--);
		}
		
		return true;
	}
	
	
	//배열에서 서로 바꾸는 swap 메소드
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[b];
		arr[b] = arr[a];
		arr[a] = temp;
	}
}