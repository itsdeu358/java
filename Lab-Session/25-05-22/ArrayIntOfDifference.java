package corejava;
//java program skips 2 value and print value third value of Array list

 class ArrayIntOfDifference {
	 
		//main method 
		public static void main ( String [] args )
		 {
			
		//Integer value of array list
		int [] intArr = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
		
		//condition of for loop to show the difference 
		 for (int i = 0; i < intArr . length ; i += 3) 
		{ 
			 //printing the third value of array list 
		System.out.println("Value:"+intArr[i]) ; 
		} 
	} 
}


