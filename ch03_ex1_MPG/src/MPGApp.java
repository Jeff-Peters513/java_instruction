import java.text.NumberFormat;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;


@SuppressWarnings("unused")
public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            String miles = sc.next();
            
            System.out.print("Enter gallons of gas used: ");
            String gallons = sc.next();
            
            //  double mpg = miles/gallons;
            //  NumberFormat number = NumberFormat.getNumberInstance();
            //  number.setMaximumFractionDigits(2);
            
            // BigDecimal code
            BigDecimal imiles = new BigDecimal(miles);
            BigDecimal igallons = new BigDecimal(gallons);
            
            BigDecimal mpg = imiles.divide(igallons, 2, RoundingMode.HALF_UP);
              
            
            System.out.println("Miles per gallon is " + mpg + ".");
            System.out.println(); 
            
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        System.out.println("Bye!");
    }

	// private static void setScale(int i, RoundingMode halfUp) {
		// TODO Auto-generated method stub
		
	{

	// private static double round(double d) {
		// TODO Auto-generated method stub
		// return 0;
	}
    
}
