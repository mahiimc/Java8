package java8.repo;

import java.util.Arrays;
import java.util.List;

public class PersonRepository {

		public static List<Person> getAllPersons(){
			Person p1 = new Person("John",165,2000,"Male",2,Arrays.asList("Cricket","Tennis","Swimming"));
			Person p2 = new Person("Angle",158,5000,"Female",2,Arrays.asList("Drivinng","Music","Food"));
			Person p3 = new Person("Dean",140,5700,"Male",2,Arrays.asList("Cricket","Driving","Tennis"));
			Person p4 = new Person("Nancy",130,4900,"Female",2,Arrays.asList("Cricket","Food","Swimming"));
			Person p5 = new Person("Harper",125,9000,"Female",2,Arrays.asList("Football","Music","Swimming"));
			Person p6 = new Person("Alan",110,9500,"Male",2,Arrays.asList("Cricket","Tennis","Swimming"));
			return Arrays.asList(p1,p2,p3,p4,p5,p6);	
		}
}
