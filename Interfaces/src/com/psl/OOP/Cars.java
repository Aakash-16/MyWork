package com.psl.OOP;

public   class Cars {
	
	 private int reg_no;
	 private String color;
	private String name ;
	
	
	//protected abstract void webx();
	 public Cars()
	{
		System.out.println(" in constructor of car");
	}
	public void setName (String s ){
//		System.out.println();
		this.name = s ;
	}
	
	 public static void  gif(){
	System.out.println("in gif of cars ");
	}
	
	protected void yee()
	{
		System.out.println("in yee");
	}
	

}
