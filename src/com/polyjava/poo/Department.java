package com.polyjava.poo;

import java.util.ArrayList;

public class Department {

	private int idDepartment;

	private String nameDepartment;

	private ArrayList<Employee> EmployeeList;

	private static int counter;
	

	public Department(ArrayList<Employee> employeeList) {
		super();
		EmployeeList = employeeList;
	}

	public Department(String nameDepartment) {
		super();
		this.nameDepartment = nameDepartment;
	}

	public int getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(int idDepartment) {
		this.idDepartment = idDepartment;
	}

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	public ArrayList<Employee> getEmployeeList() {
		return EmployeeList;
	}

	public void setEmployeeList(ArrayList<Employee> employeeList) {
		EmployeeList = employeeList;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Department.counter = counter;
	}

	
	public  Department() {

	}


	/*void Department() {

	}*/


	public void addEmployee(Employee newEmployee) {

	}

	public void delEmployee(Employee employeeToDelete) {

	}

	public String toString() {
		return null;
	}

}
