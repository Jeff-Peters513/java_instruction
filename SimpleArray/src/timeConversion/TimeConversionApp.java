package timeConversion;

import java.time.LocalTime;

public class TimeConversionApp {

	public static void main(String[] args) {
		// this app converts 12 hour time to 24 hour time
		
		String s = "07:05:45PM";
		System.out.println(s);
		
		String result = timeConversion(s);
		
		System.out.println(result);
		
	}

	static String timeConversion(String s) {
		//process s to find if any processing is needed
		//if yes add 12 hours, if no then print time with no AM or PM
		
		//split string into usefull parts
		String[] timeParts = s.split(":");
		String hour = timeParts[0];
		String minute = timeParts[1];
		String secondXm = timeParts[2];
		String secXmSplit = s.substring(8); 
		
		//process to convert if need be
		
		//prepare result to send back in 24 hour format
		
		
		String result = hour + minute + secondXm;
		
		return result;
	}

}
