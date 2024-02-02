import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String key = st.nextToken();
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            int count = 1;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                count = count * (entry.getValue()+1);
            }
            sb.append(count-1 + "\n");

        }
        System.out.print(sb);
    }
}