package LibraryAPIAutomation;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LibraryApiTestNG {

	@Test (dataProvider="addBookData")
	public void addBook(String isbn, String aisle, String auth) throws IOException
	{
		
		String resp = dataPass.addBook(isbn,aisle, auth);
		JsonPath js = new JsonPath(resp);		
		String id = js.getString("ID");
		
		System.out.println(id);
		
		//delete book
		
		String delResp = dataPass.deleteBook(id);
		JsonPath delJs = new JsonPath(delResp);
		
		String respMsg = delJs.getString("msg"); 
		
		Assert.assertEquals(respMsg, "book is successfully deleted");
		
	    System.out.println(new String(Files.readAllBytes(Paths.get("D:\\Users\\Public\\DummyJson.json"))));

	}
	
	@DataProvider (name = "addBookData")
	public Object[][]  dataAddBook()
	{
		
	return	new Object[][] {{"TestViv23","12","Nidhi"},{"TestNid23","12","Vivek"}};
	}
	
	
	
}


