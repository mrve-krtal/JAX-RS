package _05.json.jackson;

import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.jboss.resteasy.annotations.providers.jaxb.Wrapped;

@Path("/person-json")
public class PersonResourceJSON {
	
		@GET
		@Path("/person")
		// http://localhost:8080/RESTEasyWeek03/root-path/person-json/person
		@Produces(MediaType.APPLICATION_JSON)
		public Person getPerson() {
			
			Person person=new Person(1,"Merve","Kartal");
			return person;
		}
		

	//Array2lere göre List daha fazla kullanýlýr
		@GET
		@Path("/personList")
		@Produces(MediaType.APPLICATION_JSON) 	//APPLICATION_XML demezsek plain text olarak algýlar.
		//http://localhost:8080/RESTEasyWeek03/root-path/person-json/personList
		@Wrapped(element = "list", namespace = "http://foo.org", prefix = "foo") 	// <collection> ismini deðiþtirmek için 
		public List<Person> getPersonList() {
			
			Person person1=new Person(1,"Merve","Kartal");
			Person person2=new Person(2, "Abdulkadir", "Kartal");
			Person person3=new Person(3, "Emine", "Baðmancý");
			
			return Arrays.asList(person1, person2, person3);
			
		}
		
		@GET
		@Path("/personArray")
		//http://localhost:8080/RESTEasyWeek03/root-path/person-json/personArray
		@Produces(MediaType.APPLICATION_JSON)
		public Person[] getPersonArray() {
			
			Person person1=new Person(1,"Merve","Kartal");
			Person person2=new Person(2, "Abdulkadir", "Kartal");
			Person person3=new Person(3, "Emine", "Baðmancý");
			
			Person[] persons=new Person[] {person1, person2, person3};
			return persons;
		}


}

//JAXB -> Java Architecture for XML Binding
//Marshalling -> java objelerinin -> xml e donusme islemi
//Unmarshalling -> xml iceriginin java objelerine donusmesi
