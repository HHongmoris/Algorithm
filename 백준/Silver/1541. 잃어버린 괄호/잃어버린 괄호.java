import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();

		String[] cal = str.split("-");
		int ans = 0;
		for(int i=0; i<cal.length; i++) {
			int sum = 0;
			String[] calc = cal[i].split("\\+");
			for(int j=0; j<calc.length; j++) {
				sum += Integer.parseInt(calc[j]);
			}
			if(i==0) {
				ans += sum;
			}else {
				ans -= sum;
			}
		}
		System.out.println(ans);
	}
}