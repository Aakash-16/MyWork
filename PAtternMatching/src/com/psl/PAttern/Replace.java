package com.psl.PAttern;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("aakash");
		Matcher m = p.matcher("aakashs");
		/* StringBuffer sb =  new StringBuffer();
            while (m.find()){
            System.out.println(m.start());
              m.appendReplacement( sb, "|"); 
            }
         String s =    m.replaceAll("|");
         System.out.println(s);
         StringBuffer sb =  new StringBuffer();
         m.appendReplacement( sb, "|"); 
         m.appendTail(sb);
         System.out.println(sb); */
  System.out.println(m.matches());
	
	 String s ="aakash choudhary";
	 System.out.println(s.contains("aakash"));
	 System.out.println(s.contentEquals("aakash"));

	}

}
