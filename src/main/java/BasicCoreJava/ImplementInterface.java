package BasicCoreJava;

public class ImplementInterface implements TrafficLights,InterPractise{

	public static void main(String[] args) {
		
		TrafficLights a= new ImplementInterface();
		InterPractise b = new ImplementInterface();
		ImplementInterface c= new ImplementInterface();
		
		a.greenChalo();
		a.redRuko();
		a.orangeSlowDown();
		b.walkSignal();
		c.selfMethod();
				
		System.out.println(num);

	}
	
	public void greenChalo() {
		// TODO Auto-generated method stub
		System.out.println("Grreen");
	}

	public void redRuko() {
		// TODO Auto-generated method stub
		System.out.println("redRuko");

	}

	public void orangeSlowDown() {
		// TODO Auto-generated method stub
		System.out.println("orangeSlowDown");

	}

	public void walkSignal() {
		// TODO Auto-generated method stub
		System.out.println("This is another interface");
	}		
		
	public void selfMethod () {
		
		System.out.println("this one is impemented inhouse");
	}
	
}
