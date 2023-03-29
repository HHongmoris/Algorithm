package boj;

import java.util.Scanner;

public class boj1991 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//노드 개수 입력
		int N = sc.nextInt();
		
		String[][] tree = new String[N][3];
		for(int i=0; i<N; i++) {
			for(int j=0; j<3; j++) {
				tree[i][j] = sc.next();
			}
		}
		
		//전위 순회
		for(int i=0; i<N; i++) {
			if(tree[i][1].equals(".")) {
				
			}
			
		}
		
	}
	
	public static void preorder(String[][] tree) {
		//base case
		
		
		//recursive case
		int i=0;
		if(!(tree[i][1].equals("."))) {
			i--;
		}else {
			System.out.print(tree[i][1]);
			
		}
	}
}
