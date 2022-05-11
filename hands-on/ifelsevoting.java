package corejava;
import java.util.Scanner;
public class ifelsevoting {
	public static void main(String[] args)
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your age=");
        age = sc.nextInt();
        if (age >= 18)
        {
            System.out.println("You are eligible for voting.");
        }
        else
        {
            System.out.println("You are not eligible for voting.");
        }
    }
}