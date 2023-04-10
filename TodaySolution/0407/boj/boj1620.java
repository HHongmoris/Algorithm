package boj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class boj1620 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
//		List<Character>[] pokemon = new ArrayList[N];
//		
////		String[] pokemon = new String[N];
//		for(int i=0; i<N; i++) {
//			pokemon[i] = sc.next().toCharArray();
//		}
//		
		HashMap<Integer, String> pokemon = new HashMap<>();
		
		for(int i=0; i<N; i++) {
			pokemon.put(i, sc.next());
		}
		
		for(int i=0; i<M; i++) {
			
			
		}
	}
}
