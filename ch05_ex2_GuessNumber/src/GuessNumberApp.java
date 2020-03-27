// import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumberApp {
    
    private static void displayWelcome(int limit) {
        System.out.println("Guess the number!");
        System.out.println("I'm thinking of a number from 1 to " + limit);
        System.out.println();
    }
    
    public static int getRandomInt(int limit) {
        double d = Math.random() * limit;   // d is >= 0.0 and < limit
        int randomInt = (int) d;            // convert double to int
        randomInt++;                        // int is >= 1 and <= limit
        return randomInt;
    }

    public static void main(String[] args) {
        final int LIMIT = 10;
        
        displayWelcome(LIMIT);
        int number = getRandomInt(LIMIT);

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);            
        int count = 1;
        int guess = 0;
        while (true) {
        	System.out.print("Your guess: ");
            if (sc.hasNextInt()) {
                guess = sc.nextInt();
               sc.nextLine();
            } else {     
            	System.out.println("Error! Entry has to be a whole number. \n Try Again.\n");
             	sc.nextLine();
             	continue;
            }
            
         /* try/catch statement
          *  try {guess = sc.nextInt();}        
          // catch (InputMismatchException ime) {
           * 	System.out.println("Error! Entry has to be a whole number. \n Try Again.\n");
           * 	sc.nextLine();
           * 	continue;
           */
           
            if (guess < 1 || guess > LIMIT) {
                System.out.println("Invalid guess. Try again.");
                continue;
            }
            
            if (guess < number) {
                System.out.println("Too low.");
            } else if (guess > number) {
                System.out.println("Too high.");
            } else {
                // added the + number + to confirm the coded only uses 
            	// first number entered if user inputs two numbers with space in between
            	System.out.println("You guessed it!   " + number+ "\n in " +
                                   count + " tries.\n");
                break;
            }            
            count++;
        }
   
    }   
}