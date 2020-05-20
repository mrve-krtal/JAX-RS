package service._07headerParam;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;

@Path("/login-headerParam")
public class LoginResourceHeaderParam {
	
	@GET
	@Path("/userAgent")
	public String getUserAgent(@HeaderParam("user-agent") String userAgent) {
		return "getUserAgent : "+userAgent;
	}
	
	@GET
	@Path("/headerInformation")
	public String getHeadersInformation(@Context HttpHeaders headers) {
		String message=" ";
		for (String headerName : headers.getRequestHeaders().keySet()) {
			message=message+ "</br>"+headerName+" : "+headers.getRequestHeader(headerName);
		}
		return message;
	}

}
