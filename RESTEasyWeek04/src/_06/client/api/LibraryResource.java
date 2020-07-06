package _06.client.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/library-client-api")
public class LibraryResource {
	
	@GET
	@Path("/welcome")
	@Produces(MediaType.TEXT_PLAIN)
	public Response welcome() {
		
		ResponseBuilder builder=Response.ok("Welcome is invoked!");
		return builder.build();
	
	}
	
	@GET
	@Path("/book/{isbn}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getBookById(@PathParam("isbn") String isbn) {
		//assume that searched in DB.
		
		Book book=new Book(isbn, "Çin iþkencesi");
		ResponseBuilder builder=Response.ok(book);
		return builder.build();
	}
	
	@GET
	@Path("/bookXML")
	@Produces(MediaType.APPLICATION_ATOM_XML)
	//http://localhost:8080/RESTEasyWeek04/root-path/library-client-api/book/1
	public Response getBookByIdXML() {
		// assume that searched in DB.
		Book book=new Book("1","Çin Ýþkencesi");
		ResponseBuilder builder=Response.ok(book);
		return builder.build();
	}
}
