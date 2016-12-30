package com.psl.polymorphism;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Parent p = new Parent ();
      Child c= new Child ();
     
     // Cars cc = new Cars();
      
    p = c ;
    p.show();
    p.have();
  System.out.println( c.a);
 ((Child)p).foo();
 
 Integer a = 10;
 
 switch(a )
 
 {
 
 }
	}

}
