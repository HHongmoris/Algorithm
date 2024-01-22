import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] nums = new int[N];
        int[] sums = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(st.nextToken());
            if(i>0){
                sums[i] = sums[i-1]+nums[i];
            }else{
                sums[i] = nums[i];
            }
        }

        for(int t=0; t<M; t++){
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;
            if(i<j){
                if(i!=0){
                    sum = sums[j] - sums[i-1];
                }else {
                    sum = sums[j];
                }
            }else {
                sum = nums[i];
            }
            bw.write(sum +"\n");
        }
        bw.close();

    }
}