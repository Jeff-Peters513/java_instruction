package ui;

public class TestingArrayApp {

	public static void main(String[] args) {
		// Array length is 6
		int[] ar = {1, 2, 3, 4, 10, 11};
		
		int result = simpleArraySum(ar);
		
		
		for (int arn : ar) {
			System.out.print(" "+arn);
		}
		
		
		System.out.println();
		System.out.println(result);
		
	}

	static int simpleArraySum(int[] ar) {
		int result = 0;
		for (int idx = 0; idx <= ar.length-1; idx++) {
			result += ar[idx];
		}
		return result;
	}
}
