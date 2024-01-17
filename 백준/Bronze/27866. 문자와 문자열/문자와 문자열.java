import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int i = sc.nextInt();

        char C = S.charAt(i-1);
        System.out.println(C);
    }
}