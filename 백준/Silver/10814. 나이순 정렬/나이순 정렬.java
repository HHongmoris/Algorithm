import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String[][] name = new String[N][2];
        
        for(int i=0; i<N; i++) {
        	for(int j=0; j<2; j++) {
        		name[i][j] = sc.next();
        	}
        }
        
        Arrays.sort(name, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
        	
		});
        
        for(int i=0; i<N; i++) {
        	System.out.println(name[i][0]+" "+name[i][1]);
        }
    }
}