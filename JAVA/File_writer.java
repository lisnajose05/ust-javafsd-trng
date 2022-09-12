package exce.ust;

import java.io.FileWriter;
import java.io.BufferedWriter;

public class File_writer {
	public static void main(String args[]) {
		
		String data="This is the data in the output file";
		
		try {
			FileWriter file=new FileWriter("C:\\Users\\ustjavafsdb205\\reader.txt");
			
			BufferedWriter output=new BufferedWriter(file);
			
			output.write(data);
			
			output.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
