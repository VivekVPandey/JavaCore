package LibraryAPIAutomation;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import payload.reusableCodes;

import org.testng.*;
import static org.hamcrest.Matchers.*;


public class dataPass {

	public static String  addBook(String a, String b, String auth) {

		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		String resp = given().body(reusableCodes.addBookBody(a,b,auth))
		.when().post("Library/Addbook.php")
		.then().assertThat().statusCode(200).body("Msg", containsString("successfully"))
		.extract().body().asString();
		
		return resp;
			
	}
	
	public static String deleteBook (String id) {
		
		String respDel = given().log().all().body(reusableCodes.deleteBook(id))
		.when().log().all().delete("Library/DeleteBook.php")
		.then().log().all().assertThat().body("msg", containsString("successfully"))
		.extract().body().asPrettyString();
		
		return respDel;
	}
}
