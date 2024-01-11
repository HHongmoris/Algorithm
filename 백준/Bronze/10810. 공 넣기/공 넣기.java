import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N];
        for(int t=0; t<M; t++){
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;
            int k = sc.nextInt();

            for(int ball=i; ball<=j; ball++){
                basket[ball] = k;
            }
        }

        for(int i=0; i<N; i++){
            System.out.print(basket[i]+" ");
        }
    }
}