import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long F = factorial(N);
        long ans = F/(7*24*60*60);

        System.out.println(ans);
    }

    public static long factorial(int N){
        long[] fact = new long[N+1];
        fact[0] = 1;
        fact[1] = 1;
        for(int i=2; i<N+1; i++){
            fact[i] = i*fact[i-1];
        }
        return fact[N];
    }

}