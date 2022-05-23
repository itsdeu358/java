package corejava;

import java.util.Scanner;

public class EgSumArray {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		// Input three numbers from user
        System.out.println("Enter first number :");
        int num1 = in.nextInt();
        System.out.println("Enter second number :");
        int num2 = in.nextInt();
        System.out.println("Enter third number");
        int num3 =in.nextInt();
        
        //addition of three no
        int sum 		= num1 + num2 + num3;
        //printing the sum of three no
        System.out.println(" sum:"  + sum );
	}
	

}
