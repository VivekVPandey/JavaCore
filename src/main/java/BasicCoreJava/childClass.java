package BasicCoreJava;

public class childClass extends parentClass{
	
	String a = "This string is defined at object level";

	public void getData() {
		System.out.println("inside child class");
		System.out.println(super.name);
		String a = "This string is defined at method level";
		System.out.println(a);
		System.out.println(this.a);

		
	}
	
//	public childClass() {
//
//		System.out.println("this is child constructor");
//	}
	
	public static void main(String[] args) {
		
		String name= "ChildName";
		System.out.println(name);
		childClass d = new childClass();
		d.getData();

	}
	
}
