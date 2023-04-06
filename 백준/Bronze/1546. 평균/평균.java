import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		float max = 0;
		
		float[] score = new float[N];
		for(int i=0; i<N; i++) {
			score[i] = sc.nextFloat();
			if(max<score[i]) max = score[i];
		}
		
		float sum = 0;
		for(int i=0; i<N; i++) {
			sum += (score[i]/max)*100;
		}
		System.out.println(sum/N);
	}
}