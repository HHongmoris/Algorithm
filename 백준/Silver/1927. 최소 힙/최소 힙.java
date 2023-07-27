import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> nums = new PriorityQueue<>();

        for(int i=0; i<N; i++){
            int x = Integer.parseInt(br.readLine());
            if(x==0){
                if(nums.isEmpty()){
                    System.out.println(0);
                }else {
                    System.out.println(nums.poll());
                }
            }else {
                nums.add(x);
            }
        }
    }
}