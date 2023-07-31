import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        PriorityQueue<Integer> nums = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                nums.add(sc.nextInt());
            }
        }

        for(int i=0; i<N-1; i++){
            nums.poll();
        }
        System.out.println(nums.poll());
    }
}