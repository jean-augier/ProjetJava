package com.polyjava.poo;

import java.io.IOException;
import java.net.*;

public class TCPServerBuilder 
{
	protected ServerSocket ss; //the passive 
	protected Socket s; //and active sockets 
	
	protected InetSocketAddress isA; // the address 
	
	public TCPServerBuilder() throws SocketException 
	{ 
		setSS(null);
		setS(null);
		setisA(null);
	}
	
	public void setSockets() throws IOException
	{
		setisA(new InetSocketAddress("localhost",8080)); //voir pour passer le port en param
		setSS(new ServerSocket(getisA().getPort()));
	}
	
	public void closeSockets() throws IOException
	{
		getS().close();
		getSS().close();
	}
	
	public void setSS(ServerSocket serverSocket)
	{
		ss = serverSocket;
	}
	
	public void setS(Socket socket) throws SocketException
	{
		s = socket;
		if(s != null)
		{
			s.setSoTimeout(5000);
		}
	}
	
	public void setisA(InetSocketAddress adress)
	{
		isA = adress;
	}
	
	public ServerSocket getSS()
	{
		return ss;
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
