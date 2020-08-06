package java8.pillars;

import java.util.function.DoublePredicate;

public class DoublePredicateExample {
	public static void main(String[] args) {
		DoublePredicate db = (d) -> d > 0 && d> 1;
		System.out.println(db.test(1.4));
		
	}

}
