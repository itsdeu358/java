package corejava;
//printing the value by using for loop condition
 class ArrayString {
	
 public static void main ( String [] args ) 
	{
		//declaring values
	 String strArr [] = new String [10]; 
	 for (int i = strArr.length-1; i >= 0; i--) 
	{
		 //Condition for String
	 strArr [ i ] = "b" + ( i - 1) ; 
	}
	 	//Printing value of the condition
	 System.out.println(" Value : " + strArr [5]) ;
	 }
 }
