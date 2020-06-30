package diagonalDifference;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifferenceApp {

	public static void main(String[] args) {
		 List<List<Integer>> arr = new ArrayList<>();
		 
		 //create Arraylists to enter data then load 3x3 List "arr" above
		 List<Integer> arr1 = new ArrayList<>();
		 List<Integer> arr2 = new ArrayList<>();
		 List<Integer> arr3 = new ArrayList<>();
		 
		 arr1.add(11);
		 arr1.add(2);
		 arr1.add(4);
		 
		 arr2.add(4);
		 arr2.add(5);
		 arr2.add(6);
		 
		 arr3.add(10);
		 arr3.add(8);
		 arr3.add(-12);
		 
		 arr.add(arr1);
		 arr.add(arr2);
		 arr.add(arr3);
		 
		 for (List<Integer> obj: arr) {
			 	List<Integer> temp = obj;
			 
			 for (Integer job : temp) {
				 System.out.print(job+" ");
			 }
			 System.out.println();
		 }
		 
		 System.out.println(arr.get(0));
		 
		 //original line => int result = Result.diagonalDifference(arr);
		 int result = diagonalDifference(arr);
		 
		 System.out.println(result);
		 
	}

	  public static int diagonalDifference(List<List<Integer>> arr) {
		    // Write your code here
		  	int result =0;
		  	int[] l1 = new int [3];
		  			  	
		  		
		  	
		  return result;
		    }
	
	
}
