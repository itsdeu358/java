package corejava;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//crating an interface
public interface RegularExpression {
	//main method
	public static void main(String[] args) { 
		//creating a scanner class to take input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input text: "); 
		String input = sc.nextLine(); 
		String regex = "[a-z]";
		//Creating a pattern object Pattern
		Pattern pattern = Pattern.compile(regex); 
		//Matching the compiled pattern in the String Matcher 
		Matcher matcher = pattern.matcher(input);
		int count =0;
		while (matcher.find())
		{ count++; }
		//printing the characters form the range
		System.out.println("Number characters from the range (a-z): "+count); 
	}
}
