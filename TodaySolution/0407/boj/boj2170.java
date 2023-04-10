package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class boj2170 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] line = new int[N][2];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			line[i][0] = Integer.parseInt(st.nextToken());
			line[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(line, (o1, o2) -> {
			if(o1[0]==o2[0]) {
				return Integer.compare(o1[1], o2[1]);
			}else {
				return Integer.compare(o1[0], o2[0]);
			}
		});
		
		int fr = line[0][0];
		int ed = line[0][1];
		long sum = ed - fr;
		
		for(int i=0; i<N; i++) {
			if(line[i][0]>ed) {
				fr = line[i][0];
				ed = line[i][1];
				sum += ed - fr;
			}else {
				if(line[i][1]>ed) {
					sum += line[i][1] - ed;
					ed = line[i][1];					
				}
			}
		}
		
		System.out.println(sum);
		
	}
}
