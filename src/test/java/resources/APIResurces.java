package resources;

public enum APIResurces {
	
	AddPlaceApi("/maps/api/place/add/json"),
	deletePlace("/maps/api/place/delete/json"),
	getPlace("/maps/api/place/get/json"),
	updatePlace("/maps/api/place/update/json?");
	
	private String resource;
	
	APIResurces(String resource){
		
		this.resource=resource;
	}
	
	public  String getResouce() {
		
		return resource;
	}
	
}
