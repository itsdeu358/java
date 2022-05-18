package corejava;

import java.util.Scanner;

public class ExampleOr {
	//taking value form user
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter value of a :");
		    int a = in.nextInt();
		    System.out.println("Enter value of b :");
		    int b = in.nextInt();
		    System.out.println("Enter value of c:");
		    int c = in.nextInt();
		    System.out.println("Enter value of d:");
		    int d = in.nextInt();
		    
		    //a, b, c, d displaying
		    
		    System.out.println("Value of a: "+ a);
	        System.out.println("Value of b: "+ b);
	        System.out.println("Value of b: "+ c);
	        System.out.println("Value of b: "+ d);
	        
	      //using logical OR to Verify Two constraints
	        
	        if( a<b || c==d )
	    		System.out.println("One or both" + " the conditions are true");
	    		else
	    		System.out.println("Both the" + " conditions are false");
	    		}
}
