package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/messages")
public class MessageService {
	
	@GET
	@Path("/greeting")
	

	// http://localhost:8080/RESTEasyWeek01Annotation/messages/greeting
	// http://localhost:8080/RESTEasyWeek01Annotation/root-path/messages/greeting
	public String getMessage() {
		
		return "Hello RESTEasy";
		
	}

}
