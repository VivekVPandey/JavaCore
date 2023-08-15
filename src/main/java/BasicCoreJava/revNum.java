package BasicCoreJava;

import java.util.Scanner;

public class revNum {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		int og= num;
		int rev=0;
		s.close();

//		System.out.println(num);
//		
//		System.out.println(rev=rev*10+num%10);
//		System.out.println(num= num/10);
//		
//		System.out.println(rev=rev*10+num%10);
//		System.out.println(num= num/10);
//		
//		System.out.println(rev=rev*10+num%10);
//		System.out.println(num= num/10);
//		
//		System.out.println(rev=rev*10+num%10);
//		System.out.println(num= num/10);

		while(num!=0) {
			
		rev= rev*10+num%10;
		num=num/10;
			
		}
	
		System.out.println(rev);
		if(og==rev)
			System.out.println("Pali");
		else
			System.out.println("Not Pali");
		
		System.out.println(og%2);
		
	}
	

	

}
