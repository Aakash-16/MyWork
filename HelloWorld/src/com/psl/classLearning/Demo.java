package com.psl.classLearning;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	
	
	Scanner kb = new Scanner ( System.in );
 //  int   s = kb.nextInt();
//kb.nextLine();
 //  String  d = kb.next();

  // String q  = kb.nextLine();
   
//   System.out.println(s );
//   System.out.println(d);
//   System.out.println(q);
   
   
   
   int arr[] = new int [4];
   System.out.println(arr);
   
   int g [] = { 2,23,23};
  int h =  g.length;
  System.out.println(h );
  
  int fcuk [][] = new int [3][3];
  fcuk[0] = new int [3];
  fcuk[0][0]= 90 ; 
  System.out.println(fcuk.getClass().toString());
  System.out.println(fcuk[0].getClass().toString());
  System.out.println(fcuk[0][0]);
  int r [][][][] = new int [1][][][];
 
    int ghr [][] = new int  [2][2];                              
  ghr[0][1]= 67;
  System.out.println(ghr[1][1]);
}

}


abstract class Jio
{
	/** 
	 * Jio Jio jio ...
	 * :p
	 * 
	 * 
	 */
abstract protected void go (); 
}
