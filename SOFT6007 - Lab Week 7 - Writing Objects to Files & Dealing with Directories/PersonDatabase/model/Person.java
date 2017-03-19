package model;

import java.io.Serializable;

public class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	
	public Person() {
		name = "";
		age = 0;
	}
	
	public Person(String _name, int _age) {
		name = _name;
		age = _age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return name + " " + age;
	}
}
