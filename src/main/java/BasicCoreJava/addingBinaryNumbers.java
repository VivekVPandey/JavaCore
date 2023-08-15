package BasicCoreJava;

import java.util.ArrayList;
import java.util.Scanner;

public class addingBinaryNumbers {
	
	public static void main(String[] args) {
		
//		int a = (int) Integer.parseInt(x,2);
//		System.out.println(Integer.toBinaryString(a));
		
		Scanner s= new Scanner(System.in);
		
		String b1 = s.next();
		String b2= s.next();
		s.close();
		
		int a1= (int) Integer.parseInt(b1,2);
		int a2= (int) Integer.parseInt(b2,2);
		
		int sum= a1+a2;
		
		System.out.println(Integer.toBinaryString(sum));
		
	
	}


}
