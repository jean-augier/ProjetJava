package controler;

import java.net.SocketException;

import com.polyjava.poo.*;

public class SetUp {
	
	static public TCPClient setClientConfig(String ip, int port) throws SocketException
	{
		return(new TCPClient(ip,port));
	}

	public static TCPServer setServerConfig(String ip, int port) throws SocketException
	{
		return(new TCPServer(ip,port));
	}
}
