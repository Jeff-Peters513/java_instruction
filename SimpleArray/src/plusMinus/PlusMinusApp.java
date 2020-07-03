package plusMinus;

import java.text.NumberFormat;

public class PlusMinusApp {

	public static void main(String[] args) {
		// Plus Minus code challenge from HackerRank

		// test case 01
		int[] arr = { -4, 3, -9, 0, 4, 1 };

		// test case 11
		//int[] arr = { 1, 2, 3, -1, -2, -3, 0, 0 };

		plusMinus(arr);

	}

	static void plusMinus(int[] arr) {
		// receive and process array per instructions
		// print out results from this method
		double pos = 0;
		double neg = 0;
		double zero = 0;

		int n = arr.length;
		System.out.println(n);

		for (int i = 0; i < n; i++) {
			int nbr = arr[i];
			if (nbr == 0)
				zero++;
			if (nbr > 0)
				pos++;
			if (nbr < 0)
				neg++;
		}
		// calculate the fractions and print out & round to 6 decimal places
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(6);
		number.setMinimumFractionDigits(6);

		String posR = number.format(pos / n);
		String negR = number.format(neg / n);
		String zeroR = number.format(zero / n);
		System.out.println(posR);
		System.out.println(negR);
		System.out.println(zeroR);
		// System.out.println("pos " + pos / n);
		// System.out.println("pos " + (double) Math.round((pos / n) * 1000000) /
		// 1000000);
		// System.out.println("neg " + neg / n);
		//System.out.println("neg " + (double) Math.round((neg / n) * 1000000) / 1000000);
		// System.out.println("zero " + zero / n);
		//System.out.println("zero " + (double) Math.round((zero / n) * 1000000) / 1000000);

	}// method

}// class
