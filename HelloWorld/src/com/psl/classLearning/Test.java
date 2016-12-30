/**
 * 
 */
package com.psl.classLearning;

/**
 * @author Administrator
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte  b = 10 ;
		// when we do this the java implicitly  narrows the integer value to byte.......( implicit narrow conversion ) 
      byte c = ( byte)  130 ;
      
      float  arr [] = new float [3] ;
     // System.out.println( arr[2]);// null pointer exception .......
   //   arr.getClass()args.toString();    
  Class q =   arr.getClass();
//  System.out.println( q.toString());
  
  
  
  for (float  i : arr) {
//	System.out.println( i );
}
   dog dd [] = new dog[2];
   dd[0] = new dog (23);
 //  System.out.println(dd.getClass().toString());
 // System.out.println(dd[0]);
  
//new Test(). go ();
  
  dog di = new dog (2);
  System.out.println(di);
	}
	
	public void go ()
	{
		String arr [] = null;
		
		main(arr);
	}

}


class dog 
{
	
	
	
	int a ;
	
	dog (int a){
		this .a = a ;
	}
	
	public String toString (){
		return "hahahahhhha";
		
	}
	
}