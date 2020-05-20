package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/messages")
public class MessageService {
	
	@GET
	@Path("/greeting")
	
	// @Path annotation ini ilgili HTTP istegine karsilik gelen URI bilgisini
	// tanimlamak icin kullandigimiz annotation dir.

	// The @javax.ws.rs.Path annotation in JAX-RS is used to define a URI
	// matching pattern for incoming HTTP requests.
	
	// http://localhost:8080/RESTEasyWeek02/root-path/messages/greeting
	public String getMessage() {
		
		return "Hello RESTEasy";
		
	}

}
