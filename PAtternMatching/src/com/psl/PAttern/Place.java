package com.psl.PAttern;

import java.io.IOException;

public class Place {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String s = "aakash Choudhary, , 1293";
/*Pattern p  = Pattern.compile(",");
String a [] = p.split(s);
for (int i =0 ; i <a.length;i++){
	a[i] = a[i].trim();
	System.out.println(a[i] +"   " + a[i].length());
}
 char  aa[] = {'a', 'a','k','a','s','h'};
 String f ;
 f= String.copyValueOf(aa);
 System.out.println(f);
 s="irish";
 System.out.println(s.endsWith("ish"));
 s.getChars(0, 5, aa, 0);
 for (int i =0 ; i<aa.length;i++){
	 System.out.println(aa[i]);
 }*/
String a []=s.split(",");
 for (int i =0;i<a.length;i++) {
	 System.out.println(a[i]);
	
}
 String fg = String.join(",", "hello"," world ");
 System.out.println(fg);
	
	String  vv = " Hello guyz  i m Aakash Choudhary";
	vv=vv.replaceAll("Aakash", "school");
	System.out.println(vv);
	}

}
