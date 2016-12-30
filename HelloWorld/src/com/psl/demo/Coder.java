package com.psl.demo;

abstract  class Coder {
   
	static  void display(){
		System.out.println("in abtract clss ");
	}

	abstract void go (); 

}

/*protected class inner{

}


Protected class member (method or variable) is just like package-private (default visibility), except that it also can be accessed from subclasses.
Since there's no such concept as 'subpackage' or 'package-inheritance' in Java, declaring class protected or package-private would be the same thing.

You can declare nested and inner classes as protected or private, though. */