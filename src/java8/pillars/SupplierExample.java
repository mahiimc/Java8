package java8.pillars;

import java.util.function.Supplier;

public class SupplierExample {
	
	public static void main(String[] args) {
		Supplier<String> sup = () -> "Hey Hello";
		System.out.println(sup.get());
	}

}
