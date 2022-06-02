package corejava;

import java.io.FileInputStream;

//write a program in java to create a file in Java using Exception Handling
public class ExceptionHandlingSetB {
public static void main(String[] args) {
	//creating try block
	try
	{
	//Creating FileInputStream object
	FileInputStream filein = new FileInputStream("C:\\myfile.txt");
	int i=0;
	//Call Read() Method By Using While Loop
	while ((i = filein.read()) != -1) {
		System.out.print((char) i);
	}
	
	}
	//creating catch block
catch (Exception e) {
	System.out.println(e);

}
}
}

