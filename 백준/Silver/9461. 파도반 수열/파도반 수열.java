import java.util.Scanner;

public class Main {
    static long[] nums = new long[101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        nums[1] = 1;
        nums[2] = 1;
        nums[3] = 1;

        for(int tc=0; tc<T; tc++){
            int N = sc.nextInt();

            System.out.println(padovan(N));

        }

    }

    static long padovan(int N){
        if(nums[N] == 0){
            nums[N] = padovan(N-2) + padovan(N-3);
        }

        return nums[N];
    }
}