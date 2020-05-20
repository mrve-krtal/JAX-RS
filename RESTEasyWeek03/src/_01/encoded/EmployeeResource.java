package _01.encoded;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.ws.rs.Encoded;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/employee-encoded")
public class EmployeeResource {
	
	@Path("/greeting")
	@GET
	public String getGreetingMessage() {
		return "Hello JAX-RS Week3";
		
	}
/*
	@GET
	@Path("/getEmployeeNameEncoded")
	public String getEmployeeNameEncoded(@Encoded @QueryParam("name") String name) {
		return name;
	}
*/
	
	@GET
	@Path("/getEmployeeNameEncoded")
	//http://localhost:8080/RESTEasyWeek03/root-path/employee-encoded/getEmployeeNameEncoded?name=merve%20kartal
	public String getEmployeeNameEncodedAndDecoded(@Encoded @QueryParam("name") String name) throws UnsupportedEncodingException {
		String decoded = URLDecoder.decode(name,"UTF-8");
		return "decoded : "+ decoded + " encoded : " + name;
	}
	
	@GET
	@Path("/getEmployeeName")
	public String getEmployeeName(@QueryParam("name") String name) {
		return name;
	}

}
