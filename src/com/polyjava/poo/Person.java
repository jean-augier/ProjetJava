package com.polyjava.poo;

public class Person {

	protected String namePerson;

	protected String surnamePerson;

	public Person() 
	{
		setName(null);
		setSurname(null);
	}

	public Person(Person person) {
		setName(person.getName());
		setSurname(person.getSurname());
	}

	public Person(String firstName, String lastName) 
	{
		setName(firstName);
		setSurname(lastName);
	}

	public String getName() {
		return namePerson;
	}

	public void setName(String name) {
		namePerson = name;
	}

	public String getSurname() {
		return surnamePerson;
	}

	public void setSurname(String surname) {
		surnamePerson = surname;
	}
	
	public String toString()
	{
		String msg = getName() + " " + getSurname() + " ";
		return msg;
	}

}
