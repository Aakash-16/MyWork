package com.psl.FileOutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DataInputOUtput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File ("Data.txt");
		f.createNewFile();
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
		DataInputStream  dis = new DataInputStream(new FileInputStream(f));
		dos.writeDouble(123.455677888);
		

	}

}
