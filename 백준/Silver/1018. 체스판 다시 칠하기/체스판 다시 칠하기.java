import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[][] chess = new char[N][M];
		char[][] chess1 = {{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, 
							{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',}, 
							{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, 
							{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',},
							{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, 
							{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',},
							{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, 
							{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',}};
		char[][] chess2 = {{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',}, 
							{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, 
							{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',},
							{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, 
							{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',},
							{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, 
							{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W',},
							{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}}; 
		
		String[] str = new String[N];
		for(int i=0; i<N; i++) {
			str[i] = sc.next();
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				chess[i][j] = str[i].charAt(j);
			}
		}
		
		int cnt1 = 0;
		int cnt2 = 0;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<N-7; i++) {
			for(int j=0; j<M-7; j++) {
				for(int r=0; r<8; r++) {
					for(int c=0; c<8; c++) {
						if(chess[i+r][j+c]!=chess1[r][c]) {
							cnt1++;
						}
					}
				}
				min = Math.min(min, cnt1);
				cnt1 = 0;
				for(int r=0; r<8; r++) {
					for(int c=0; c<8; c++) {
						if(chess[i+r][j+c]!=chess2[r][c]) {
							cnt2++;
						}
					}
				}
				min = Math.min(min, cnt2);
				cnt2 = 0;
			}
		}
		
		System.out.println(min);
	}
}