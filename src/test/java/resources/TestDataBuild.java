package resources;

import java.util.ArrayList;

import Serialization.*;

public class TestDataBuild {
	
	public addPlaces addPlaceBody(String name, String number, String address) {
		
		
		
		addPlaces b = new addPlaces();
		b.setAccuracy(52);
		b.setName(name);
		b.setPhone_number(number);
		b.setAddress(address);
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
		return b;
	}
	

	public String deletePlace (String place_id) {
		
		return "{\r\n"
				+ "\r\n"
				+ "    \"place_id\":\""+place_id+"\"\r\n"
				+ "}";
	}
	
	public updatePlace updatePlace(String place_id) {
		
		updatePlace u = new updatePlace();
		
		u.setAddress("Andheri, Mumbai");
		u.setAddPlace(place_id);
		u.setKey("qaclick123");
		return u;
		
	}
}
