package test;

import static org.junit.jupiter.api.Assertions.*;

import exercise.Person;

import org.junit.jupiter.api.Test;

class testPerson {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	@Test
	void testPerson() {
		Person p = new Person("Peter", 33, "consultant");
		assertNotNull(p.getName());
		assertNotNull(p.getAge());
		assertNotNull(p.getJobTitle());
	}
	@Test
	void testSetName() {
		Person p = new Person("Peter", 33, "consultant");
		p.setName("Mike");
		assertEquals("Mike", p.getName());
	}
	@Test
	void testSetAge() {
		Person p = new Person("Adam", 43, "architect");
		p.setAge(45);
		assertEquals(45, p.getAge());
	}
	@Test
	void testSetJobTitle() {
		Person p = new Person("Jeff", 22, "cyclist");
		p.setJobTitle("waiter");
		assertEquals("waiter", p.getJobTitle());
	}
}
