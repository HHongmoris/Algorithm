import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] room = new int[N];
        for(int tr=0; tr<N; tr++){
            room[tr] = sc.nextInt();
        }
        int B = sc.nextInt();
        int C = sc.nextInt();

        long cnt = 0;

        for (int i=0; i<N; i++){
            int a = room[i]-B;
            cnt++;
            if(a > 0){
                if((a%C) == 0){
                    cnt = cnt + a/C;
                }else {
                    cnt = cnt + a/C + 1;
                }
            }
        }
        System.out.println(cnt);
    }
}