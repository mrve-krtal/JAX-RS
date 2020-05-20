package _02.context;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

@Path("/context")
public class ContextResource {
	
	// javax.ws.rs.core.HttpHeaders
	// javax.ws.rs.core.UriInfo
	// javax.ws.rs.core.Request
	// javax.servlet.http.HttpServletRequest
	// javax.servlet.http.HttpServletResponse
	// javax.servlet.ServletConfig
	// javax.servlet.ServletContext
	// javax.ws.rs.core.SecurityContext

	@GET
	@Path("/servletContext")
	//http://localhost:8080/RESTEasyWeek03/root-path/context/servletContext
	public String injectionServletContext(@Context ServletContext context) {
		
		String contextPath=context.getContextPath();
		return contextPath;
	}
	
	@GET
	@Path("/request")
	//http://localhost:8080/RESTEasyWeek03/root-path/context/request
	public String injectionHttpServletRequest(@Context HttpServletRequest request) {
		
		String pathInfo=request.getPathInfo();
		return pathInfo;
		
	}

}
