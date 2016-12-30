package com.psl.PAttern;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

  public class Datee {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
/*		
		Calendar c = Calendar.getInstance();
		c.set(2016, 11, 25);
        Date d , dd;
        d= c.getTime();
        
        
        c.set(2016, 11, 25);
        dd= c.getTime();
        
        
        System.out.println("Date of d in long - " + d.getTime());
        System.out.println("Date of dd in long - " + dd.getTime());
        
    System.out.println(d.equals(dd));*/
		
		
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date d = sdf.parse("23-11-2016");
		System.out.println(d);
		Calendar c = Calendar.getInstance();
		c.set(2016, 10, 23,00,00,00);
		Date dd = c.getTime();
		System.out.println(dd);
		
		
		System.out.println("Date of d in long " + d.getTime());
		System.out.println("Date of dd in long " +dd.getTime());
		
		System.out.println(d.equals(dd));
		
/*		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date d, dd;
		d = sdf.parse("11-11-2011");
		dd = sdf.parse("11-11-2011");
		System.out.println(d.equals(dd));*/
		

	}
}
