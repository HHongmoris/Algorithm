import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        if(A<B){
            System.out.println((B-A-1));
            for (long i=A+1; i<B; i++){
                System.out.print(i+" ");
            }

        } else if (A==B) {
            System.out.println(0);
        }else {
            System.out.println((A-B-1));
            for (long i=B+1; i<A; i++){
                System.out.print(i+" ");
            }
        }


    }
}