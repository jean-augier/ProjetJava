package com.polyjava.poo;

import java.io.*;
import java.net.SocketException;

public class TCPClient extends TCPClientBuilder implements Runnable
{
	private Company company; //company to received from server
	
	public TCPClient() throws SocketException
	{
		super();
	}
	
	public TCPClient(String ip, int port) throws SocketException
	{
		super(ip,port);
	}
	
	public void run()
	{
		try
		{
			System.out.println("TCPClient started ...");
			setSocket();
			System.out.println("Client is connected.");
			
			System.out.println("...data reception...");
			
			InputStream in = getS().getInputStream();
			ObjectInputStream objIn = new ObjectInputStream(in);
			
			setCompany((Company) objIn.readObject());
			System.out.println("data received!");
			
			closeSocket();
			System.out.println("...Connection closed.");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) 
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
