package BasicCoreJava;

import java.util.Scanner;

public class reverseString {
	public String revWordFor(String a) {
		
		String ogString = a;
		System.out.printf("Original word: %s%n",a);
		String rev="";
		
		for(int i=ogString.length()-1; i>=0; i--) {
			
			rev= rev+ ogString.charAt(i);
		}
		
		return rev;
		
	}

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a word");
		String ogWord=s.next();
		reverseString r = new reverseString();
		String rev= r.revWordFor(ogWord);
		System.out.println("Reversed Word: "+rev);
		s.close();
		
		if (rev.equalsIgnoreCase(ogWord)) 
			System.out.println("This is palidrome");
		else
			System.out.println("This is not pali");
		
		StringBuffer st= new StringBuffer();
		st.append(ogWord);
		System.out.println(st.reverse());
	}
	}