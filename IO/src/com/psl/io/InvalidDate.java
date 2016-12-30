package com.psl.io;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InvalidDate {

	public static void main(String[] args) throws ParseException, InvalidDateException {
      String str="07-12-2015" ;
      try{
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		//sdf.isLenient();
		sdf.setLenient(false);
		Date d = sdf.parse(str);
		Date dd = new Date ();
		long l = d.getTime();
		long ll= dd.getTime();
		l= ll-l;
		l =l/(1000*60*60*24);
		l=l/365;
		System.out.println(l);
      }
      catch(ParseException pe){
    	  throw  new InvalidDateException();
      }

	}

}
