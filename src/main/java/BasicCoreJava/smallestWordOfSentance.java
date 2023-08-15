package BasicCoreJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class smallestWordOfSentance {
	
	public static void main (String [] arg) {

		HashSet<String> hs = new HashSet<String>();
		ArrayList <String> a = new ArrayList<String>();
		String data = "Inside the loop, the current element (val[i]) "
				+ "is less than the current minimum (min),"
				+ " update secondMin with the previous value of min and update min with the new ";
		ArrayList <String> minWord=new ArrayList<String>();
		//String minIt="temp";
		
		String s [] = data.split(" ");
		
		for(int i=0; i<s.length; i++)
		{
			a.add(s[i]);
		}
		System.out.println(a);
		
		int min= Integer.MAX_VALUE;
		
		Iterator<String>it=	a.iterator();
		
		while(it.hasNext()) {
			
			System.out.print(it.next()+" ");
		}
		
				
		for (int i=0;i<a.size();i++)
		{
			
			if(a.get(i).length()<=min) {
				
				minWord.add(a.get(i));
				min=a.get(i).length();
			}
			
		}
		int l = minWord.size();
		System.out.println("Minimum word: "+minWord.get(l-1));
		System.out.println("Second Minimum word: "+minWord.get(l-2));

		
		
//Hasset
		
		for(int i=0; i<s.length; i++)
		{
			hs.add(s[i]);
		}
		System.out.println(hs);
		hs.add("sddsfsdf");
		hs.add("dfadfdsfsdfsdf");
		System.out.println(hs);
	
	}

}
