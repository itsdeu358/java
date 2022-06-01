package corejava;
import java.io.BufferedWriter;
import java.io.FileWriter;
 public class BufferWriterEx {

	 public static void main(String[] args) throws Exception {     
			
			//Creating FileWriter object
		    FileWriter writer = new FileWriter("C:/myFile.txt");  
			
		  //To read from the created file
		    BufferedWriter buffer = new BufferedWriter(writer);  
			
		    buffer.write("Welcome to My World");  
			
		    //Call close() Method
		    buffer.close();  
			
		    System.out.println("Success");  
			
		    } 
		}
	