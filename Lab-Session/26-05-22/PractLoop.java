package corejava;
//write a do-while loop that asks the user to enter two numbers. 
//The numbers should be added and the sum displayed.
//The loop should ask the user whether he or she wishes to perform the operation again.
//If so, the loop should repeat; otherwise it should terminate.
import java.util.Scanner;
//creating class
 class PractLoop {
	//main method 
	public static void main (String [] args) {
		Scanner Sc = new Scanner(System.in);
		//creating integer
	    int sum = 0;
	    char op;
	    //do while loop 
	    do{
	      System.out.println("Enter two numbers");
	      int num1= Sc.nextInt();
	      int num2 = Sc.nextInt();
	      sum = sum+num1+num2;
	      System.out.println("Do you wish to perform another operation, Y/N");
	      op =Sc.next().charAt(0);
	    }while(op =='Y'||op=='y');
	    System.out.println("sum "+sum);
	  }
	}