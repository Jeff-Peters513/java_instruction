package pangrams;

import java.util.Arrays;
import java.util.List;

public class PangramsApp {

	public static void main(String[] args) {
		// first case is a pangram
		String s = "We promptly judged antique ivory buckles for the next prize";
		// second case is not pangram
		//String s = "We promptly judged antique ivory buckles for the prize";
		//third case the alphabet is pangram
		//String s = "abcdefghijklmnopqrstuvwxyz";

		String result = pangrams(s);
		System.out.println(result);
		System.out.println();
		// System.out.println(result.length());
	}

	private static String pangrams(String s) {
		String lwrS = s.toLowerCase().replace(" ", "").trim();
		List<String> alphabet = Arrays.asList("abcdefghijklmnopqrstuvwxyz".split(""));
		List<String> sAsList = Arrays.asList(lwrS.split(""));
		
		boolean containsAllLetters = sAsList.containsAll(alphabet);

		String result = containsAllLetters == true ? "pangram" : "not pangram";

		return result;
	}

//method 2
//	static String pangrams(String s) {
//		String lwrCase = s.toLowerCase().replace(" ", "").trim();
//
//		boolean[] mark = new boolean[26];
//		int index = 0;
//
//		for (int i = 0; i < lwrCase.length(); i++) {
//
//			if ('a' <= lwrCase.charAt(i) && lwrCase.charAt(i) <= 'z') {
//				index = lwrCase.charAt(i) - 'a';
//			} else
//				continue;
//			mark[index] = true;
//		}
//		for (int i = 0; i <= 25; i++) {
//			if (mark[i] == false)
//				return "not pangram";
//		}
//		return "pangram";
//	}

}
