package lambda.ust;

import java.awt.List;
import java.util.ArrayList;

public class Java8Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList names=new ArrayList();
		
		names.add("mahesh");
		names.add("suresh");
		names.add("ramesh");
		names.add("naresh");
		names.add("Kalpesh");
		
		 names.forEach(System.out::println);
	}

}
