package service._08cookieParam;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/user-cookieParam")
public class UserResourceCookieParam {
	
	@GET
	@Path("/addCookie")
	// http://localhost:8080/RESTEasyWeek02/root-path/user-cookieParam/addCookie
	public Response addcokie() {
		
		String resultMessage=" addCokie is invoked!";
		ResponseBuilder builder=Response.ok(resultMessage);
		builder.cookie(new NewCookie("cookieName", "cookieValue"));
		
		return builder.build();
		
	}
	//cookiler ozellesmis header bilgileridir.
	
	@GET
	@Path("/getCookie")
	// http://localhost:8080/RESTEasyWeek02/root-path/user-cookieParam/getCookie
	public Response getCookie(@CookieParam("cookieName") String cookie){
		String resultMessage="getCookie is involid ! ";
		ResponseBuilder builder=Response.ok(resultMessage+ " "+cookie);
		
		return builder.build();
	}
	
	@GET
	@Path("/getCookieWithContext")
	//http://localhost:8080/RESTEasyWeek02/root-path/user-cookieParam/getCookieWithContext
	public Response getCookieWithContext(@Context HttpHeaders headers) {
		String result="getCookieWithContext ";
		for (String name : headers.getCookies().keySet()) {
			Cookie cookie=headers.getCookies().get(name);
			result=result+" Cookie: "+cookie.getName()+" , "+cookie.getValue();
		}
		ResponseBuilder builder=Response.ok(result);
		return builder.build();
	}
}
