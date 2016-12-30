import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;


public class ME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("kick", 15);
		hm.put("Assasin", 5);
		hm.put("creade", 1);
		hm.put("ice hockey", 85);
Set<Entry<String, Integer>>	 se = hm.entrySet();
for (Entry<String, Integer> entry : se) {
	System.out.println("key : "+entry.getKey());
	System.out.println("values : "+ entry.getValue());
}*/
		
		HashSet<HashMap<String, String>> hs = new HashSet<HashMap<String,String>>();
		HashMap<String, String> a = new HashMap<String, String>();
		a.put("Englh", "raat aur din");
		a.put("Eish", " The Papa");
		a.put("Esh", "Conception");
		a.put("Enh", "Non-Primer");
		HashMap<String, String> b = new HashMap<String, String>();
		b.put("Hindi", "Ae dil hai mushklil");
		b.put( "Hindi", "Jangal");
		b.put("Hindi", "Hum aap ke hai cone");
		b.put("Hindi", "Ek baal");
		
		hs.add(a);
		hs.add(b);
		for (HashMap<String, String> hashMap : hs) {
			hashMap.replace("Esh", "123456");
			Set<Entry<String, String>> s = hashMap.entrySet();
			for (Entry<String, String> entry : s) {
				 
				System.out.print(entry.getKey());
				System.out.println(" "+entry.getValue());
			}
			
			 System.out.println("<--------------------------------------------------------------------->");
			/*for (HashMap<String, String> hashMapp : hs) {
				//hashMapp.replace("Esh", "123456");
				Set<Entry<String, String>> so = hashMapp.entrySet();
				for (Entry<String, String> entry : so) {
					 
					System.out.print(entry.getKey());
					System.out.println(" "+entry.getValue());
				}*/
		
		
		
		
		
		



		
		
	}
	}
}

