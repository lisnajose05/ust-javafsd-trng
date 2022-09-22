package optional.ust;

import java.util.Optional;

public class OptionalClassExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> strOptional=Optional.of("ONETWOTHREE");
		Optional<String> strOptional1=strOptional.map(String::toLowerCase);
		strOptional1.ifPresent(System.out::println);
	}

}
