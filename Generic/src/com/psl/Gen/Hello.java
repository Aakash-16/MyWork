package com.psl.Gen;

public class Hello <T> {
  
	private T t;
	 public  Hello(T t){
		 this.t= t;
	 }
	
	 public void show()
	 {
		 System.out.println(t);
	 }
	
	
	
}
