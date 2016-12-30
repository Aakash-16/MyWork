import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class tinm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s="16-10-1993";
		 SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy") ;
		Date d = null ;
	       try {
	d= sdf.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				       System.out.println(d);
       System.out.println(sdf.format(d));
	/*	String startDateString = "06/27/2007";
	    DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
	    Date startDate;
	    try {
	        startDate = df.parse(startDateString);
	        System.out.println(startDate);
	        String newDateString = df.format(startDate);
	        System.out.println(newDateString);
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }*/
	}

}
