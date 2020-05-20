package _05.json.jackson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer-json")
public class CustomerResourceJSON {

	@GET
	@Path("/customer")
	//http://localhost:8080/RESTEasyWeek03/root-path/customer-json/customer
	@Produces(MediaType.APPLICATION_JSON)
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
