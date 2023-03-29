package prac;
//비트마스킹 사용
public class Test3 {
	public static void main(String[] args) {
		String[] sel = {"삼", "우", "참", "불", "햄"};
		int N = sel.length;
		for(int i=0; i<(1<<N); i++) {
			String tmp = "";
			for(int j=0; j<N; j++) {
				if((i&(1<<j))!=0) {
					tmp+=sel[j];
				}
			}
			System.out.println(tmp);
		}
		
	}
}
