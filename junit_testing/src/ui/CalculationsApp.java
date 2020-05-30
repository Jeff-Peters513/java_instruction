package ui;

import java.util.Scanner;

import business.BasicCalculations;

public class CalculationsApp {

	public static void main(String[] args) {
		System.out.println("Hi!");
		
		//load in scanner
				Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		    int nbr = sc.nextInt();
		    	int squareNbr = BasicCalculations.square(nbr);
		    	
    	System.out.println("The Square of "+nbr+" is "+squareNbr+".");
		System.out.println("");
		System.out.println("");
		String s1 = uit.Console.getString("Enter a sentance to count a's from: ");
    	int n2 = BasicCalculations.countA(s1);
    	System.out.println("Number of a's: "+ n2);
    	System.out.println("");
		System.out.println("");
    	System.out.println("Bye");
    
    	//close scanner to release resources
       	sc.close();
		
		

	}

}
