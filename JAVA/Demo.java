package enu.ust;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>hs=new HashSet<String>();
		hs.add("P");
		hs.add("Q");
		hs.add("R");
		Enumeration e= Collections.enumeration(hs);
		while(e.hasMoreElements())
			System.out.println(e.nextElement());

	}

}
