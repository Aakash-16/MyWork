package com.psl.io;

public class EnumRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String d = "WINTER";
Seasons s = Seasons.valueOf(d);
System.out.println(s.toString());
System.out.println(Seasons.WINTER==(s));
Seasons ss[] = Seasons.values();
for (Seasons seasons : ss) {
	System.out.println(seasons.toString());
}
		
		
	}

}
