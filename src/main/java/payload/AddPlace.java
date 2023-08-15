package payload;

public class AddPlace {

	public static String bodyData()
	{
		return"{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -19.383494,\r\n"
				+ "    \"lng\": 20.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 52,\r\n"
				+ "  \"name\": \"Batla house\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, wide layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"sox park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"In-IN\"\r\n"
				+ "}";
	}
	
	

}
