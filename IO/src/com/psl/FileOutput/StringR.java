package com.psl.FileOutput;

import java.io.IOException;
import java.io.StringReader;

public class StringR {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		
		StringReader sr = new StringReader("hello,welcome to java");
		char c[] = new char [5];
		System.out.println(sr.read(c,0,c.length));
		for (char d : c) {
			System.out.println(d);
		}
	}

}
