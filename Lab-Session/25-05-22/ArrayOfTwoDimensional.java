package corejava;
//java program to print two dimensional array

 class ArrayOfTwoDimensional {
	 
	 //main method
 public static void main(String[] args){
	 //Integer value of arrays
  	  int arr[][] = { { 11, 22, 66 }, { 33, 44, 55 } };
  	  
  	  //for loop for condition
   	 for (int i = 0; i < 2 ; i++) {

        for (int j = 0; j < 3; j++)
        	
      //to print 2 dimensional values
        System.out.print(arr[i][j] + " ");
        System.out.println();
  	  		}
	  }
}


