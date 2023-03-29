package boj;


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class boj1764 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		Map<String, Integer> mapL = new HashMap<>();
		for(int i=0; i<N; i++) {
			mapL.put(sc.next(), 1);
		}
		
		PriorityQueue<String> ans = new PriorityQueue<>();
		for(int i=0; i<M; i++) {
			String key = sc.next();
			if(mapL.containsKey(key)==true) {
				ans.add(key);
			}
		}
		
		System.out.println(ans.size());
		while(!ans.isEmpty()) {
			System.out.println(ans.poll());
		}
		
		
	}
}