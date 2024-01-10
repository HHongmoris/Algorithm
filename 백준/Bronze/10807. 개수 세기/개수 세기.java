import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = new int[201];
        for(int i=0; i<N; i++){
            int m = sc.nextInt();
            nums[m+100]++;
        }

        int t = sc.nextInt();
        System.out.println(nums[t+100]);
    }
}