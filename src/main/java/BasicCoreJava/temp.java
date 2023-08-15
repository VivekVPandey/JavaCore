package BasicCoreJava;

import java.util.ArrayList;

public class temp {
public static void main(String[] args) {
	//Smallest no in an array
	
	int arr [] = {2,3,4,5,4};
	int min= Integer.MAX_VALUE;
	
	for(int i = 0; i<arr.length; i++)
	{
		
		if(arr[i]<min)
			min=arr[i];
		
	}

	System.out.println(min);
	
	
	ArrayList<Integer> s= new ArrayList<Integer>();
	
	String or= "this is the sent";
	String split [] = or.split(" ");
	
	System.out.println(split[1]);
}

	
}
