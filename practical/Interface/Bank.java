package corejava;
//java program to print the bank's rate of interest
public interface Bank {
	//float value
	float rateOfInterest();  
	
	}  //creating a class
		
	class SBI implements Bank{  
		
	public float rateOfInterest(){return 9.15f;}  
		
	}  //creating a another class
		
	class PNB implements Bank{  
		
	public float rateOfInterest(){return 9.7f;}  
		
	}  //creating main class with main method
		
	class TestInterface2{  
		
	public static void main(String[] args){  
		//calling SBI bank's rate of interest
	Bank b=new SBI();  
	Bank c=new PNB();
		//printing rate of interest
	System.out.println("ROI: "+b.rateOfInterest());  
	System.out.println("ROI: "+c.rateOfInterest());  
		
	}
}  
		
	 


