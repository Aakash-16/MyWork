package com.psl.FileOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stu
		File f = new File ("copy_a.png");
		
		f.createNewFile();
		File fd = new File("a.png");
		 long l = fd.length();
	
		 System.out.println(l);
	FileOutputStream fos = new FileOutputStream(f);
	FileInputStream  fis = new FileInputStream(fd);
	//
	//File f = new File ("copy_a.png");
	byte b [] = new byte[(int)l];
	fis.read(b);
	fos.write(b);
		System.out.println(f.length());
	
	
		}

}
