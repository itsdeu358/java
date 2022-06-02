package corejava;
//java program to demonstrate on File Output Stream
import java.io.FileOutputStream;

public class FileOutputStreamSetB {
	public static void main(String[] args) {
	try{    
	      FileOutputStream fileout=new FileOutputStream("C:\\CopyOfmyfile.txt");
	      //with integer type of data
	  fileout.write(80);  
	  	  //with string type of data
	  String s="Welcome to the world of java programing";
			 byte b[] = s.getBytes();
			 //call close method
	   fileout.write(b);
	   fileout.close();       
	   //printing the statement 
	   System.out.println("Your data sucseesfully added...");       
	   }
	  catch (Exception e) {
			System.out.println(e);
		}      
	  }  
}

