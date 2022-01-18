package ui;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ThreeInputApp {

	 public static void main(String[] args) 
			 throws IOException {
	        //Scanner scan = new Scanner(System.in);
	        BufferedReader br = new BufferedReader(new 
	        		InputStreamReader(System.in));
	        
	        System.out.println("Enter int: ");
	        int i = Integer.parseInt(br.readLine());
	        
	        //double in
	        System.out.println("Enter double: ");
	        double d = Double.parseDouble(br.readLine());
	        
	        //string in
	        System.out.println("Enter string:");
	        String s = br.readLine();
	        
	        System.out.println();
	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	        
	    }

}
