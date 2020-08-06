package java8.pillars;

import java.util.function.BiConsumer;



public class ConsumerExample {
	//BiConsumer  -> accpets 2 input parameters and returns nothing , thats why  consumer
	public static void main(String[] args) {
		BiConsumer <String,String> cons1 = (p,q) -> System.out.println(p.toLowerCase()+"::"+q.toLowerCase());
		BiConsumer <String,String> cons2 = (p,q) -> System.out.println(p.toUpperCase()+"::"+q.toUpperCase());
		cons1.andThen(cons2).accept("B141699","Mahesh Chary");
		
	}

}
