import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Temporaryyy {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("Aakash choudhary");
       int a[] = new int[4];
		Arrays.fill(a,45);
		for (int i : a) {
			System.out.println(i);
		}
		Date d = new Date ();
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.DAY_OF_MONTH, 2-1);
		d = c.getTime();
		System.out.println(d);
		int i = 2;
   String sts = "aakash";
    int ii = 2;
    if (sts.equals("aakash")&&(ii==1||ii==2||ii==3)){
    	
    	System.out.println(ii);
    	ii++;
    }
		
		
		
	}

}
