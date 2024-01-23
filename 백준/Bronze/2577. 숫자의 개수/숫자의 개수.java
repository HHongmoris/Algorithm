import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        String ans = String.valueOf(A*B*C);
        char[] total = ans.toCharArray();

        int[] nums = new int[10];

        for(int i=0; i<total.length; i++){
            char c = total[i];
            nums[c-48]++;
        }
        for (int i=0; i<10; i++){
            System.out.println(nums[i]);
        }

    }
}