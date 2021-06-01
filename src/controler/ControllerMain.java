package controler;

import java.awt.EventQueue;
import java.io.IOException;
import java.util.ArrayList;

import com.polyjava.graphics.JGraphicMainServer;
import com.polyjava.poo.*;

public class ControllerMain {
	static Company company;
	static ArrayList<CheckInOut> checkList;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JGraphicMainServer window = new JGraphicMainServer();
					window.setVisible(true);
					
					Serialize ser = new Serialize("test.txt");
					company = ser.deserializeCompany();
					
					Serialize serCheck = new Serialize("checkinout.txt");
					checkList = serCheck.DeserializeCheckInOutList();
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static boolean CheckInOut(String idEmp) {
		try {
			CheckInOut check = CheckInOutController.createCheckInOut(idEmp, company);
			checkList.add(check);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public static void CloseWindow() {
		Serialize ser = new Serialize("test.txt");
		Serialize serCheck = new Serialize("checkinout.txt");
		try {
			ser.SerializeCompany(company);
			serCheck.serializeCheckList(checkList);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
