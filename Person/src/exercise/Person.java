package exercise;
import java.util.ArrayList;

public class Person {
	
	public String name;
	public int age;
	public String jobTitle;
	
	public Person (String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	public String toString() {
		return this.name + " " + this.age + " " + this.jobTitle;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJobTitle() {
		return this.jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}


