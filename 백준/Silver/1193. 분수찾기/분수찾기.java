import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i = 0;
		while(N>0) {
			i++;
			N = N - i;
			
		}
		int k = i+N;
		if(i%2==0) {
			System.out.println(k + "/" + (i+1-k));			
		}else {
			System.out.println((i+1-k) + "/" + k);						
		}
	}

}