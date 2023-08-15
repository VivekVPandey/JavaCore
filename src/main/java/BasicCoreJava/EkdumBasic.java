package BasicCoreJava;

public class EkdumBasic {

	public static void main(String[] args) {
		
	
//	String Input = "1eevee1";
//	ReusableMethods r = new ReusableMethods();
//	
//	StringBuffer ReversedInput = r.reverseit(Input);
//	System.out.println(ReversedInput);
//	String rev =ReversedInput.toString();
//	r.checkPalindrome(Input,rev);
//	
//	double current= 1700000;
//	double offer= 2500000;
//
//	r.percentIncrement(current, offer);
	
		int i = 0;
		int j =5;
		int k;
try {
	k=j/i;
	
	System.out.println(k);
}


catch (Exception e) {

System.out.println(e+" catched");
}	
	

finally {
System.out.println("catch not added");	
}

System.out.println("execution won't stop due to try catch");

}}
