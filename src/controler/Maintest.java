package controler;

import com.polyjava.poo.*;

import java.io.IOException;
import java.time.*;

public final class Maintest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
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
		
		Serialize ser = new Serialize("test.txt");
		
		ser.serializeCheck(check);;
		System.out.println("Ser fais");
		System.out.println(ser.deserializeCheck());
		
	}

}
