import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;


public class Date2String {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//through this we can change Date object into string ...
		Date d = new Date ();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY") ;
        String s = sdf.format(d);
        System.out.println(s);
        //-------------------------------------------------------------------------------
        // this is worst dont  use below approch becoz it will not [parse the correct date ...
        //we can do this itz our mistake to parse string into data object we should use format as "dd-MM-yyyy
        s="1-9-2090";
       try {
		d= sdf.parse(s);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
       System.out.println(d);
       s=sdf.format(d);
       System.out.println(s);
       // if we need to set our own date and the converting it to Date Object and then to string
       Calendar c = new GregorianCalendar(2013, 0, 12);
        Date d2 = c.getTime();
        s= sdf.format(d2);
        System.out.println(s );
    		 c= Calendar.getInstance();
    		 c.setTime(d2);
    		 System.out.println(c.get(Calendar.YEAR));
    		 System.out.println(c.get(Calendar.MONTH)+1);
    		 System.out.println(c.get(Calendar.DAY_OF_MONTH));
		Calendar f = Calendar.getInstance();
		f.set(2017, 9, 16,0,0,0);
	 System.out.println(f.get(Calendar.YEAR));
//	  Date r=f.getTime();
//		System.out.println("value of l2"+r);
		long l2= f.getTimeInMillis();
		System.out.println(l2);
		Date o = new Date(f.getTimeInMillis());
		Calendar v = Calendar.getInstance();
		 v.set(2016, 9, 16,0,0,0);
//		 Date see = v.getTime();
//		 System.out.println("value of l" + see);
		long l = v.getTimeInMillis();
		System.out.println(l);
		l = l2-l;
		System.out.println(l);
		l= l/(60*60*24*1000);// Seconds ....
//		l = l/60; // min ...
//		l = l/60;// hrs ...
//		l = l/24; // days....
//		System.out.println(l);
//		System.out.println(o);
  
		
	Date z = new Date 
		ResultSet r =null;
	r.getDate(arg0)
	}

}
