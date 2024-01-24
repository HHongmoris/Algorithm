import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br;
    static BufferedWriter bw;
    static Stack<Integer> stack;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        for (int n = 0; n < N; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String ord = st.nextToken();
            if (ord.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                push(x);
            } else if (ord.equals("pop")) {
                result.append(pop()).append("\n");
            } else if (ord.equals("size")) {
                result.append(size()).append("\n");
            } else if (ord.equals("empty")) {
                result.append(empty()).append("\n");
            } else if (ord.equals("top")) {
                result.append(top()).append("\n");
            }
        }

        bw.write(result.toString());
        br.close();
        bw.close();
    }

    static void push(int x) {
        stack.push(x);
    }

    static int pop() {
        return stack.empty() ? -1 : stack.pop();
    }

    static int size() {
        return stack.size();
    }

    static int empty() {
        return stack.empty() ? 1 : 0;
    }

    static int top() {
        return stack.empty() ? -1 : stack.peek();
    }
}