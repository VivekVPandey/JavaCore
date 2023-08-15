package BasicCoreJava;

public class BubbleSort {

	public static void main (String[] args) {
		
		int a [] = {3,5,6,8,0,2,1};
		swapper s = new swapper();

		for(int i=0;i<a.length;i++) {
			
			
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{	
//					swapping without using temp variable
//					a[i]=a[i]+a[j]; 
//					a[j] = a[i]-a[j];
//					a[i]= a[i]-a[j];
					
					//using temp var
					int result []= s.swap(a[i], a[j]);
					a[i]= result[0];
					a[j]= result[1];
				}
			}
			
		}
		
		for(int i=0; i<a.length;i++) {
			
			System.out.print(a[i]);
		}
	

	}
	
}
