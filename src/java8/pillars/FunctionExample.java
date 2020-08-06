package java8.pillars;

import java.util.function.Function;

public class FunctionExample{
	public static void main(String[] args) {
		Function <String,String> fun = (i) -> i.toLowerCase();
		Function <String , String> rev = i -> i.toUpperCase();
		System.out.println(fun.apply("mahesh chary"));
		System.out.println(rev.compose(fun).apply("mahesh chary"));
		
	}
	
}