import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ScanFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
   Scanner kb = new Scanner(new File("Data.txt"));
  String str = null;
  String o[] = null;
   while ((kb.hasNextLine())==true){
	   str = kb.nextLine();
	     o= str.split("[,]");
	     
	    	 System.out.println("Name is :" + o[0]);

	    	 System.out.println("DOB is :" + o[1]);

	    	 System.out.println("Place is :" + o[2]);
	    	 
	    	 
	    	  /*int k = Integer.parseInt(o[3]);
	    	  k=k+k;*/
	    	  System.out.println("salary is :"+ o[3]);
	    	 System.out.println();
	    	 
	     
	    
   }
	}

}
