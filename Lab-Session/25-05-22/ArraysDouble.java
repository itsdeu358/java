package corejava;
//Double array list
//printing the value by giving the condition

class ArraysDouble {
	
		//main method
public static void main ( String [] args ) 
	{ 
		//values of array list
	double [] dblArr = {3.5 , 6.8 , 2.3 , 9.1 , 1.0	};
	
		//for condition double array
	 for (int i = 0; i<dblArr.length; i ++) {
		 
		 //condition for array
	 dblArr [ i ] /= 2; 
	} 
	for (int i = dblArr.length-1; i >= 0; i--) 
	{ 
		//printing the value
	System.out.println(" Value : " + dblArr [ i ]) ;
	   }
	}
 }


