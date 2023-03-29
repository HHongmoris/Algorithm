package prac;
//반복문
public class Test02 {
	public static void main(String[] args) {
		String[] sel = {"삼", "우", "참"};
		int N = sel.length;
		int[] str = new int[N];
		String t = "";
		for(int i=0; i<2; i++) {
			if(i!=0) {
				t+=sel[0];
			}else t+="";
			for(int j=0; j<2; j++) {
				if(j!=0) {
					t+=sel[1];
				}else t+="";
				for(int k=0; k<2; k++) {
					if(k!=0) {
						t+=sel[2];
					}else t+="";
					System.out.println(t);
				}
			}
		}
	}
}
