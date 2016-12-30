import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		
		String str = "aakash";
	
		ArrayList< String> al = new ArrayList<String>();
	al.add("aakash");
		al.add("aakash");
		al.add(new String("pratreek"));
		al.add(new String("arpit"));
		al.add(new String("nilesh"));
		al.add(new String("anubhav"));
		System.out.println(al.contains(str));
		System.out.println(al.get(1)==al.get(0));
		HashSet<String> hs = new HashSet<String>();
		hs.add(new String("aakash"));
		hs.add("aakash");
		hs.add(new String("hashing"));
		System.out.println(hs);
	}

}
