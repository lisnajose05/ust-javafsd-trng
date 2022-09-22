package stream.ust;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer>checkOddEven=x->x%2==0;
		System.out.println("Number 14 is EVEN:"+checkOddEven.test(14));
		System.out.println("Number 14 is ODD:"+checkOddEven.test(18));
		System.out.println("Number 14 is EVEN:"+checkOddEven.test(21));


	}

}
