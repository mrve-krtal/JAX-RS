package _04.jaxb.xml;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer-jaxb-xml")
public class CustomerResource {

	@GET
	@Path("/customer")
	//http://localhost:8080/RESTEasyWeek03/root-path/customer-jaxb-xml/customer
	@Produces(MediaType.APPLICATION_XML)
	public Customer getCustomer() {
		
		Customer customer=new Customer();
		customer.setId(1);
		customer.setName("Merve");
		
		Address address=new Address();
		address.setCity("Ýstanbul");
		address.setZip("34000");
		
		customer.setAddress(address);
		return customer;
		
	}
}
