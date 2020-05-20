package service._06fromParam;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.jboss.resteasy.annotations.Form;

@Path("/person-fromParam")
public class PersonResourceFromParam {
	
	@POST
	@Path("/addPerson")
	public String addPerson(@FormParam("name") String name, @FormParam("surname") String surname) {
		
		return "insert OK.... " + name + " " + surname;
	}
	
	@POST
	@Path("/addPersonFormAnnotation")
	public String addPersonFormAnnotation(@Form Person person) {
		return "addPersonFormAnnotation "+person.toString();
		
	}
}

