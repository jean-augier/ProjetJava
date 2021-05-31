package com.polyjava.poo;

import java.io.*;
import java.net.*;

public class TCPServer extends TCPServerBuilder implements Runnable
{
	private Company company; //the company to send
	
	public TCPServer() throws SocketException
	{
		super();
		setCompany(null);
	}
	
	public TCPServer(String ip, int port) throws SocketException
	{
		super(ip, port);
		setCompany(null);
	}
	
	public TCPServer(Company company) throws SocketException
	{
		super();
		setCompany(company);
	}
	
	public void run()
	{
		try
		{
			setSockets();
			System.out.println("TCPServer launched ..."); 
			setS(getSS().accept());
			System.out.println("Server accepts the connection.");
			
			System.out.println("...Sending data...");
			OutputStream out = getS().getOutputStream();
			ObjectOutputStream objOut = new ObjectOutputStream(out);
			objOut.writeObject(company);
			System.out.println("Data send !");
			
			closeSockets();
			System.out.println("... TCPServer closed."); 
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void setCompany(Company comp)
	{
		company = comp;
	}
	
	public Company getCompany()
	{
		return company;
	}
}