package corejava;

import java.util.Scanner;

public class ExampleOp {
	

//taking value form user
	
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
        
      //using logical AND to Verify Two constraints
        
        if((a<b) && (b==c)) {
        	d=a+b+c;
            System.out.println("Sum is: " + d);
        }

 

        else 
            System.out.println("False Condition");
    }

}

