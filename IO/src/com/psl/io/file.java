package com.psl.io;

import java.io.File;
import java.io.IOException;

public class file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    File f = new File ("gfile.txt");
   // f.createNewFile();
  // System.out.println( f.exists());
   System.out.println(f.createNewFile());
	/*System.out.println(f.toString());
*/	
   System.out.println("Absolute Path "+f.getAbsolutePath());
   System.out.println("Canonical Path " +f.getCanonicalPath());
   System.out.println("Name is "+f.getName());
   System.out.println("Path is " + f.getPath());
	}

}
