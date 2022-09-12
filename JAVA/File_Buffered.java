package exce.ust;


import java.io.FileReader;
import java.io.BufferedReader;

public class File_Buffered {
	public static void  main(String args[]) {
		char[] array=new char[100];
		
		try {
			FileReader file=new FileReader("C:\\Users\\ustjavafsdb205\\Reader.txt");
			
			BufferedReader input=new BufferedReader(file);
			
			input.read(array);
			System.out.println("Data in the file:");
			
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
