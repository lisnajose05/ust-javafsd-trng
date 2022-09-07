package day5.ust;
import java.util.TreeMap;
public class Treemap_even {
	public static void main(String args[]) {
		TreeMap<String,Integer>evenNumbers=new TreeMap<>();
		
		evenNumbers.put("Two", 2);
		evenNumbers.put("Four", 4);
		
		evenNumbers.putIfAbsent("six",6);
		System.out.println("TreeMap of even numbers:"+evenNumbers);
		TreeMap<String,Integer>numbers=new TreeMap<>();
		numbers.put("one",1);
		
		numbers.putAll(evenNumbers);
		System.out.println("TreeMap of numbers:"+numbers);
		
	}

}
