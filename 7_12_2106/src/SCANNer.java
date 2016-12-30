import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SCANNer {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner  kb = new Scanner(new File ("new.txt"));
	String str = null ;
	int count =0;
		while (kb.hasNextLine())
	{  str= kb.nextLine();
		System.out.println(str );
		count ++;
	}
 System.out.println(count);
kb.close();
                       
	}

}
