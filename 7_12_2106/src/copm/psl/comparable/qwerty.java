package copm.psl.comparable;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

class Empp 
{
	int i =99;
}
public class qwerty {
	public static void main(String[] args) throws IOException {
		/*File f = new File ("do_it.ser");
		  f.createNewFile();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
		oos.writeObject(new Empp());
		*/
		
		
		Date d = new Date ();
		long l = d.getTime();
		java.sql.Date sd = new java.sql.Date(l);
		System.out.println(sd);
		Calendar c = Calendar.getInstance();
		c.setTime(sd);
		System.out.print(c.get(Calendar.DATE));
		System.out.print(" " +(c.get(Calendar.MONTH)+1));
		System.out.print(" "+c.get(Calendar.YEAR));
	}

}
