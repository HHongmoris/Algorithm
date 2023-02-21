import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//두 수 A와 B를 String으로 입력받기
		String A = sc.next();
		String B = sc.next();
		//문자열을 char배열로 변환
		char[] arrA = A.toCharArray();
		char[] arrB = B.toCharArray();
		
		//arrA와 arrB 배열 뒤집기
		//임시 변수 temp을 사용해서 뒤집는다.
		for(int i=0; i<arrA.length/2; i++) {
			char temp1 = arrA[i];
			arrA[i] = arrA[arrA.length-1-i];
			arrA[arrA.length-1-i] = temp1;
			char temp2 = arrB[i];
			arrB[i] = arrB[arrA.length-1-i];
			arrB[arrB.length-1-i] = temp2;
		}
		//뒤집은 배열을 다시 string으로 변환
		String reA = String.valueOf(arrA);
		String reB = String.valueOf(arrB);
		//string을 int로
		int numA = Integer.parseInt(reA);
		int numB = Integer.parseInt(reB);
		
		//대소비교
		if(numA>numB) {
			System.out.println(numA);
		}else {
			System.out.println(numB);
		}		
	}
}