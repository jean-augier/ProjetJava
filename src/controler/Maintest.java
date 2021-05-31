package controler;

import com.polyjava.poo.*;

import java.io.IOException;
import java.time.*;

public final class Maintest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Company cmpy = new Company();
		
		Employee e = new Employee();
		e.setName("Jean");
		e.setSurname("Charles");
		e.setStartOfShift(LocalTime.now());
		e.setEndOfShift(LocalTime.now().plusHours(8));
		
		Department dp = new Department();
		dp.setNameDepartment("Maths");
		dp.addEmployee(e);
		
		System.out.println(dp);
		
//		cmpy.addDepartement(dp);
		
//		Serialize ser = new Serialize("test.txt");
		
//		ser.SerializeCompany(cmpy);
//		System.out.println("Ser fais");
//		System.out.println(ser.deserializeCheck());
		
	}

}
