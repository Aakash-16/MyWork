package com.psl.Exploringinterfaces;

public interface Doable  {

	int VAL = 10;
	void show ();
	void display (int  a);
	 default void foo()
	{
		System.out.println("in fooo");
	}
	
	
	 default void hahha()
	 {
		 
	 }
	 
}
