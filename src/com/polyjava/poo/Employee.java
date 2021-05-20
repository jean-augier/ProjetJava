package com.polyjava.poo;

import java.time.LocalTime;
import java.util.ArrayList;

public class Employee extends Person {

	private int idEmployee;

	private LocalTime startOfShift;

	private LocalTime endOfShift;
	
	private Department department;

	private static int counter = 0;
	
	private ArrayList<Planning> PlanningList;

	public  Employee() 
	{
		counter++;
		setIdEmployee(counter);
		setName(null);
		setSurname(null);
		setStartOfShift(null);
		setEndOfShift(null);
		setDepartment(null);
	}

	public  Employee(Employee employee) 
	{
		counter++;
		setIdEmployee(counter);
		setName(employee.getName());
		setSurname(employee.getSurname());
		setStartOfShift(employee.getStartOfShift());
		setEndOfShift(employee.getEndOfShift());
		setDepartment(employee.getDepartment());
	}

	public int getIdEmployee() 
	{
		return idEmployee;
	}

	public void setIdEmployee(int id)
	{
		if (id > 0)
		{
			idEmployee = id;
		}
		else
		{
			throw new ArithmeticException("id must be a postive integer !");
		}
	}

	public LocalTime getStartOfShift() 
	{
		return startOfShift;
	}

	public void setStartOfShift(LocalTime actualTime) 
	{
		startOfShift = actualTime;
	}

	public LocalTime getEndOfShift() {
		return endOfShift;
	}

	public void setEndOfShift(LocalTime actualTime) {
		endOfShift = actualTime;
	}
	
	public Department getDepartment()
	{
		return department;
	}
	
	public void setDepartment(Department dpt)
	{
		department = dpt;
	}

	public static int getCounter() {
		return counter;
	}

	public void setCounter(int newCounter) 
	{
		counter = newCounter;
	}
	
	public ArrayList<Planning> getPlanningList() {
		return PlanningList;
	}

	public void setPlanningList(ArrayList<Planning> planningList) {
		PlanningList = planningList;
	}

	public void addPlanning(Planning p) {
		this.PlanningList.add(p);
	}
	
	public void removePlanning(Planning p) {
		this.PlanningList.remove(p);
	}

	public String toString()
	{
		String msg = super.toString() + System.lineSeparator();
		msg += getDepartment() + " " + getStartOfShift().getHour() + ":" + getStartOfShift().getMinute();
		msg += " " + getEndOfShift().getHour() + ":" + getEndOfShift().getMinute();
		return msg;
	}

}
