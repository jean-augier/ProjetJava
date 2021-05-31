package com.polyjava.poo;

import java.net.SocketException;
import java.time.LocalDate;
import java.time.LocalTime;

public class TestTCP {

	public static void main(String[] args) throws SocketException, InterruptedException {
		Employee e = new Employee();
		e.setName("Jean");
		e.setSurname("Charles");
		e.setStartOfShift(LocalTime.now());
		e.setEndOfShift(LocalTime.now().plusHours(8));
		
		Department dp = new Department();
		dp.setNameDepartment("Maths");
		dp.addEmployee(e);
		
		CheckInOut check = new CheckInOut(e);
		check.setDate(LocalDate.now());
		check.setHour(LocalTime.now());
		
		Company company = new Company("WESHBANK");
		company.addDepartement(dp);
		
		TCPClient client = new TCPClient();
		TCPServer server = new TCPServer();
		
		server.setCompany(company);

		Thread t1 = new Thread(client);
		Thread t2 = new Thread(server);
		
		t1.start();
		t2.start();
		
		while (client.getCompany() == null)
			System.out.println("nop");
		System.out.println(client.getCompany().toString());
	}

}
