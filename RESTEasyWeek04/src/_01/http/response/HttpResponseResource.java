package _01.http.response;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/http-response")
public class HttpResponseResource {
	
	@GET
	@Path("/response200")
	//http://localhost:8080/RESTEasyWeek04/root-path/http-response/response200
	public String response200() {
		return "hello response200";
		
	}
	
	@GET
	@Path("/responseNull")
	//http://localhost:8080/RESTEasyWeek04/root-path/http-response/responseNull
	public String responseNull() {
		return null;
	}
	
	@POST
	@Path("/response405")
	//http://localhost:8080/RESTEasyWeek04/root-path/http-response/response405
	//Get gönderiðimizde 405 hatasý vercektir.
	//Post gönderdiðimizde bu metot çalýþcaktýr.
	public String response405() {
		return "response is invoked !";
	}

}
