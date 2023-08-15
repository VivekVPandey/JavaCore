package BasicCoreJava;

public class constructor {
	


	public void getData() {
		
		System.out.println("called a method");
		
	}
	
	public constructor() {
		
		
		System.out.println("this is constructor called");
		int i=0;
		int j=0;
	}
	
	public static void main(String[] args) {
		
		constructor c = new constructor();
		c.getData();
	}
}
