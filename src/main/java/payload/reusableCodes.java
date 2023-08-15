package payload;

import io.restassured.path.json.JsonPath;

public class reusableCodes {

	public static String rawToJson  (String rawToJson) {
		
		JsonPath js = new JsonPath(rawToJson);
		String convertedText = js.getString("address");
		return convertedText;
	}
	
	public static String addBookBody(String isbn, String aisle, String auth)
	{
		
		return "{\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\""+auth+"\"\r\n"
				+ "}\r\n"
				+ "";
	}
	
	public static String deleteBook(String id) {
		
		return "{\r\n"
				+ "    \"ID\": \""+id+"\"\r\n"
				+ "}";
	}
}
