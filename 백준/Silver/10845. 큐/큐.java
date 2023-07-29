import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str){
                case("push") :
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case("pop") :
                    if(queue.isEmpty()){
                        System.out.println(-1);
                    }else {
                        System.out.println(queue.poll());
                    }
                    break;
                case("size") :
                    System.out.println(queue.size());
                    break;
                case ("empty") :
                    if(queue.isEmpty()){
                        System.out.println(1);
                    }else {
                        System.out.println(0);
                    }
                    break;
                case("front") :
                    if(queue.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(queue.peek());
                    }
                    break;
                case("back") :
                    if(queue.isEmpty()){
                        System.out.println(-1);
                    }else {
                        for (int j = 0; j < queue.size() - 1; j++) {
                            queue.add(queue.poll());
                        }
                        System.out.println(queue.peek());
                        queue.add(queue.poll());
                    }
                    break;
            }
        }
    }
}