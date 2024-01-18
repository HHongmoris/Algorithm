import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> nums = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<N; i++){
            int x = Integer.parseInt(br.readLine());
            if(x==0){
                if(nums.isEmpty()){
                    bw.write(0+"\n");
                }else {
                    int k = nums.poll();
                    bw.write(k + "\n");
                }
            }else {
                nums.add(x);
            }
        }
        bw.close();
    }
}