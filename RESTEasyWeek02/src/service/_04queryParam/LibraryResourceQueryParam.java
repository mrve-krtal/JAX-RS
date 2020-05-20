package service._04queryParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Path("/library-queryParam")
public class LibraryResourceQueryParam {
	
	@GET
	@Path("/book")
	//http://localhost:8080/RESTEasyWeek02/root-path/library-queryParam/book?id=100
	public String getBookById(@QueryParam("id") int id) {
		return "getBookById : "+id;
		
	}
	
	@GET
	@Path("/books")
	public String getBooks(@QueryParam("start") int start, @QueryParam("end") int end) {
		return "Book baþlangýnç : "+start+" Bitiþ : "+end;
		
	}
	
	@GET
	@Path("/book-uri-info")
	public String getBookUriInfo(@Context UriInfo uriInfo) {
		
		String	id=uriInfo.getQueryParameters().getFirst("id");
		return "getBookUriInfo : "+id;
	}

}
