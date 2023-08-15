package BasicCoreJava;

public class statNonStat {
	
	String name;//instance variable
	String Sal;
	static String company="OMP";//Static var, shared with all methods in this obj
	static int i =0;

	statNonStat(String name, String Sal){
		
		this.name= name;
		this.Sal= Sal;
		i++;
		System.out.println(name+" "+Sal+" "+company);
		System.out.println(i);
	}
	public void getData() {
		
		System.out.println(company);
		System.out.println(name);
	}
	
	public static void main(String[] args) {

		statNonStat obj = new statNonStat("Vivke", "22LPA FIXED");
		
		company="OMP India";
		
		System.out.println(company + " "+ i);
		
		statNonStat obj1 = new statNonStat("Vivek Pandey", "22LPA FIXED");
		obj1.getData();
		//System.out.println(name);

		
	}

	
}
