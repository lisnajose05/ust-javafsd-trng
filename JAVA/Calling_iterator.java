package day5.ust;
import java.util.TreeSet;
import java.util.Iterator;

public class Calling_iterator {
	public static void main(String args[]) {
		TreeSet<Integer>numbers=new TreeSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("TreeSet:"+numbers);
		Iterator<Integer>iterate=numbers.iterator();
		System.out.println("TreeSet using iterator:");
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
			System.out.println(",");
		}
	}
	

}
