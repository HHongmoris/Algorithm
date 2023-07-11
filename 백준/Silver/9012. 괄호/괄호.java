import java.util.Scanner;
import java.util.Stack;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int T = sc.nextInt();
			
			for(int tc=0; tc<T; tc++) {
				//문자열 입력
				String str = sc.next();
				
				char[] A = str.toCharArray();
				
				boolean pass = true;
				//스택을 통해서 비교
				Stack<Character> check = new Stack<>();
				for(int i=0; i<A.length; i++) {
					if(A[i]=='(') {
						check.add(A[i]);
					}else if(A[i]==')') {
						if(check.isEmpty()) {
							pass = false;
							break;
						}else {
							check.pop();
						}
					}
				}
				
				if(check.isEmpty()) {
					if(pass) {
						System.out.println("YES");						
					}else {
						System.out.println("NO");
					}
				}else {
					System.out.println("NO");
				}
				
			}
		}
}