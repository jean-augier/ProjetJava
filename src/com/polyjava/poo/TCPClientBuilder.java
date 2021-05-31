package com.polyjava.poo;

import java.io.IOException;
import java.net.*;

public class TCPClientBuilder 
{
	protected Socket s; 
	protected InetSocketAddress isA;
	
	TCPClientBuilder() 
	{ 
		s = null; 
		isA = null; 
	}
	
	public void setSocket() throws IOException
	{
		setisA(new InetSocketAddress("localhost",8080));  
		setS(new Socket(isA.getHostName(), isA.getPort()));
	}
	
	public void closeSocket() throws IOException
	{
		s.close();
	}
	
	public void setS(Socket socket) throws SocketException
	{
		s = socket;
		if(s != null)
		{
			s.setSoTimeout(3000);
		}
	}
	
	public void setisA(InetSocketAddress address)
	{
		isA = address;
	}
	
	public Socket getS()
	{
		return s;
	}
	
	public InetSocketAddress getisA()
	{
		return isA;
	}
}
