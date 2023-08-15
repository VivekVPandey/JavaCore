package resources;

import java.io.*;
import java.util.*;

//import org.junit.internal.requests.FilterRequest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class utils {
	public static RequestSpecification req;

	public RequestSpecification reqSpec() throws IOException {
	
	if(req==null) {
		
	PrintStream log = new PrintStream(new FileOutputStream("logging.text"));
	req= new RequestSpecBuilder().
			setBaseUri(getGlobalValue("baseUrl")).
			addQueryParam("key", "qaclick123").
			addHeader("Content-Type", "application/json").
			addFilter(RequestLoggingFilter.logRequestTo(log)).
			addFilter(ResponseLoggingFilter.logResponseTo(log)).
			build();
	return req;
	}
	return req;
	}
	
	
	public static String getGlobalValue (String Key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream("src\\test\\java\\resources\\global.properties");
		prop.load(fs);
		return prop.getProperty(Key);
		
	}
	
	public String respJson(Response RespJs,String key) {
		
		String r = RespJs.asString();
		JsonPath js = new JsonPath(r);
		String value = js.getString(key);
		return value;
	}
	
	
}



