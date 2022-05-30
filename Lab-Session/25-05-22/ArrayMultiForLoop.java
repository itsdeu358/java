package corejava;
//java program to print multiplication by using for loop condition

class ArrayMultiForLoop {
	
	//main method
public static void main ( String [] args ) 
	{ 
		//creating a variable
	int [] intArr = new int [5]; 
	
	//for loop to assign values
	for (int i = 0; i < intArr . length ; i ++) 
	{
		//condition of for loop
	 intArr [ i ] = i * 2;
	 }
	 for (int i = 0; i < intArr . length ; i ++) 
	{ 
		 //printing the answer of multiplication
	System . out . print ( intArr [ i ] + ", ") ;
		}
	 } 
 }

