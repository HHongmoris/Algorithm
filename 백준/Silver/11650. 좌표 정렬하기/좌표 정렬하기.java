import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//11650 좌표 정렬하기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] nums = new int[N][2];

        for(int i=0; i<N; i++){
            for(int j=0; j<2; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(nums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]){
                    return o1[1] - o2[1];
                }else{
                    return o1[0] - o2[0];
                }
            }
        });

        for(int i=0; i<N; i++){
            System.out.println(nums[i][0]+" "+nums[i][1]);
        }
    }
}