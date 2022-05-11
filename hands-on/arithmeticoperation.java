package corejava;
import java.util.Scanner;

public class arithmeticoperation {

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter first number :");
    int num1 = in.nextInt();
    System.out.println("Enter second number :");
    int num2 = in.nextInt();   
    int addition 		= num1 + num2;
    int substraction 	= num1 - num2;
    int multiplication 	= num1 * num2;
    int division	    = num1 / num2;
    int percentage	    = num1 % num2;
    System.out.println("addition : "         + addition);
    System.out.println("substraction : "  + substraction);
    System.out.println("multiplication : "     + multiplication);
    System.out.println("division : "    + division);
    System.out.println("percentage "      + percentage);
}
}