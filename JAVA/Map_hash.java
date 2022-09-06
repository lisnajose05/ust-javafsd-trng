package day5.ust;
import java.util.HashMap;
import java.util.Map;

public class Map_hash {
public static void main(String args[]) {
	Map<String,Integer>numbers=new HashMap<>();
	numbers.put("one",1);
	numbers.put("Two",2);
	System.out.println("Map:"+numbers);
	System.out.println("Keys:"+numbers.keySet());
	System.out.println("VAlues:"+numbers.values());
	System.out.println("Entries:"+numbers.entrySet());
    int value=numbers.remove("Two");
    System.out.println("Removed Value:"+value);
}
}
