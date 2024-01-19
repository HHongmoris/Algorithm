import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nums = new int[9][9];
        int max = Integer.MIN_VALUE;
        int maxI = Integer.MIN_VALUE;
        int maxJ = Integer.MIN_VALUE;
        for(int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                nums[i][j] = sc.nextInt();
                if (max<nums[i][j]){
                    max = nums[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((maxI+1)+" "+(maxJ+1));
    }
}