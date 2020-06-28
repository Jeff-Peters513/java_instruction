package bigSum;

public class AVeryBigSumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int arCount = 5;

		// long[] ar = new long[arCount];
		long[] ar = {  1000000001, 1000000002, 1000000003, 1000000004, 1000000005 };

		long result = aVeryBigSum(ar);
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(" "+ar[i]);
		}
		System.out.println();
		System.out.println(result);
		System.out.println("5000000015");
	}

	// Complete the aVeryBigSum function below.
	static long aVeryBigSum(long[] ar) {
		long result = 0;
		for (int idx = 0; idx <= ar.length - 1; idx++) {
			result += ar[idx];
		}
		return result;
	}

}
