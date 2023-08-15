package PojoPractice;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;


public class rahulCourses {
	
	public static void main(String[] args) throws IOException {
		
	
	
	String s = new String (Files.readAllBytes(Paths.get("D:\\JS\\Code.text")));
	String a = s.split("code=")[1];
	String code = a.split("&")[0];
	
	//System.out.println(code);
	
	
	//Extract access token 
	
	String tokenResp = given().urlEncodingEnabled(false)
	.queryParam("code", code)
	.queryParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
	.queryParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
	.queryParam("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
	.queryParam("grant_type", "authorization_code")
	
	.when().post("https://www.googleapis.com/oauth2/v4/token")
	.then().log().all().extract().response().asString();
	
	
	JsonPath js = new JsonPath(tokenResp);
	
	String accessToken = js.getString("access_token");
	
	System.out.println(accessToken);
	

	// Get rahul shetty courses
	
	//Using previous string methog
//	String coursesList = given().urlEncodingEnabled(false)
//	.queryParam("access_token", accessToken)
//	.queryParam("code", code)
//	.queryParam("scope", "email+openid+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email")
//	.queryParam("authuser", 0)
//	.queryParam("prompt", "none").expect().defaultParser(Parser.JSON)
//	
//	.when().get("https://rahulshettyacademy.com/getCourse.php")
//	.then().extract().response().asPrettyString();
//	
//	System.out.println(coursesList);
//	
//	JsonPath js1 = new JsonPath(coursesList);
//	
//	String instructor = js.getString("instructor");
//	
//	System.out.println(instructor);
	
	GetCourses gc = given().urlEncodingEnabled(false)
	.queryParam("access_token", accessToken)
	.queryParam("code", code)
	.queryParam("scope", "email+openid+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email")
	.queryParam("authuser", 0)
	.queryParam("prompt", "none").expect().defaultParser(Parser.JSON)
	
	.when().get("https://rahulshettyacademy.com/getCourse.php")
	.then().extract().response().as(GetCourses.class);
	
	System.out.println(gc.getLinkedIn());
	
	System.out.println(gc.getCourses().getWebAutomation().get(1).getCourseTitle());
	
	String expectedCypress = "Cypress";
	List<webAutomation> webAutomation = gc.getCourses().getWebAutomation();
	
	for (int i = 0; i< webAutomation.size(); i++)
		
	{
		if (webAutomation.get(i).getCourseTitle().equalsIgnoreCase(expectedCypress)) {
			
			System.out.println(webAutomation.get(i).getPrice());
			
		}
		
		System.out.println(gc.getCourses().getWebAutomation().get(i).getCourseTitle());
	}
	
	String [] titles = {"Rest Assured Automation using Java","SoapUI Webservices testing" };
	List<String> expectedTitles = Arrays.asList(titles);
	
	ArrayList<String> acutal = new ArrayList<String>();
	
	List<api> api = gc.getCourses().getApi();
	for(int j = 0; j< api.size(); j ++) {
		
		acutal.add(api.get(j).getCourseTitle());
	}
		
		Assert.assertTrue(acutal.equals(expectedTitles));
	
	}}
