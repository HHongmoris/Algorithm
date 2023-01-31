import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args) {
		//ArrayList로 List 생성
		List<Integer> ndnList = new ArrayList<Integer>();
		
		//만든 리스트에 0부터 10000까지 채움
		for(int i=0; i<=10000; i++) {
			ndnList.add(i);
		}
		
		//d(n)이 가능한 L을 설정하여 위의 리스트에서 모든 L 값 제거
		for(int a=0; a<10; a++) {
			for(int b=0; b<10; b++) {
				for(int c=0; c<10; c++) {
					for(int d=0; d<10; d++) {
						int L = 1001*a + 101*b + 11*c +2*d;

						ndnList.remove(Integer.valueOf(L));
					}
				}
			}
		}
		//L 제거하고 남은 셀프넘버 출력
		for(int x : ndnList) {
			System.out.println(x);
		}
	}
}