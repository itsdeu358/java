package corejava;
import java.util.Scanner;
public class whilemul {
	public static void main(String[] args) 
	   {
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num1 = scan.nextInt();
        int i = 5;
        scan.close();
        int product = num1*5;
        System.out.println(product);
		}
	   }
