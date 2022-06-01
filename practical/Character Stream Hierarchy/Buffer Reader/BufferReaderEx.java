package corejava;
import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderEx {

	public static void main(String[] args) throws Exception {
		
		//creating FileReader object
		FileReader file = new FileReader("C:/myfile.txt");
		
		//To read from the created file
		BufferedReader br = new BufferedReader(file);
		
		int i;
		//call Read() Method By using while loop
		while((i=br.read())!=-1) {
			System.out.print((char)i);}
		//call close() Method
		br.close();
		file.close();
		}

	}


