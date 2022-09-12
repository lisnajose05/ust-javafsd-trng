package exce.ust;

import java.io.File;
public class File_Exception {
	public static void main(String args[]) {
		File file=new File("C:\\Users\\ustjavafsdb205\\AB.txt");
		
		try {
			boolean value=file.createNewFile();
			if(value) {
				System.out.println("The new file is created");
			}
			else {
				System.out.println("The file is already exists");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		
	}

}
