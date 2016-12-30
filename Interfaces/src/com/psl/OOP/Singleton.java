package com.psl.OOP;

public class Singleton {
	
	static Singleton f;
	static int flag =0;
	int a , b;
	private  Singleton(int a , int b ){
		this .a = a;
		this.b= b;
	}
	static public Singleton ingleton(int a , int b ){

		if(flag==0){
		f = new Singleton(a,b);
		}
		flag++;
		return f;
	}

}
