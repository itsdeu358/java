package corejava;
//Java Program showcasing uses of call by value in this eg
//Importing java input output classes
import java.io.*;
public class CallByValue {
//Method to swap numbers
	static void swap(int a, int b)
	{
		//creating a temporary variable in stack memory
		//and updating values in it.
		//step 1
		int temp =a;
		//step 2
		a=b;
		//step 3
		b=temp;
		//This variables vanish as scope is over
		System.out.println("Values after swapping x="+a+" y="+b);
	}
	//Main driver method
	public static void main(String[] args) {
		//Custom inputs/numbers to the swapped
		int x= 5;
		int y= 7;
		//Display message before swapping numbers
		System.out.println("Before swapping x="+x +" and y="+y);
		//Using above created method to sap numbers
		swap(x,y);
		
		
	}
}
