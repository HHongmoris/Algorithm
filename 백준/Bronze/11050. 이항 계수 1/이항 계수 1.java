import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int nfac = 1;
        for(int i=N; i>N-K; i--){
            nfac = nfac*i;
        }
        int kfac = 1;
        for(int i=1; i<K+1; i++){
            kfac = kfac*i;
        }

        System.out.println((nfac/kfac));
    }
}