package 정렬;

import java.util.Arrays;

public class 병합정렬01 {
	
	static int[] arr;
	static int[] sortedArr = new int[arr.length];
	public static void main(String[] args) {
		arr = new int[]{6, 1, 5, 11, 30, 15, 47};
		mergeSort(arr, 0, 6);
		System.out.println(Arrays.toString(sortedArr));
	}
	
	//분할
	public static void mergeSort(int[] arr, int left, int right) {
		if(left<right) {
			int mid = (left+right)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			merge(arr, left, mid, right);
		}
	}
	
	//병합
	public static void merge(int[] arr, int left, int mid, int right) {
		int L = left;
		int R = mid+1;
		int idx = left;
		
		while(L<=mid && R<=right) {
			if(arr[L]<=arr[R]) {
				sortedArr[idx++] = arr[L++];
			}else {
				sortedArr[idx++] = arr[R++];
			}
		}
		
		if(L<=mid) {
			for(int i=L; i<mid; i++) {
				sortedArr[idx++] = arr[i];
			}
		}else {
			for(int j=R; j<right; j++) {
				sortedArr[idx++] = arr[j];
			}
		}
		for(int i=left; i<right; i++) {
			arr[i] = sortedArr[i];
		}
	}
}