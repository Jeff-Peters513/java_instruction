package diagonalDifference;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifferenceApp {

	public static void main(String[] args) {
		List<List<Integer>> arr = new ArrayList<>();

		// create Arraylists to enter data then load 3x3 List "arr" above
		List<Integer> arr1 = new ArrayList<>();
		List<Integer> arr2 = new ArrayList<>();
		List<Integer> arr3 = new ArrayList<>();

		arr1.add(11);
		arr1.add(2);
		arr1.add(4);

		arr2.add(4);
		arr2.add(5);
		arr2.add(6);

		arr3.add(10);
		arr3.add(8);
		arr3.add(-12);

		arr.add(arr1);
		arr.add(arr2);
		arr.add(arr3);

		// following was used to confirm arrayList contained correct content
//		for (List<Integer> obj : arr) {
//			List<Integer> temp = obj;
//
//			for (Integer job : temp) {
//				System.out.print(job + " ");
//			}
//			System.out.println();
//		}

		int result = diagonalDifference(arr);

		System.out.println(result);
	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		// Write your code here
		int n = arr.size();
		int d1 = 0;
		int d2 = 0;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				// find sum of primary diagonal d1
				if (i == j) {
					d1 += arr.get(i).get(j);
				}
				// find sum of secondary diagonal d2
				if (i == n - j - 1) {
					d2 += arr.get(i).get(j);
				}
			}
		}
		return Math.abs(d1 - d2);
	}

}
