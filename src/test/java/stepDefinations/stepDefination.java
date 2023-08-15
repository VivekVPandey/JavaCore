package stepDefinations;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import Serialization.Location;
import Serialization.addPlaceResponse;
import Serialization.addPlaces;
import io.cucumber.java.en.*;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.TestDataBuild;
import resources.utils;

public class stepDefination extends utils {
	RequestSpecification GivenReq;
	ResponseSpecification thenVal;
	addPlaceResponse Resp;
	Response RespJs;
	TestDataBuild data = new TestDataBuild();

	@Given("The user Add Place Payload")
	public void the_user_add_place_payload() throws IOException {

		GivenReq = given().spec(reqSpec()).body(data.addPlaceBody("Vivek", "9898989898","marol"));
	
	}

	@When("The user calls {string} with POST https request")
	public void the_user_calls_with_post_https_request(String API) {

		RespJs = GivenReq.when().post("maps/api/place/add/json").
				then().log().all().extract().response();

	}

	@Then("The API got successful with status code {int}")
	public void the_api_got_successful_with_status_code(int code) {

		assertEquals(RespJs.getStatusCode(), code);
	}

	@Then("The {string} in response body is {string}")
	public void the_in_response_body_is(String Key, String ExpectedVal) {
		String r = RespJs.asString();
		JsonPath js = new JsonPath(r);
		String KeyVal = js.getString(Key);
		assertEquals(KeyVal, ExpectedVal);
	}

}
