import static io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class codeBase {
	
	public static void main(String[] args) {
		

			Response RespJs =	given().
				baseUri("https://rahulshettyacademy.com").
				queryParam("key", "qaclick123").
				pathParam("key", "key=qaclick123").
				body("{\r\n"
						+ "\"place_id\":\"723f05ae2106cf74f9184cb5007c8110\",\r\n"
						+ "\"address\":\"Updated Address\",\r\n"
						+ "\"key\":\"qaclick123\"\r\n"
						+ "}").
			when().
				put("/maps/api/place/update/json?{key}").
			then().extract().response();
		
			String r = RespJs.asString();
			System.out.println(r);
			JsonPath js = new JsonPath(r);
			String value = js.getString("msg");
			System.out.println(value);
					
		}
	}
