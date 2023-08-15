import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import payload.AddPlace;
import payload.reusableCodes;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;



public class RestPractice {
	
	public static void main (String [] args) {
		
		System.out.println("asfd");
		// validate if Add Place API is workimg as expected 
		//Add place-> Update Place with New Address -> Get Place to validate if New address is present in response
				
				//given - all input details  - query param, header, body
				//when - Submit the API -resource,http method
				//Then - validate the response
		
		RestAssured.baseURI=("https://rahulshettyacademy.com");
		
		String respAddPlace = given().queryParam("key", "qaclick123").body(AddPlace.bodyData())
		.when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("status", equalTo("OK")).extract().body().asPrettyString();
		
		System.out.print(respAddPlace);
		
		JsonPath js = new JsonPath(respAddPlace);
		
		String placeID = js.getString("place_id");
		
		System.out.println(placeID);
		
		String adr = "vivek pandey, om swaroop ho/so";
		
		//Update place
		
		
		given().queryParam("key", "qaclick123").body("{\r\n"
				+ "\"place_id\":\""+placeID+"\",\r\n"
				+ "\"address\":\""+adr+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}").when().put("maps/api/place/update/json")
		.then().log().all().assertThat().body("msg", containsString("successful"));
		
		//get place
		
		String getResp = given().queryParam("place_id", placeID).queryParam("key", "qaclick123")
		.when().get("maps/api/place/get/json")
		.then().log().all().assertThat().body("address", equalTo(adr)).extract().asPrettyString();
		
//		JsonPath getPlace = new JsonPath(getResp);
		String respGet = reusableCodes.rawToJson(getResp);
		String getRespBody = respGet;
		
		Assert.assertEquals(getRespBody, adr);
		
		//delete place
		
		given().queryParam("key", "qaclick123").body("{\r\n"
				+ "\r\n"
				+ "    \"place_id\":\""+placeID+"\"\r\n"
				+ "}\r\n"
				+ "")
		.when().delete("maps/api/place/delete/json")
		.then().log().body().assertThat().statusCode(200);
		
		//get again
		
		String getResp1 = given().queryParam("place_id", placeID).queryParam("key", "qaclick123")
				.when().get("maps/api/place/get/json")
				.then().log().all().assertThat().statusCode(404).extract().asPrettyString();
				
				JsonPath getPlace1 = new JsonPath(getResp1);
				
				String getRespBody1 = getPlace1.getString("msg");
				
				Assert.assertTrue(getRespBody1.contains("failed"));
		
	}

}
