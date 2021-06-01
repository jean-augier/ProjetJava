package com.polyjava.poo;

import java.io.*;
import java.net.*;

import controler.Serialize;

public class TCPServer extends TCPServerBuilder implements Runnable
{
	private CheckInOut check; //the company to send
	
	public TCPServer() throws SocketException
	{
		super();
		setCheck(null);
	}
	
	public TCPServer(String ip, int port) throws SocketException
	{
		super(ip, port);
		setCheck(null);
	}
	

	public TCPServer(CheckInOut check) throws SocketException
	{
		super();
		setCheck(check);
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
			objOut.writeObject(check);
			System.out.println("Data send !");
			
			closeSockets();
			System.out.println("... TCPServer closed."); 
		}
		catch (IOException e)
		{
			System.out.println("Erreur lors de l'envoie des donn�es. Stockage en cours...");
			Serialize serializer = new Serialize("SaveCheck.dat");
			try 
			{
				serializer.serializeCheck(getCheck());
				System.out.println("Pointage enregistr� ! Il sera envoy� au prochain d�marage.");
			} 
			catch (IOException e1) 
			{
				System.out.println("Erreurs de sauvegarder des donn�es, veuillez recommencez l'op�ration.");
			}
		}
	}
	
	public CheckInOut getCheck() {
		return check;
	}
	
	public void setCheck(CheckInOut check) {
		this.check = check;
	}
}