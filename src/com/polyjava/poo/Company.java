package com.polyjava.poo;


import java.io.Serializable;
import java.util.ArrayList;

public class Company implements Serializable {

	private String nameCompany;

	private ArrayList<Department> DepartmentList;

	public Company(String nameCompany) {
		setNameCompany(nameCompany);
		setDepartmentList(new ArrayList<Department>());
	}
	
	public Company(String nameCompany, ArrayList<Department> departmentList) {
		this.nameCompany = nameCompany;
		DepartmentList = departmentList;
	}
	
	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public ArrayList<Department> getDepartmentList() {
		return DepartmentList;
	}

	public void setDepartmentList(ArrayList<Department> departmentList) {
		DepartmentList = departmentList;
	}
	
	public void addDepartement(Department newDpt) {
		this.DepartmentList.add(newDpt);
	}
	
	public void removeDepartement(Department dpt) {
		this.DepartmentList.remove(dpt);
	}

}
