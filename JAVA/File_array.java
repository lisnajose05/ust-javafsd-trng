package exce.ust;

import java.io.File;
public class File_array {
	public static void main(String args[]) {
		File file=new File("C:\\Users\\ustjavafsdb205\\B.txt");
		String[] fileList=file.list();
		for(String str:fileList) {
			System.out.println(str);
		}
	}

}
