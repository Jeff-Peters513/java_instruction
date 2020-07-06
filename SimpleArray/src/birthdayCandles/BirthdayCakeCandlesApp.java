package birthdayCandles;

public class BirthdayCakeCandlesApp {

	public static void main(String[] args) {

		int[] ar = { 3, 2, 1, 3 };
		for (int sortAr : ar) {
			System.out.print(sortAr + " ");
		}
		System.out.println();

		int result = birthdayCakeCandles(ar);
		System.out.println(result);
	}

	static int birthdayCakeCandles(int[] ar) {

		int maxCandleHeight = Integer.MIN_VALUE;
		int maxCandleCount = 0;

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] == maxCandleHeight) {
				maxCandleCount++;
			}
			if (ar[i] > maxCandleHeight) {
				maxCandleHeight = ar[i];
				maxCandleCount = 1;
			}
		}
		return maxCandleCount;

	}

}
