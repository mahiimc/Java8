package java8.pillars;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	public static void main(String[] args) {
		BiPredicate <Integer,Integer> bp = (x,y) -> x > y ;
		System.out.println(bp.test(30, 20));
		
	}

}
