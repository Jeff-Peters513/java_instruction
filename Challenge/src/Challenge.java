
public class Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			  
		
				  
		getMiddle("test");
			  }
			

	private static String getMiddle(String str) {
		int nbr = str.length();
		if (nbr % 2 == 0) {
			String mLtrs = ""; 
			System.out.println("even");
			int mChar = nbr/2;
			System.out.println(mChar);
			mLtrs += str.charAt(mChar-1) + str.charAt(mChar);
			System.out.print(str.charAt(mChar-1));
			System.out.print(str.charAt(mChar));
			return mLtrs;
			
		} else {
			System.out.println("odd");
			int mChar = nbr/2 +1;
			String mLetter = "";
			System.out.println(mChar);
			System.out.println(str.charAt(mChar-1));
			mLetter += str.charAt(mChar-1);
			return mLetter;
		}
		
	}

}
