package exce.ust;
import java.io.*;
public class Exception_BufferedReader {
	public static void main(String args[]) {
		String line;
		try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\ustjavafsdb205\\ABC.txt"))){
			while((line=br.readLine())!=null) {
				System.out.println("Line=>"+line);
			}
		}
		catch(IOException e) {
			System.out.println("IOException in try block=>"+e.getMessage());
		}
	}

}
