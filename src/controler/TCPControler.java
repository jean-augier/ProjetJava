package controler;

import com.polyjava.poo.*;
import java.io.*;

public class TCPControler 
{
	//d�gager client pour faire communiquer les deux app
	private TCPServer server;
	private TCPClient client;
	
	public TCPControler() throws ClassNotFoundException, IOException
	{
		SetUp config = new SetUp();
		setServer(config.getConfig());
		setClient(new TCPClient(server.getIp(),server.getPort()));
	}
	
	public void sendCheckInOut(CheckInOut check) 
	{
		new Thread(getServer()).start();
		new Thread(getClient()).start();
		//d�gager client pour faire communiquer les deux app
	}

	public TCPServer getServer() {
		return server;
	}

	public void setServer(TCPServer server) {
		this.server = server;
	}

	public TCPClient getClient() {
		return client;
	}

	public void setClient(TCPClient client) {
		this.client = client;
	}
}
