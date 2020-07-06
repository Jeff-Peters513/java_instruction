package miniMaxSum;

import java.util.Arrays;

public class miniMaxSummApp {

	public static void main(String[] args) {
		// HankerRank Mini-Max Sum

		int[] arr = { 1, 3, 5, 7, 9 };
		// int[] arr = { 7, 69, 2, 221, 8974 };
		// int[] arr = { 5, 3, 1, 4, 2 };
//		for (int pSortArr : arr) {
//			System.out.print(pSortArr + " ");
//		}
		// System.out.println();
		miniMaxSum(arr);

	}

	static void miniMaxSum(int[] arr) {
		// add the larger 4 and add the smallest 4 of an array of 5;
		// display the two results with a space between them
		// may have to use long vs int for result
		// 1<= arr^i <= 10^9
		Arrays.sort(arr);
//		for (int sortArr : arr) {
//			System.out.print(sortArr + " ");
//		}

		int arrayLength = arr.length;
		// System.out.println();
		// System.out.println(arrayLength);

		// small number starting at array index 0
		long smallSum = 0;
		for (int i = 0; i <= arrayLength - 2; i++) {
			smallSum += arr[i];
		}
		long largeSum = 0;
		for (int i = 1; i <= arrayLength - 1; i++) {
			largeSum += arr[i];
		}

		System.out.println(smallSum + " " + largeSum);

	}

}
