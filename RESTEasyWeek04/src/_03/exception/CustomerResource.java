package _03.exception;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/customer-exception")
public class CustomerResource {
	
	@GET
	@Path("/customer/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	//http://localhost:8080/RESTEasyWeek04/root-path/customer-exception/customer/1
	public Customer getCustomer(@PathParam("id") int id) {
		
		System.out.println("getcustomer is invoked");
		
		CustomerService customerService=new CustomerService();
		Customer customer=customerService.findCustomer(id);
		
		if(customer == null){
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
		return customer;
	}
}

//javax.ws.rs.WebApplicationException
