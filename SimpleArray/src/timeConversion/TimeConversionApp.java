package timeConversion;


public class TimeConversionApp {

	public static void main(String[] args) {
		// this app converts 12 hour time to 24 hour time
		
		//String s = "12:00:01AM";
		//String s = "04:05:45AM";		
		String s = "12:01:45PM";
		//String s = "01:05:45PM";
		//String s = "07:05:45PM";
		System.out.println(s);
		
		String result = timeConversion(s);
		
		System.out.println(result);
		
	}

	static String timeConversion(String s) {
		//process s to find if any processing is needed
		//if yes add 12 hours, if no then print time with no AM or PM
		
		//split string into parts
		String[] timeParts = s.split(":");
		String hour = timeParts[0];
		String minute = timeParts[1];
		String secondXm = s.substring(6, 8);
		String secXmSplit = s.substring(8);
		
		int hourInt = Integer.parseInt(hour);
				
		boolean pm = secXmSplit.equalsIgnoreCase("pm") ? true : false;
		boolean midhr = (hourInt == 12) ? true : false;	
		
//		int milHour = 00;
//		if (midhr == true && pm == false) {
//			milHour = 00;
//		}else if (midhr == false && pm == false) {
//			milHour = hourInt;
//		}else if (midhr == true && pm == true) {
//			milHour = hourInt;
//		}else{
//			milHour = hourInt + 12;
//		}
		
		String result ="";
		if (midhr == true && pm == false) {
			result = "00" +":"+ minute +":"+ secondXm;
		}else if (midhr == false && pm == false) {
			result = hour +":"+ minute +":"+ secondXm;
		}else if (midhr == true && pm == true) {
			result = hour +":"+ minute +":"+ secondXm;
		}else{
			result = (hourInt + 12) +":"+ minute +":"+ secondXm;
		}
	
		return result;
	}

}
