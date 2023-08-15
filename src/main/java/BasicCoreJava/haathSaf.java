package BasicCoreJava;

public class haathSaf {

	public static void main(String[] args) {      
     
      int val [] = {4, 2, 4, 0,9};
      int min = val[0];
      int min2 = Integer.MAX_VALUE;

      for (int i=1; i < val.length; i++)
      {
        if(val[i]<min)
        {
        	min2= min;
        	min = val[i];

        }
        else if(val[i] < min2 && val[i] != min) {
        	
            min2 = val[i];

        }
        
      }
          System.out.println("Min value is: "+min);
          System.out.println("Min value is: "+min2);


      
  }

}
