package corejava;
//Java program to demonstrate on Buffered Input Stream
import java.io.*;
import java.io.BufferedInputStream;
public class BufferedInputStreamSetB {
		//main method
	public static void main(String[] args) throws Exception {
		//crating a object
		FileInputStream Br = new FileInputStream("C://CopyOfmyfile.txt");
		//To read from the created file
		BufferedInputStream Bis= new BufferedInputStream(Br);
		
		int i;
		//call Read() Method By using while loop
		while((i=Br.read())!=-1) {
			System.out.print((char)i);
			}
		//call close() Method
		Br.close();
		Bis.close();
	}

}
