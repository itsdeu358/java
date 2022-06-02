package corejava;
//write a Java program to demonstrate on FileInputStream
import java.io.FileInputStream;
public class FileInputStreamSetB {
		//creating main method
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
		//catch block
	catch (Exception e) {
		System.out.println(e);
	
	}
	}
	}
