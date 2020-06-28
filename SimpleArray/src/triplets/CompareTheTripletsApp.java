package triplets;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTripletsApp {

	public static void main(String[] args) {
		// compare the array elements of two arrays with each other
		// then assign 1 point to the larger value
		// 0 for the same value
		// print out put to a new 2 element array containing the score

		List<Integer> a = new ArrayList<>();
		a.add(17);
		a.add(28);
		a.add(30);
		System.out.println("Alice " + a);

		List<Integer> b = new ArrayList<>();
		b.add(99);
		b.add(16);
		b.add(8);
		System.out.println("Bob " + b);

		System.out.println();
		List<Integer> result = compareTriplets(a, b);
		System.out.println(" " + result);
	}

	private static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> result = new ArrayList<>();
		int aSum = 0;
		int bSum = 0;
		// compare the List and assign points
		for (int idx = 0; idx <= 2; idx++) {
			if (a.get(idx) == b.get(idx)) {
				// neither receives the point
			} else if (a.get(idx) > b.get(idx)) {
				aSum++;
			} else if (b.get(idx) > a.get(idx)) {
				bSum++;
			}
		}
		// set values in results array
		result.add(0, aSum);
		result.add(1, bSum);
		
		return result;
	}

}
