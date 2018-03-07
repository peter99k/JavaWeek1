package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import exercise.PersonRunnerClass;
import exercise.Person;

import org.junit.jupiter.api.Test;

class testPersonRunnerClass {

	@Test
	void testCollectionPrint() {
		Person p1 = new Person("Peter", 33, "consultant");
		Person p2 = new Person("Amrit", 24, "consultant");
		Person p3 = new Person("Prab", 25, "consultant");
		
		ArrayList<Person> collection = new ArrayList<Person>();
		collection.add(p1);
		collection.add(p2);
		collection.add(p3);
		
		assertEquals(collection.get(1).getName(), "Amrit");
		assertNotEquals(collection.get(2).getName(), "Peter");
		assertNotNull(collection.get(0));
	}

}
