package stream.ust;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Function;

//import inter.ust.Function;

public class Example {

	public static void main(String[] args) {
		List<String>names=Arrays.asList("Jon","Ajeet","steve","Ajeet","Jon","Ajeet");
		Map<String,Long>map=names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()
				)
				);
		System.out.println(map);
				


	}

}
