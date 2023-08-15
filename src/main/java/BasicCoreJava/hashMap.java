package BasicCoreJava;

import java.util.*;

public class hashMap {
	
	
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Vivek");
		hm.put(4, "Pandey");
		hm.put(5, "Test");
		hm.put(98, "Automation");

		System.out.println(hm.get(98));
		System.out.println(hm.size());
		Set es = hm.entrySet();
		System.out.println(es);
		
		Iterator it = es.iterator();
	
		while(it.hasNext()) {
		Map.Entry mp = (Map.Entry)it.next();	
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
		}
	
		HashMap<String, String> ss = new HashMap<String, String>();

		ss.put("Name", "Vivek");
		ss.put("Sal", "22LPA");

		System.out.println(ss);
		
		Set s =ss.entrySet();
		System.out.println(s);
		
		Iterator t = s.iterator();
		Map.Entry m = (Map.Entry)t.next();
		System.out.println(m);
		System.out.println(m.getValue());
		
 	}

}
