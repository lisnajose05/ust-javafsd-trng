package exce.ust;

import java.io.FileInputStream;

public class File_InStream {
	public static void main(String args[]) {
		
		try {
			FileInputStream input=new FileInputStream("C:\\Users\\ustjavafsdb205\\input.txt");
			System.out.println("data in the file:");
			
			int i=input.read();
			while(i!=-1) {
				System.out.println((char)i);
				
				i=input.read();
			}
			input.close();
		}
			catch(Exception e) {
				e.getStackTrace();
			}
		}
	}


