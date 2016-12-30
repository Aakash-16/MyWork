package com.psl.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(new File ("file.txt"));
		String str ;
		while (kb.hasNext()){
			str = kb.next();
			//System.out.println(str);
		str = 	str.toUpperCase();
		//System.out.println(str);
		if (str.equalsIgnoreCase(Seasons.RAINY.toString()))
		System.out.println(" hey guyz we have done it ");
			
		}

	}

}
