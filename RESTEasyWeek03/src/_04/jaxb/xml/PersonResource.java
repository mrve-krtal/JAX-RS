package _04.jaxb.xml;

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

@Path("/person-jaxb-xml")
public class PersonResource {
	
		@GET
		@Path("/person")
		// http://localhost:8080/RESTEasyWeek03/root-path/person-jaxb-xml/person
		@Produces(MediaType.APPLICATION_XML)
		public Person getPerson() {
			
			Person person=new Person(1,"Merve","Kartal");
			return person;
		}
		
	//createMarshaller
		@GET
		@Path("/getPersonWithJaxbContext")
		@Produces(MediaType.APPLICATION_XML)
		public String getPersonWithJaxbContext() throws JAXBException {
			Person person = new Person(1, "merve", "Kartal");
			JAXBContext context = JAXBContext.newInstance(Person.class);
			StringWriter writer = new StringWriter();
			context.createMarshaller().marshal(person, writer);
			return writer.toString();
		}

	//Array2lere göre List daha fazla kullanýlýr
		@GET
		@Path("/personList")
		@Produces(MediaType.APPLICATION_XML) 	//APPLICATION_XML demezsek plain text olarak algýlar.
		//http://localhost:8080/RESTEasyWeek03/root-path/person-jaxb-xml/personList
		@Wrapped(element = "list", namespace = "http://foo.org", prefix = "foo") 	// <collection> ismini deðiþtirmek için 
		public List<Person> getPersonList() {
			
			Person person1=new Person(1,"Merve","Kartal");
			Person person2=new Person(2, "Abdulkadir", "Kartal");
			Person person3=new Person(3, "Emine", "Baðmancý");
			
			return Arrays.asList(person1, person2, person3);
			
		}
		
		@GET
		@Path("/personArray")
		//http://localhost:8080/RESTEasyWeek03/root-path/person-jaxb-xml/personArray
		@Produces(MediaType.APPLICATION_XML)
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
