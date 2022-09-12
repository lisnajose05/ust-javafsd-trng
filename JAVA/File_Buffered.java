package file.ust;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class File_Buffered {
	public static void main(String args[]) {
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		
		try {
		System.out.println("Enter the age:");
		String age=br.readLine();
		System.out.println(age);
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
			
		}
}
