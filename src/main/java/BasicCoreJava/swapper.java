package BasicCoreJava;

public class swapper {

	public int [] swap(int a, int b) {
		
		int temp= a;
		a=b;
		b=temp;
		
		int s[]= {a,b};
		return s;
	}
}
