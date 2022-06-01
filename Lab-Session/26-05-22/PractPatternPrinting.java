package corejava;
//Java program to iterate a linked list in reverse order
 class PractPatternPrinting {
	//main method
	public static void main(String[] args) {
		 {
			 //creating integer for loop
			 for (int i = 1; i <= 5; i++)
		        {
		            int n = 5;
		 
		            for (int j = 1; j <= n - i; j++)
		            {
		                System.out.print(" ");
		            }
		            for (int k = i; k >= 1; k--)
		            {
		              System.out.print(k);
		            }
		            for (int l = 2; l <= i; l++)
		            {
		            	//printing the pattern
		              System.out.print(l);
		            }		           
		            System.out.println();
		        }
			 		System.out.println();
		        }
		   
		  }
		}
