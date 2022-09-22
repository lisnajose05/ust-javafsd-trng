package stream.ust;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
		List<String> str=new ArrayList<>();
		str.add("Lisna");
		str.add("Jose");
		str.add("Appu");
		//predicate is a functionalInterface in java
		Predicate sp=s->s.equals("Lisna");
		Stream sr=str.stream().filter(sp);//(str.Stream())taking anybody to stream mode
	    System.out.println(sr.collect(Collectors.toList()));
	    
    //str is a string type

	}

}
