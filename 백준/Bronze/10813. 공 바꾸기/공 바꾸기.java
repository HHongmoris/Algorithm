import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] ball = new int[N+1];
        for(int i=1; i<N+1; i++){
            ball[i] = i;
        }
        for(int i=0; i<M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int t = ball[a];
            ball[a] = ball[b];
            ball[b] = t;
        }

        for(int i=1; i<N+1; i++){
            System.out.print(ball[i]+" ");
        }

    }
}