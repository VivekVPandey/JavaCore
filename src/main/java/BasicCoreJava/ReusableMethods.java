package BasicCoreJava;

public class ReusableMethods {
	
	public static int abd = 5;
	
	public  StringBuffer reverseit (String a) {
//		int length = a.length();
//		String b = "";
//
//		for (int i=length-1 ; i>=0; i--) {
//			b= b+a.charAt(i);
//			
//		}
//		System.out.println("This is ulta char "+ b);
		
		StringBuffer b = new StringBuffer(a);
		
		
		return b;
}

public void checkPalindrome (String actual, String reversed) {
	
	if (actual.equalsIgnoreCase(reversed))
	{
		System.out.println("Ulta: " + actual+ " is equal to seedha: "+reversed);
	}
	else {
		System.out.println("Ulta is not seedha");
	}
	
}

	public void percentIncrement (double c, double inc) {
		
		double diff = inc-c;
		double incPer= (diff/c)*100;
		
		System.out.println(incPer);
		
	}
	
	public  void SeqNoAscRows() {

		
		int k =1;
		for(int i= 4 ; i>0; i--) {
			
			
			for (int j=0; j<5-i ; j++) {
				System.out.print(k);
				k++;
				System.out.print("\t");
			}
			System.out.println("");
			}

//		1	
//		2	3	
//		4	5	6	
//		7	8	9	10
		
	}
	
	public void reInitializeAsc() {
		
		for(int i= 4 ; i>0; i--) {
			
			int k =1;
			for (int j=0; j<5-i ; j++) {
				System.out.print(k);
				k++;
				System.out.print("\t");
			}
			System.out.println("");
//			1	
//			1	2	
//			1	2	3	
//			1	2	3	4	

	}}
	

}