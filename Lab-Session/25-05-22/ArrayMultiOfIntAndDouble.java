package corejava;
//java program to print multiplication of Integer and double values

 class ArrayMultiOfIntAndDouble {
	//main method
	 static void main ( String [] args ) 
	{ 
		 //Array list of Integer values
	int [] intArr = {1 , 2 , 3 , 4 , 5}; 
	
		//Array list of Double values
	double [] dblArr = {0.5 , 1 , 1.5 , 2 , 2.5};
	
		//For loop condition
	 for (int i = 0; i < intArr . length ; i ++) 
	{
		 //Multiplication operation
	 dblArr [ i ] = dblArr [ i ] * intArr [ i ]; 
	} 
	for (int i = 0; i < intArr . length ; i ++) 
	{
		//to print multiplication of integer and double
	 System . out . println ( intArr [ i ] + ": " + dblArr [ i ]) ; 
		}
	}
 }


