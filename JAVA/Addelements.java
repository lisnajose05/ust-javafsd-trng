package exer.ust;

import java.util.ArrayList;


/**
 * The type Addelements.
 */
public class Addelements {
	/**
	 * Main.
	 *
	 * @param args the args
	 */
	public static void main(String args[]) {
		ArrayList<String>languages=new ArrayList<>();
		languages.add("Java");
		languages.add("Kotin");
		languages.add("C++");
		System.out.println("ArrayList:"+languages);
		languages.set(2, "Javascript");
		System.out.println("Modified ArrayList:"+languages);
	}

}
