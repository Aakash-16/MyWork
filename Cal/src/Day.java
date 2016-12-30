import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Day {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub"
		Scanner kb = new  Scanner(System.in);
		System.out.println(" please give  2  date ");
		String higher  = kb.next();
		String lower = kb.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
		  Date hd = sdf.parse(higher);
		  Date ld =sdf.parse(lower);
		  System.out.println(hd+"\n"+ld);
		   long high =  hd.getTime();
		   System.out.println(high);
		   long low = ld.getTime();
		   System.out.println(low);
		   long diff = high - low ;
		   diff = diff/(1000*60*60*24);
		   diff/=365;
		   System.out.println(diff);

	}

}
