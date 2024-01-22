import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = new int[N];
        int[] sums = new int[N];
        int[] maxs = new int[N];

        sums[0] = Integer.MIN_VALUE;
        maxs[0] = Integer.MIN_VALUE;
        if(N>1){
            for (int i=0; i<N; i++){
                nums[i] = sc.nextInt();
                if(i>0){
                    sums[i] = nums[i] + nums[i-1];
                    if(i==1){
                        maxs[i] = sums[i];
                    }else{
                        maxs[i] = Math.max(sums[i], maxs[i-1]+nums[i]);
                    }
                }
            }
            int max = Integer.MIN_VALUE;
            for(int i=0; i<N; i++){
                int k = Math.max(nums[i], maxs[i]);
                max = Math.max(k, max);
            }
            System.out.println(max);
        }else {
            nums[0] = sc.nextInt();
            System.out.println(nums[0]);
        }
    }
}