package com.psl.demo;

import java.util.Scanner;

public class combi {
	static int flag = 0 ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

char a [][] = new char [3][3];
Scanner kb = new Scanner (System.in);
	for(int i =0 ;i<3;i++){
		for(int y=0;y<3;y++){
			a[i][y]=kb.next().charAt(0);
			
		}
	}
	
	
	for(int i =0 ;i<3;i++){
		for(int y=0;y<3;y++){
		System.out.print(a[i][y]+"   ");
			
		}
		
		System.out.println("\n");
	}
	
	
	
	
	
	
	
	
	if (diagnolCheck(a)==true )
	{
		System.out.println("winner is :" + a[1][1]);
		return ;
	}
	rowCheck(a);
	if (flag ==0)
	colCheck(a);
	
	
	}
	
	
	public static boolean diagnolCheck (char a [][])
	{
		if ((a[0][0]==a[1][1]&&a[1][1]==a[0][1])||(a[0][2]==a[1][1]&&a[1][1]==a[2][0]))
		{
			return true;
		}
		
		return false;
		
	}
	
	
	
	public static void  rowCheck (char a[][])
	{
		if ((a[0][0]==a[0][1]&&a[0][1]==a[0][2]))
		{
			System.out.println("Winner   is :" + a[0][1]);
			flag = 1;
			return;
		}
		else if ((a[1][0]==a[1][1]&&a[1][1]==a[1][2]))
		{
			System.out.println("Winner   is :" + a[1][1]);
			flag = 1;
			return;
		}
		else if ((a[2][0]==a[2][1]&&a[2][1]==a[2][2]))
		{
			System.out.println("Winner   is :" + a[2][1]);
			flag = 1;
			return ;
		}
		
	}
	
	
	
	public static void  colCheck (char a [][])
	{
		if ((a[0][0]==a[1][0]&&a[1][0]==a[2][0]))
		{
			System.out.println("Winner   is :" + a[1][0]);
			flag = 1;
			return;
		}
		else if ((a[0][1]==a[1][1]&&a[1][1]==a[2][1]))
		{
			System.out.println("Winner   is :" + a[1][1]);
			flag = 1;
			return;
		}
		else if ((a[0][2]==a[1][2]&&a[1][2]==a[2][2]))
		{
			System.out.println("Winner   is :" + a[1][2]);
			flag = 1;
			return ;
		}
		
	}
	
	
	
	
	
	
	
	
}
