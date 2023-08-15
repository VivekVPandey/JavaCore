package BasicCoreJava;

public class largestOfNum {
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=50;
		
		System.out.println(Math.min(a, Math.min(b, c)));
		
		int largest= c<(a<b?a:b)?c:(a<b?a:b);
		System.out.println(largest);
		
	}

}
