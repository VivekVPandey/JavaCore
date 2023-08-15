package Serialization;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.entity.ContentType;

public class AddPlace {

	public static void main (String[] args) {
		
		
		
		addPlaces b = new addPlaces();
		b.setAccuracy(52);
		b.setName("Om Swaroop");
		b.setPhone_number("(+91) 983 893 3937");
		b.setAddress("29, wide layout, cohen 09");
		b.setWebsite("http://google.com");
		b.setLanguage("In-IN");
		
		ArrayList<String> myType = new ArrayList<String>();
		myType.add("sox park");
		myType.add("shop");
		b.setType(myType);	
		
		Location l = new Location();
		l.setLat(-19.383494);
		l.setLng(20.427362);
		b.setLocation(l);
		
		RequestSpecification req= new RequestSpecBuilder().
				setBaseUri("https://rahulshettyacademy.com").
				addQueryParam("key", "qaclick123").
				addHeader("Content-Type", "application/json").
				build();
		RequestSpecification GivenReq =  given().spec(req).body(b);

		ResponseSpecification thenVal = new ResponseSpecBuilder().
				expectStatusCode(200).
				expectBody("status", containsString("OK")).build();
		
//		addPlaceResponse Resp = GivenReq.
//									when().
//									post("maps/api/place/add/json").
//									then().
//									spec(thenVal).extract().response().as(addPlaceResponse.class);
//		
//		String RespStatus = Resp.getStatus();
//		String RespScope = Resp.getScope();
//		
//		System.out.println(RespStatus +"\t" + RespScope);
//		
//		assertEquals(RespStatus, "OK");
//		assertEquals(RespScope, "APP");
		
		
		Response resp = GivenReq.
				when().
				post("maps/api/place/add/json").
				then().
				spec(thenVal).extract().response();
		
		assertEquals(resp.statusCode(), 200);
		
		String r = resp.asString();
		
		JsonPath js = new JsonPath(r);
		String status = js.getString("status");
		String scope = js.getString("scope");
		assertEquals(status, "OK");
		assertEquals(scope, "APP");

									
		
	}
}
