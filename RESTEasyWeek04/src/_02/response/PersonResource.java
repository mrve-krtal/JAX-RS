package _02.response;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/person-path")
public class PersonResource {
	
	//Response ile cookie ekleme
	@GET
	@Path("/name")
	//http://localhost:8080/RESTEasyWeek04/root-path/person-path/name
	// javax.ws.rs.core.Response
	// javax.ws.rs.core.Response.ResponseBuilder
	public Response getPersonName() {
		
		String name="merve";
		ResponseBuilder builder=Response.ok(name);
		//
		builder.header("myHeader", "value");
		builder.cookie(new NewCookie("myCookie","cookieValue"));
		//
		return builder.build();
		
	}
	//Response ile liste ekleme
	@GET
	@Path("/persons")
	@Produces(MediaType.APPLICATION_JSON)
	//http://localhost:8080/RESTEasyWeek04/root-path/person-path/persons
	public Response getAllPersons() {
		
		Person person1=new Person(100, "Merve", "Kartal");
		Person person2=new Person(200, "Abdulkadir", "Kartal");
		Person person3=new Person(300, "Hüseyin", "Saðlam");
		
		List<Person> persons=Arrays.asList(person1,person2,person3);
		
		//return Response.ok(persons).build();
		
		//Alttaki de legaldir.
		GenericEntity<List<Person>> genericEntity=new GenericEntity<List<Person>>(persons){};
		return Response.ok(genericEntity).build();
		
	}
	
	@GET
	@Path("/personList")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> getPersonList(){
		Person person1=new Person(100, "Merve", "Kartal");
		Person person2=new Person(200, "Abdulkadir", "Kartal");
		Person person3=new Person(300, "Hüseyin", "Saðlam");
		
		return Arrays.asList(person1,person2,person3);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
