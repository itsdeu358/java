package corejava;
//Write a program to get the input as integer and create a method get Toy(int price)
//which uses switch case to display the toys with respect to price.

//Insert the price through console input from the user and pass it to get Toy method 
//if the price is not matching display No Toy Available in this Range.
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ToyExample {
	
	//Multidimensional string array 
	    String[][] toys = new String [6][6];

	//Constructor
      ToyExample()
	    {

	    toys [0][0]="1";
	    toys[0][1]="Doraemon";

	    toys [1][0]="2";
	    toys [1][1] ="Oswald";

	    toys [2][0]="3";
	    toys [2][1]="Pink Panther";

	    toys [3][0]="4";
	    toys [3][1]="Remote Car";

	    toys [4][0]="5";
	    toys[4][1]="Pikachu";
	    
	    toys [5] [0]="6";
	    toys [5] [1]="Hatodi";

	    }

	    public static String getToy(int price)
	    {
	        String Toyname;
	      //prize for each toy using switch case
	        switch(price)
	        {
	            case 500: 
	               Toyname = "Doraemon";
	                return Toyname;
	            
	            case 550:
	                Toyname = "Oswald";
	                return Toyname;
	                
	            case 370:
	                Toyname = "Pink Panther";
	                return Toyname;
	                
	            case 400:
	                Toyname = "Remote Car";
	                return Toyname;
	                
	            case 450:
	                Toyname = "Pikachu";
	                return Toyname;
	                
	            case 350:
	            	Toyname ="Hatoii";
	            	return Toyname;
	                
	            default:
	                Toyname = "No Toys Available in this Range";
	                return Toyname;
	        }
	    }
	    //main method
	    public static void main(String[] args) {
	    //creating object of scanner class
	    
	        Scanner sc = new Scanner (System.in);
	        
	        System.out.println("Enter the price of Toy");
	        int price = sc.nextInt ();

	        System.out.println(getToy(price));

	    }
	    }
	    
	