package controler;

import java.awt.EventQueue;

import com.polyjava.graphics.JGraphicMainServer;
import com.polyjava.poo.Company;

public class ControllerMain {
	static Company company;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JGraphicMainServer window = new JGraphicMainServer();
					window.setVisible(true);
					
					Serialize ser = new Serialize("test.txt");
					company = ser.deserializeCompany();
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static boolean CheckInOut(String idEmp) {
		return CheckInOutController.createCheckInOut(idEmp, company);
	}
}
