import java.util.Scanner;

public class Main {
	static int idx;
	static char[] jakdaegi;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			StringBuilder sb = new StringBuilder();
			//N 입력
			int N = sc.nextInt();
			//크기가 3^N인 배열 "-"로 채우기
			jakdaegi = new char[(int)Math.pow(3, N)];
			for(int i=0; i<jakdaegi.length; i++) {
				jakdaegi[i] = '-';
			}
			kanto(0, jakdaegi.length-1);
			for(int i=0; i<jakdaegi.length; i++) {
				sb.append(jakdaegi[i]);
			}
			System.out.println(sb);
		}		
	}
	
	public static void kanto(int st, int ed) {
		int mid1 = (ed-st+1)/3 - 1;	
		int mid2 = (2*(ed-st+1))/3 - 1;	
		
		//
		if(st == ed) return;
		
		
		// 1. 재귀 st ~ mid1
		kanto(st, st+mid1);
		
		// 2. 빈칸으로
		for(int i=st+mid1+1; i<=st+mid2; i++) {
			jakdaegi[i] = ' ';
		}
		
		// 3. 재귀
		kanto(st+mid2+1, ed);
	}
}