package java8.pillars;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// Predicate --> test ()
		Predicate <String> test1 = (s) -> s.length() > 5 && s.length() > 10;
		Predicate <String> test2 = (s) -> s.length() > 10;
		System.out.println(test1.and(test2).test("Mahesh chary Indrakanti"));
		System.out.println(test1.negate().test("Java Developer"));// Returns Logical Negat
	}

}
