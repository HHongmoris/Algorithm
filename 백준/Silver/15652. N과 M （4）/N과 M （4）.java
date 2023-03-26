import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int[] ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        ans = new int[M];
        comb(0, 1);
    }

    public static void comb(int idx, int start) {
        //base case
        if(idx == M) {
            for(int i=0; i<M; i++) {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
            return;
        }

        //recursive case
        for(int i=start; i<=N; i++) {
            ans[idx] = i;
            comb(idx+1, i);
        }

    }
}