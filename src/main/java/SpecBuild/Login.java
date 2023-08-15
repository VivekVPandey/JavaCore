package SpecBuild;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.hamcrest.text.IsEqualIgnoringCase;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Login {
	
	public static void main(String[] args)  throws Exception
	{
		
	//Login
	RequestSpecification req =new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
			.setContentType(ContentType.JSON).build();
	ResponseSpecification resp = new ResponseSpecBuilder().expectStatusCode(200).build();

	loginPayload b = new loginPayload();
	
	b.setUserEmail("Vivekp@test.com");
	b.setUserPassword("Asdf@123");
	
	RequestSpecification reqSp = given().spec(req).body(b);
	loginResponse respLogin = reqSp.when().post("/api/ecom/auth/login").then().log().all().spec(resp).extract().response().as(loginResponse.class);
	
	String token = respLogin.getToken();
	String userID = respLogin.getUserId();
	String message = respLogin.getMessage();
	
	System.out.println(token);
	System.out.println(userID);
	
	//Add product
	
	RequestSpecification reqAddPro = new RequestSpecBuilder().
				setBaseUri("https://rahulshettyacademy.com").
				addHeader("Authorization", token).build();
	
	ResponseSpecification respSpecThen = new ResponseSpecBuilder().expectStatusCode(201).build();
	
	RequestSpecification addProductGiven = given().spec(reqAddPro).
			param("productName", "Laptop").
			param("productAddedBy", userID).
			param("productCategory", "fashion").
			param("productSubCategory", "shirts").
			param("productPrice", "11500").
			param("productDescription", "Lenova").
			param("productFor", "men").
			multiPart("productImage",new File ("D:\\API\\ProductImage.png"));

	addProductSpec respAddProductBody = addProductGiven.when().
			post("api/ecom/product/add-product").
			then().
			spec(respSpecThen).
			extract().
			response().
			as(addProductSpec.class);
	
	System.out.println("Product ID is: "+respAddProductBody.getProductId());
	
	
	//Create order
	
	RequestSpecification reqCreateOrder = new RequestSpecBuilder().
			setBaseUri("https://rahulshettyacademy.com").
			addHeader("authorization", token).
			setContentType(ContentType.JSON).build();
	
		orderBodyList orderData = new  orderBodyList();
		orderData.setCountry("India");
		orderData.setProductOrderedId(respAddProductBody.getProductId());
		
		List <orderBodyList> orderDetails = new ArrayList <orderBodyList> ();
		orderDetails.add(orderData);
		
		System.out.println(orderDetails.get(0).getCountry());
		
		orderBodySpec order = new orderBodySpec();
		 
		order.setOrders(orderDetails);
	RequestSpecification reqOrder =	given().spec(reqCreateOrder).body(order);
	
	ResponseSpecification orderThen = new ResponseSpecBuilder().expectStatusCode(201).build();
	
	createOrderRespBody responseBody = reqOrder.when().post("/api/ecom/order/create-order").then().spec(orderThen).extract().as(createOrderRespBody.class);

	System.err.println(responseBody.getMessage());
	System.err.println(responseBody.getOrders());

	
	//Order delete
//	
//	RequestSpecification reqdelete = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addHeader("authorization", token).build();
//	
//	ResponseSpecification respThen = new ResponseSpecBuilder().expectStatusCode(DEFAULT_PORT)
//	
}

	}
