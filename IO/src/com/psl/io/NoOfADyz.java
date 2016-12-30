package com.psl.io;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class NoOfADyz {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
    Scanner kb = new Scanner(System.in);
    String date = kb.next();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    Date d = sdf.parse(date);
    Date now = new Date ();
    Calendar given = Calendar.getInstance();
    given.setTime(d);
    given.add(Calendar.MONTH, 1);
   now = given.getTime();
   System.out.println(sdf.format(now));
   
	}

}
