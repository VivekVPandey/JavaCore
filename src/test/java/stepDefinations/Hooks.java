//package stepDefinations;
//
//import java.io.IOException;
//
//import io.cucumber.java.Before;
//
//public class Hooks {
//
//	@Before("@DeletePlace")
//	public void beforeScenario () throws IOException {
//		
//		if(stepDefination.place_id==null) {
//		stepDefination m = new stepDefination();
//		m.the_user_add_place_payload_with("PreRequiName", "9090909090", "Mumbai, Andheri");
//		m.the_user_calls_with_post_https_request("AddPlaceApi", "post");
//		m.verify_that_is_added_using("PreRequiName", "getPlace");
//		}
//	}
//	
//	@Before("@UpdatePlace")
//	public void beforeUpdate () throws IOException {
//		
//		if(stepDefination.place_id==null) {
//		stepDefination m = new stepDefination();
//		m.the_user_add_place_payload_with("UpdatePreReq", "9090909090", "Mumbai, Andheri");
//		m.the_user_calls_with_post_https_request("AddPlaceApi", "post");
//		m.verify_that_is_added_using("UpdatePreReq", "getPlace");
//	}
//		
//}}
