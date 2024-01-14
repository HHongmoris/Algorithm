import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[31];
        nums[0] = 1;
        for(int i=0; i<28; i++){
            int k = sc.nextInt();
            nums[k] = 1;
        }

        for(int i=1; i<31; i++){
            if(nums[i]==0){
                System.out.println(i);
            }
        }
    }
}