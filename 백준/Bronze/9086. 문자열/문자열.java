import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int t=0; t<T; t++){
            String S = sc.next();
            int size = S.length();

            if (size<2){
                System.out.println(S+S);
            }else{
                char start = S.charAt(0);
                char end = S.charAt(size-1);
                System.out.println(start +""+ end);
            }

        }


    }
}