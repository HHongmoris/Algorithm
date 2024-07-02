import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        String[] str = S.trim().split(" ");
        int ans = str.length;
        if(str[0].equals("")){
            ans = 0;
        }
        System.out.println(ans);
    }
}