package exce.ust;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class Exception_IOException {
	public static void findFile() throws IOException{
		File newFile=new File("C:\\Users\\ustjavafsdb205\\ABC.txt");
		FileInputStream stream=new FileInputStream(newFile);
	}
	public static void main(String args[]) {
		try {
			findFile();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
