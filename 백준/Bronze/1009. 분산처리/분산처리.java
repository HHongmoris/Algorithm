import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int tc=0; tc<T; tc++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int c = 1;
            int ans = 0;
            for(int i=1; i<=b; i++){
                c = (c * a)%10;

                if(c == 0){
                    ans = 10;
                    break;
                }else{
                    ans = c;
                }
            }

            System.out.println(ans);

        }
    }
}