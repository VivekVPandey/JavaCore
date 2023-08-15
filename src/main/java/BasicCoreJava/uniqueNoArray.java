package BasicCoreJava;

import java.util.ArrayList;
import java.util.*;

public class uniqueNoArray {
	
	public static void main(String[] args) {
		//List how many times a no is repeated and check if there is any unique no
		
		int a []= {3,3,4,5,6,5,6,3,4,3,7};
		ArrayList<Integer> ar = new ArrayList<Integer>();
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		//Logic - check if no is present in array list
		//If not present then add in list and get into for loop 
		//Check if the no repeats, if repeats then increment counter
		
		for(int i=0; i<a.length;i++) {
			int k=0;
			if(!ar.contains(a[i])) {
				ar.add(a[i]);
				k++;
			for(int j=i+1; j<a.length;j++) {
				
				if (a[i]==a[j]) {
					k++;
				}
				
			}
			//System.out.println(a[i]+" "+k);
			hm.put(a[i], k);
			}
		}
		System.out.println("Value-Count");
		System.out.println(hm);
		System.out.println("Set contains unique values> "+hm.containsValue(1));
		if (hm.containsValue(1)==false) {
			
			System.out.println("There are no unique value");
		}
		Set s = hm.entrySet();
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			
		Map.Entry m = (Map.Entry)it.next();
		if(m.getValue().equals(1)) {
			
			System.out.println("Unique value/s: "+m.getKey());
		}
		
		
		}
	}

}
