
public class oAuthRest {
	
	public static void main(String[] args) {
		
		String a = "https://rahulshettyacademy.com/getCourse.php?code=4%2F0AbUR2VOd-JH4ycvx03oW256s76SO-mRi5agcxXSIjAKjBlP8innHT4frM5knuBmEbhRhEw&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=none";
		
		String b = a.split("code=")[1];
		
		String code = b.split(b)[0];
		
		System.out.println(code);
		
		//urlEncodingEnabled will prevent the script to convert characters like % and avoid breakin script
//		given() .urlEncodingEnabled(false).queryParams("code",code)

	}
           
}
