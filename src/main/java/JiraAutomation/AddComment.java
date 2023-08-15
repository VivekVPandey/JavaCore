package JiraAutomation;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class AddComment {
	
	public static void main(String[] args) throws IOException {
		
		RestAssured.baseURI = ("http://localhost:8080");
		
		//Create session
		SessionFilter s = new SessionFilter();
		
		
		given().header("content-type", "application/json")
		.body( new String( Files.readAllBytes(Paths.get("D:\\JS\\JiraCredsJson.json"))))
		.filter(s)
		.when().post("rest/auth/1/session")
		.then().assertThat().statusCode(200).body("session.name", equalTo("JSESSIONID"));
		
//		//Add comment to a bug
//		
//		given().pathParam("id", "10105").header("content-type", "application/json")
//		.body( new String( Files.readAllBytes(Paths.get("D:\\JS\\AddCommentBody.json"))))
//		.filter(s)
//		.when().post("rest/api/2/issue/{id}/comment")
//		.then().assertThat().statusCode(201);
//		
//		//Adding attachment
//		
//		given().header("X-Atlassian-Token","no-check")
//		.header("content-type", "multipart/form-data")
//		.pathParam("key", "VIV-7")
//		.multiPart("file", new File ("JiraText.txt")).filter(s)
//		.when().post("rest/api/2/issue/{key}/attachments")
//		.then().log().all().assertThat().statusCode(200);
		
		
		//Get issue
		
		given().log().all()
		.pathParam("key", "VIV-7").filter(s)
		.when().log().all().get("rest/api/2/issue/{key}")
		.then().log().all().extract().response();
		
		
	}

}
