package controler;

import java.io.*;
import java.util.ArrayList;

import com.polyjava.poo.*;

public class Serialize implements Serializable{
	
	private String fileName;

	private FileOutputStream fos;
	private ObjectOutputStream oos;
	private FileInputStream fis;
	private ObjectInputStream ois;
	
	public Serialize(String newFileName) 
	{
		setFileName(newFileName);
	}
	
	public String getFileName()
	{
		return fileName;
	}
	
	public void setFileName(String newFileName)
	{
		fileName = newFileName;
	}
	
	//to serialize CheckInOut
	public void serializeCheck(CheckInOut check) throws IOException
	{
		// File initialize
		fos = new FileOutputStream(getFileName());
		oos = new ObjectOutputStream(fos);
		
		oos.writeObject(check);
		
		oos.close();
		fos.close();
	}
	
	//to serialize CheckInOutList
	public void serializeCheckList(ArrayList<CheckInOut> CheckInOutList) throws Exception
	{
		FileOutputStream fos = new FileOutputStream(getFileName());
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(CheckInOutList);
		oos.close();
		fos.close();
	}
	
	//to serialize Employee
	public void serializeEmployee(Employee emp) throws IOException
	{
		// File initialize
		fos = new FileOutputStream(getFileName());
		oos = new ObjectOutputStream(fos);
		
		oos.writeObject(emp);
		
		oos.close();
		fos.close();
	}
	
	//to serialize EmployeeList
	public void SerializeEmployeesList(ArrayList<Employee> Employees) throws Exception
	{
		FileOutputStream fos = new FileOutputStream(getFileName());
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(Employees);
		oos.close();
		fos.close();
	}
	
	//to serialize Department
	public void SerializeDepartment(Department dpt) throws IOException
	{
		// File initialize
		fos = new FileOutputStream(getFileName());
		oos = new ObjectOutputStream(fos);
		
		oos.writeObject(dpt);
		
		oos.close();
		fos.close();
	}
	
	//to serialize DepartmentList
	public void SerializeDepartmentList(ArrayList<Department> DepartmentList) throws Exception
	{
		FileOutputStream fos = new FileOutputStream(getFileName());
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(DepartmentList);
		oos.close();
		fos.close();
	}
	
	//to deserialize CheckInOut
	public CheckInOut deserializeCheck() throws IOException, ClassNotFoundException
	{
		fis = new FileInputStream(getFileName());
		ois = new ObjectInputStream(fis);
		
		CheckInOut check = new CheckInOut();
		check = (CheckInOut) ois.readObject();
		ois.close();
		fis.close();
		
		return check;
	}
	
	//to deserialize CheckInOutList
	public ArrayList<CheckInOut> DeserializeCheckInOutList() throws Exception
	{
		ArrayList<CheckInOut> CheckInOutList;
		
		FileInputStream fis = new FileInputStream(getFileName());
		ObjectInputStream ois = new ObjectInputStream(fis);
		CheckInOutList = (ArrayList<CheckInOut>)ois.readObject();
		ois.close();
		
		return CheckInOutList;
	}
	
	//to deserialize Employee
	public Employee deserializeEmployee() throws IOException, ClassNotFoundException
	{
		fis = new FileInputStream(getFileName());
		ois = new ObjectInputStream(fis);
		
		Employee emp = new Employee();
		emp = (Employee) ois.readObject();
		ois.close();
		fis.close();
		
		return emp;
	}
	
	//to deserialize EmployeesList
	public ArrayList<Employee> DeserializeEmployeesList() throws Exception
	{
		ArrayList<Employee> Employees;
		
		FileInputStream fis = new FileInputStream(getFileName());
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employees = (ArrayList<Employee>)ois.readObject();
		ois.close();
		
		return Employees;
	}
	
	
	
	//to deserialize Department
	public Department deserializeDepartment() throws IOException, ClassNotFoundException
	{
		fis = new FileInputStream(getFileName());
		ois = new ObjectInputStream(fis);
		
		Department dpt = new Department();
		dpt = (Department) ois.readObject();
		ois.close();
		fis.close();
		
		return dpt;
	}

	//to deserialize DepartmentList
	public ArrayList<Department> DeserializeDepartmentList() throws Exception
	{
		ArrayList<Department> DepartmentList;
		
		FileInputStream fis = new FileInputStream(getFileName());
		ObjectInputStream ois = new ObjectInputStream(fis);
		DepartmentList = (ArrayList<Department>)ois.readObject();
		ois.close();
		
		return DepartmentList;
	}
}
