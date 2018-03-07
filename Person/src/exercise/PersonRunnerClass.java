package exercise;
import java.util.*;

import javax.swing.plaf.synth.SynthGraphicsUtils;

public class PersonRunnerClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person personOne = new Person("Peter", 33, "Consultant");
		Person personTwo = new Person("Zoe", 27, "Pilot");
		Person personThree = new Person("Ted", 70, "Pensioner");
		
		ArrayList<Person> collection = new ArrayList<Person>();
		
		collection.add(personOne);
		collection.add(personTwo);
		collection.add(personThree);
		
		collectionPrint(collection);
		
	}
	
	public static void collectionPrint(ArrayList<Person> collection) {
		for(Person p : collection) {
			System.out.println(p);
		}
	
	}
	

}
