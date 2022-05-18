package corejava;

import java.util.Scanner;

public class ExampleRelation {
	//taking value form user
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value of a :");
	    int a = in.nextInt();
	    System.out.println("Enter value of b :");
	    int b = in.nextInt();
	
	    //a, b displaying
	    
	    System.out.println("Value of a: "+ a);
        System.out.println("Value of b: "+ b);
        
        //showing relation operations
        
        System.out.println("a == b = " + (a != b) );
  	  //is not equal to
  	  
  	  System.out.println("a != b = " + (a >= b) );
  	  
  	  //Greater than
  	  System.out.println("a >  b = " + (a <  b) );
  	  
  	  //Less than
  	  System.out.println("a <  b = " + (a >  b) );
  	  
  	  //Greater than or equal to
  	  System.out.println("a >= b = " + (a >= b) );
  	  
  	  //Less than or equal to
  	  System.out.println("a <= b = " + (a <= b) );
  }
}
