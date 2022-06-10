package corejava;
import java.util.*;
public class ElectricityBill {
	static double calculateElectricityBill(int units) {
		 
		int u;
		double amt =0,uni;
		uni= units;
		if(units<=0) {
			return units;
		}
		else {
			if(units>30) {
				u=units-30;
				amt=30.0*3.5;
				if(u>30 && u>=70) {
				u=u-70;
				amt=amt+(70*4);
			
				}
				amt=amt+(u*5);
			}
			else {
				amt=uni*3.5;
				
			}
		}
		return amt;
		
	}
	public static void main(String[] args) {

		int units;
		double amount ;
		System.out.println("Enter the value");
		Scanner sc= new Scanner(System.in);
		units=sc.nextInt();
		amount = calculateElectricityBill(units);
		if(amount<0) {
			System.out.println("INVALID INPUT");
		}
		else if (amount==0) {
			System.out.println(0.0);
		}
		else {
			System.out.println(amount);
		}
	}

}
