package day5.ust;

import java.util.ArrayList;


public class Addelements {
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
