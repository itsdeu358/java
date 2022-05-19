package corejava;

import java.util.Scanner;

public class multipleif {
	public static void main(String[] args) {
		int d;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value of a :");
	    int a = in.nextInt();
	    System.out.println("Enter value of b :");
	    int b = in.nextInt();
	    System.out.println("Enter value of c:");
	    int c = in.nextInt();
	    
	    //a, b, c displaying
	    
	    System.out.println("Value of a: "+ a);
        System.out.println("Value of b: "+ b);
        System.out.println("Value of b: "+ c);
        
     // using logical AND & OR to Verify Two constraints
        if((a<b) && (b==c)) {
        	d=a+b+c;
            System.out.println("Sum is: " + d);
        }
        else if( a>b || b==c ) {
    		System.out.println("One or both" + " the conditions are true");
    		}
        else {
    		System.out.println("Both the" + " conditions are false");
        }
		
        
        // Using logical NOT operator
        
        System.out.println("!(a < b) = " + !(a > b ));
        System.out.println("!(a > b) = " + !(a < b ));

        System.out.println("a == b = " + (a != b) );
        
        //showing relation operations
        //is not equal to
          System.out.println("a == b = " + (a != b) );
          
    	  //is equal to
    	  System.out.println("a != b = " + (a == b) );
    	  
    	  //less than
    	  System.out.println("a >  b = " + (a <  b) );
    	  
    	  //Greater than
    	  System.out.println("a <  b = " + (a >  b) );
    	  
    	  //Greater than or equal to
    	  System.out.println("a >= b = " + (a >= b) );
    	  
    	  //Less than or equal to
    	  System.out.println("a <= b = " + (a <= b) );
    }
}
	
    
    	 

