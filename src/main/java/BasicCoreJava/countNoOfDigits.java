package BasicCoreJava;

import java.util.*;

public class countNoOfDigits {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		s.close();
		int count=0;
		int ev=0;
		int odd=0;
		int sum=0;
		while(n!=0) {
			count++;
			if(n%2==0)
				ev++;
			else
				odd++;
			sum=sum+n%10;
			n=n/10;
			
		}
		System.out.println("Count of digits: "+count);
		System.out.println("Count of even digits: "+ev);
		System.out.println("Count of odd digits: "+odd);
		System.out.println("Sum of digits: "+sum);

		
		
		//count no of even and odd digi
		
		
		
	}

}
