package corejava;
import java.io.*;
import java.io.InputStreamReader;
public class BufferedReaderEx {
	public static void main(String args[])throws IOException{             
		
		//Creating object
	    InputStreamReader r=new InputStreamReader(System.in);    
		
	    //To read from the created file
	    BufferedReader br=new BufferedReader(r);            
		
	    System.out.println("Enter your name");    
		
	    //To Reading The Value From The User
	    String name=br.readLine();    
		
	    System.out.println("Welcome "+name);    
		
		}    
}
