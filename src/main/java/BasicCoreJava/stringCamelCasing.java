package BasicCoreJava;


public class stringCamelCasing {
public static void main(String[] args) {
	
	String a= "my name is vivek";
	String[] s= a.split(" ");
	StringBuilder c= new StringBuilder();

for(String word : s) {
	 String temp= word.substring(0,1).toUpperCase()+word.substring(1);
	 c.append(temp).append(" ");
	 
	 //my > My > My 
	 //name > Name > My Name
}
System.out.println(c);
	
}
}
