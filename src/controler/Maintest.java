package controler;

import java.io.*;
import java.time.*;
import com.polyjava.poo.*;

public class Maintest {

	public static void main(String[] args) throws IOException {

		Serialize ser = new Serialize("SaveCheck.txt");
		
		Employee e = new Employee();
		e.setName("Jean");
		e.setSurname("Paul");
		e.setStartOfShift(LocalTime.now());
		e.setEndOfShift(LocalTime.now().plusHours(8));
		
		CheckInOut c = new CheckInOut(e);
		
		ser.SerializeCheck(c);
		
		try {
			System.out.println(ser.getSerializeCheck().toString());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	} 

}
