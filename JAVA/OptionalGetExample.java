package optional.ust;

import java.util.Optional;

public class OptionalGetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String>optional=Optional.of("hello");
		if(optional.isPresent()) {
			String value=optional.get();
			System.out.println("Optional Value:"+value);
		}
		else {
			System.out.println("optional has no value");
		}

	}

}
