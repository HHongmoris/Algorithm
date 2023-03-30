package boj;

import java.util.LinkedList;
import java.util.Scanner;

public class boj2170 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//전부 두배를 해서 연결이 안된 부분을 찾는다
		//리스트에 배열로 받아서 끊어진 부분들을 구분할 수 있도록 설정
		
		//N 입력
		int N = sc.nextInt();
		//x, y를 2차 배열로 받으면서 x의 최소값, y의 최대값 함께 구하기
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int[][] line = new int[N][2];
		for(int i=0; i<N; i++) {
			line[i][0] = sc.nextInt();
			min = Math.min(line[i][0], min);
			line[i][1] = sc.nextInt();
			max = Math.max(line[i][1], max);
			
		}
		//연결이 이어지는 곳을 true로 표시할 boolean 배열 newLine 선언
		boolean[] newLine = new boolean[2*(max-min+1)];
		//입력받은 x, y 좌표를 각각 2배하여 그 사이를 true로 입력
		for(int i=0; i<N; i++) {
			for(int j=2*line[i][0]; j<=2*line[i][1]; j++) {
				newLine[j] = true;
			}
		}
		//얼마나 true인가 카운트하는 카운팅 리스트 선언
		LinkedList<Integer>[] cntLine = new LinkedList[newLine.length];
		//		System.out.println(Arrays.toString(cntLine));
//		System.out.println(newLine.length);
		int cnt = 0;
		for(int i=0; i<newLine.length; i++) {
		    cntLine[i] = new LinkedList<Integer>();
		    if(newLine[i]) {
		        cntLine[cnt].add(i);
		        if(!newLine[i+1]) cnt++;
		    }
		}
		int length = 0;
		for(int i=0; i<=cnt; i++) {
		    if(cntLine[i].size() >= 2) {
		        length += (cntLine[i].getLast() - cntLine[i].getFirst()) / 2;
		    }
		}
		
		System.out.println(length);
		
	}
}