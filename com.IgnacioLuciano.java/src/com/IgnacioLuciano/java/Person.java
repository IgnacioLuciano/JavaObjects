package com.IgnacioLuciano.java;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName;
		String lastName;
		String age;

	new Person(){
		String firstName = "";
		String lastName = "";
		String age = "";

	
	public void Person(String first, String last, String yourage) {
		String firstName = first;
		String lastName = last;
		String age = yourage;
	}

	public String getFirstName(){
		return firstName;
	
	}
	public void setFirstName(String newFirstName){
		firstName = newFirstName;
	}

	public String getLastName(){
		return lastName;
	
	}
	public void setLastName(String newLastName){
		lastName = newLastName;
	}

	public String getAge(){
		return age;
	}

	public void setAge(String newAge){
		age = newAge;
	}
}
}
}

