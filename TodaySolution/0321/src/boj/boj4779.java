package boj;

import java.util.Scanner;

public class boj4779 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			//N 입력
			int N = sc.nextInt();
			//크기가 3^N인 배열 "-"로 채우기
			char[] jakdaegi = new char[(int)Math.pow(3, N)];
			for(int i=0; i<jakdaegi.length; i++) {
				jakdaegi[i] = '-';
			}
			
			
		}
		
	}
	
	public static void kanto(int N) {
		int bar = (int)Math.pow(3, N-1);
		
		//base case
		if(bar==1) {
			return;
		}
		//recursive case
		
		
		
	}
}
