import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;


public class debug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<HashMap<String, String>> hs = new HashSet<HashMap<String,String>>();
		HashMap<String, String> a = new HashMap<String, String>();
		a.put("A", "raat aur din");
		a.put("B", " The Papa");
		a.put("C", "Conception");
		a.put("D", "Non-Primer");
		HashMap<String, String> b = new HashMap<String, String>();
		b.put("A", "Ae dil hai mushklil");
		b.put( "B", "Jangal");
		b.put("C", "Hum aap ke hai cone");
		b.put("D", "Ek baal");
		
		hs.add(a);
		hs.add(b);
		String search = "Jangal";
		int count = 0;
		for (HashMap<String, String> hashMap : hs) {
			Set<Entry<String, String>> s = hashMap.entrySet();
			for (Entry<String, String> entry : s) {
				count ++;
				   if (entry.getValue().equalsIgnoreCase(search)){
					   hashMap.replace(entry.getKey(), search, "i got uh ....:P");
					   break;
				   }
				
				
				
			}
             
		}
		
		System.out.println(count);
		
		
		System.out.println("<--------------------------------------------------------------------->");
		for (HashMap<String, String> hashMapp : hs) {
			//hashMapp.replace("Esh", "123456");
			Set<Entry<String, String>> so = hashMapp.entrySet();
			for (Entry<String, String> entry : so) {
				 
				System.out.print(entry.getKey());
				System.out.println(" "+entry.getValue());
			}
		}

	}

}
