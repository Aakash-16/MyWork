package com.psl.FileOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class buffer {

	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new FileReader(new File ("dfile.txt")));
	String str = null;int count =0;
	String s[] = null;
	while ((str= br.readLine())!=null){
		count++;
		System.out.println(str);
		str= str.trim();
		if (str.isEmpty()==true)
		{
			continue;
		}
		s= str.split("[ ]");
		for (String string : s) {
			System.out.println(string);
		}
		
	}
	System.out.println(count);

	}

}
