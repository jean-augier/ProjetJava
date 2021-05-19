package com.polyjava.poo;

import java.util.ArrayList;

public class Department {

	private int idDepartment;

	private String nameDepartment;

	private ArrayList<Employee> EmployeeList;

	private static int counter;
	
	
	public  Department() {
		counter ++;
		setIdDepartment(counter);
		EmployeeList = null;
		setNameDepartment(null);
		setEmployeeList(null);
	}


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

	public void setIdDepartment(int id) {
		if (id > 0)
		{
			idDepartment = id;
		}
		else
		{
			throw new ArithmeticException("id must be a postive integer !");
		}
	}
	
	public ArrayList<Employee> getEmployeeList() {
		return EmployeeList;
	}

	public void setEmployeeList(ArrayList<Employee> employeeList) {
		EmployeeList = employeeList;
	}
	
	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	
	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int newcounter) {
		Department.counter = newcounter;
	}

	

	public void addEmployee(Employee newEmployee) {
		EmployeeList.add(newEmployee);
	}

	public void delEmployee(Employee employeeToDelete) {
		if (!EmployeeList.remove(employeeToDelete))
		{
			System.err.println("Tentative de retirer un Employee non contenu dans la liste");
		}
		else {
			EmployeeList.remove(employeeToDelete);
		}
	}

	public String toString() {
		String msg = getNameDepartment() + " " + getIdDepartment() + " ";
		return msg;
	}

}
