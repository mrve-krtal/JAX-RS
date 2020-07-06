package _01.conneg.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import _01.model.Customer;

@Path("/customer-root")
public class CustomerResource {

	@GET
	@Path("/hello")
	//http://localhost:8080/RESTEasyWeek05/root-path/customer-root/hello 
	public String hello() {
		return "it is works !";
	}
	
	//Bu kod blo�unda duplicate yapmam�� oldum. hem xml hem json format�n� bir arada kullanabilirim..
	//q->MINE Type de�erli 0.0 ile 1.0 aras�ndad�r, s�ralamas� b�y��e g�re s�ralan�r.
	//Accept : application/xml, application/json 	s�ralama ilk yaz�landad�r.
	//Accept : application/xml;q=0.6, application/json 	q type oldu�u i�in b�y��e g�re s�ralan�r.
	
	@GET
	@Path("/customerFormat")
	//http://localhost:8080/RESTEasyWeek05/root-path/customer-root/customerFormat
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Customer getCustomerFormat() {
		
		System.out.println("getCustomerFormat");
		return new Customer(1,"Merve");
		
	}
	
	@GET
	@Path("/customer")
	//http://localhost:8080/RESTEasyWeek05/root-path/customer-root/customer
	@Produces(MediaType.TEXT_HTML)
	public String getCustomerText() {
		
		System.out.println("getCustomerText");
		return new Customer(1,"Merve").toString();
		
	}
	@GET
	@Path("/customer")
	//http://localhost:8080/RESTEasyWeek05/root-path/customer-root/customer
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomerJSON() {
		
		System.out.println("getCustomerJSON");
		return new Customer(1,"Merve");
		
	}
	@GET
	@Path("/customer")
	//http://localhost:8080/RESTEasyWeek05/root-path/customer-root/customer
	@Produces(MediaType.APPLICATION_XML)
	public Customer getCustomerXMLt() {
		
		System.out.println("getCustomerXML");
		return new Customer(1,"Merve");
		
	}
	

}
