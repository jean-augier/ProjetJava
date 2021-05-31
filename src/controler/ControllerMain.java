package controler;

import java.awt.EventQueue;

import com.polyjava.graphics.JGraphicMainServer;

public class ControllerMain {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JGraphicMainServer window = new JGraphicMainServer();
					window.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
