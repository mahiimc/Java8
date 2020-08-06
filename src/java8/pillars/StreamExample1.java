package java8.pillars;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java8.repo.Person;
import java8.repo.PersonRepository;

public class StreamExample1 {

	public static void main(String[] args) {
	
	 Map <String,List<String>> personMap = PersonRepository
			 .getAllPersons() // returns all the persons
			 .stream() // persons stream
			 .filter((per) ->per.getHeight() > 140 ) // Predicate internally calls Test method and filter  persons whose height is greater than 140
			 .filter(per -> per.getGender().equals("Male")) //Predicate  and  Male persons
			 .collect(Collectors.toMap(Person :: getName,  Person :: getHobbies)); // Mapping person  hobbies to name
	 System.out.println(personMap);
	}
	
}
