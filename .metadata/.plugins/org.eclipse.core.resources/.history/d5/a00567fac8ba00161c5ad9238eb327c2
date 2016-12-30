package com.psl.PAttern;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class PandM {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Pattern p = Pattern.compile("[,]");
	//	Matcher m = p.matcher("where(their is fuck), no luv0hahahah ");
		String a[] = p.split("aakash,persistent System Ltd,23-11-2016  ");
	   Calendar c = Calendar.getInstance();
	   c.set(2016, 10,23,0,0,0);
	   Date d = c.getTime();
	a[2]=a[2].trim();
	   SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	 //  sdf.f
	   Date dd = sdf.parse(a[2]);
	   Calendar cc=  Calendar.getInstance();
	   cc.setTime(dd);
	/*   System.out.println(a[0]);
	   System.out.println(a[1]);
	   System.out.println("dd :" +dd.getTime());
	    System.out.println(d.equals(dd));
	    System.out.println("d :"+d.getTime());
	    System.out.println(dd.compareTo(d));*/
	   System.out.println(c.equals(cc));
		
		
		

	}

}
