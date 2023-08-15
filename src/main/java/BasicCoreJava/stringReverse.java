package BasicCoreJava;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class stringReverse {
	
	public String wordReverse(String word) {
		
		//Word reverse
				String og=word, rev="";
				char ch;
				
				for(int i=og.length()-1;i>=0;i--) {
					
					ch=og.charAt(i);
					rev=rev+ch;
				}
			return rev;
	}
	
public static void main(String[] args) {
		//Word reverse
		
		stringReverse sr= new stringReverse();

		System.out.println(sr.wordReverse("Vivek"));
		
		// Make a sentence camel casing

		String sent="this is test sentance",temp="";
		StringBuilder sb=new StringBuilder();
		String[] s=sent.split(" ");
		
		for(String word: s)
		{
			temp=word.substring(0, 1).toUpperCase()+word.substring(1).toLowerCase();
			
			sb.append(temp).append(" ");
		}
		
		System.out.println(sb);
		
		//Take the camel casing sentence and reverse it
		
		ArrayList<String> revSent= new ArrayList<String>();
		
		for (int i=(s.length-1);i>=0;i--) {
			
			revSent.add(sr.wordReverse(s[i]));
			
		}
		System.out.println(revSent);
		String ultaSentence="";
		for(String tword:revSent) {
			
			ultaSentence=ultaSentence+tword+" ";
			
		}
		
		System.out.println(ultaSentence);
		
	}	
	
	
	
	
}
