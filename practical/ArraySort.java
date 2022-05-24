package corejava;
//Java Program to Sort Array of Integers
//by Default Sorts in an Ascending Order
//using Arrays.sort() Method



//Importing Arrays class from the utility class
import java.util.Arrays;
//Main class                                            
public class ArraySort {



  // Main driver method
  public static void main(String[] args)
  {
      // Custom input array
      int[] arr = { 3425, 6587, 3455, 1345, 1235, 5468 }; // SD Array



      // Applying sort() method over to above array
      // by passing the array as an argument
      Arrays.sort(arr);



      // Printing the array after sorting
      System.out.println("Modified arr[] : %s" + Arrays.toString(arr));
  }
}
