package corejava;

import java.util.Scanner;

public class exampleNOT {
				//taking value form user
	
			public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				System.out.println("Enter value of a :");
			    int a = in.nextInt();
			    System.out.println("Enter value of b :");
			    int b = in.nextInt();
			    
			   
			    //a, b, displaying
			    
			    System.out.println("Value of a: "+ a);
		        System.out.println("Value of b: "+ b);
		        
		        // Using logical NOT operator
		        
		        System.out.println("!(a < b) = " + !(a > b));
		        System.out.println("!(a > b) = " + !(a < b ));

}
}