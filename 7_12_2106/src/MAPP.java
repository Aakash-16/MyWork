import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class MAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*HashMap< String , Integer> hm = new HashMap<String, Integer>();
		hm.put("Aakash Choudhary", 234400);
		hm.put("Doctor", 20);
		hm.put("ash Choudhary", 23333);
		hm.put("Kites", 2344004);
		hm.put("gym", 23444);
	//	System.out.println(hm);
       Set<Entry<String,Integer>> s =  hm.entrySet();
      // System.out.println(s.size());
       Entry<String,Integer> e;
       Iterator<Entry<String, Integer>> i = s.iterator();
       while (i.hasNext()){
    	e= i.next();
    System.out.println("key is :" +e.getKey());
    System.out.println("Value is :" + e.getValue());
    	System.out.println();   */
		//------------------------------------------------------------------------------------
		
		HashMap<String, Integer> a = new HashMap<String, Integer>();
	a.put("aakash", 1);
	a.put("muley", 2);
	a.put("Prateek", 3);
	a.put("bissa", 4);
	
	HashMap<String, Integer> b = new HashMap<String, Integer>();
	b.put("sarthak", 1);
	b.put("debal", 2);
	b.put("ankit", 3);
	b.put("gajju", 4);
	
	HashMap<String, Integer> c = new HashMap<String, Integer>();
	c.put("moulik", 1);
	c.put("sardar", 2);
	c.put("Himanshu", 3);
	c.put("Tinu", 4);
	
		HashMap<String , HashMap<String, Integer>> hm = new HashMap<String, HashMap<String,Integer>>();
		hm.put("COLLEGE", a);
		hm.put("SCHOOL", b);
		hm.put("HOME FRNDZ", c);
		Set<Entry<String, HashMap<String,Integer>>> s =hm.entrySet();
		
		Iterator<Entry<String, HashMap<String, Integer>>> i = s.iterator();
		Entry<String, HashMap<String, Integer>> e ;
		//HashMap<String, Integer> temp;
		while (i.hasNext()){
			e=i.next();
			System.out.println("Key is :" + e.getKey());
			System.out.println("Values are :");
			HashMap<String, Integer>  temp= e.getValue();
		Set<Entry<String, Integer>> etemp = temp.entrySet() ;
		Iterator<Entry<String, Integer>> ii = etemp.iterator();
		while (ii.hasNext()){
			Entry<String, Integer> ee = ii.next();
			System.out.println("Name : "+ee.getKey()+" Value : "+ee.getValue());
		}
		
		
       }
		
		
	}

}
