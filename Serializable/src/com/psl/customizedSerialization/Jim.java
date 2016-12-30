package com.psl.customizedSerialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Jim implements Serializable{
String  user = "ädministrator";
 transient String pwd = "rooot";
private void writeObject(ObjectOutputStream s ) throws IOException
{
/*s.defaultWriteObject();
pwd= pwd+"fuck uh ";
s.writeObject(pwd);*/
	s.writeChars(user);
	pwd = pwd+"fuck uh ";
	s.writeChars(pwd);
}
	
	private  void readObject(ObjectInputStream i ) throws ClassNotFoundException, IOException{
		/*
*/
		user = i.readLine();
		pwd = i.readLine();
	}

	@Override
	public String toString() {
		return "Jim [user=" + user + ", pwd=" + pwd + "]";
	}
	

	
	
}
