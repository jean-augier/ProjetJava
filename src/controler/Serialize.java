package controler;

import java.io.*;
import com.polyjava.poo.CheckInOut;

public class Serialize implements Serializable{
	
	private String fileName;

	private FileOutputStream fos;
	private ObjectOutputStream oos;
	private FileInputStream fis;
	private ObjectInputStream ois;
	
	public Serialize(String newFileName) 
	{
		setFileName(newFileName);
	}
	
	public String getFileName()
	{
		return fileName;
	}
	
	public void setFileName(String newFileName)
	{
		fileName = newFileName;
	}
	
	public void SerializeCheck(CheckInOut check) throws IOException
	{
		// File initialize
		fos = new FileOutputStream(getFileName());
		oos = new ObjectOutputStream(fos);
		
		oos.writeObject(check.toString());
		oos.writeObject(check);
		oos.close();
		fos.close();
	}
	
	// A modifier pour retourner l'objet et non le string;
	public String getSerializeCheck() throws IOException, ClassNotFoundException
	{
		fis = new FileInputStream(getFileName());
		ois = new ObjectInputStream(fis);
		
		String msg = (String) ois.readObject();
		ois.close();
		fis.close();
		
		return msg;
	}
}
