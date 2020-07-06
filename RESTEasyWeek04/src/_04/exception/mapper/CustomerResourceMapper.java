package _04.exception.mapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import _03.exception.Customer;
import _03.exception.CustomerService;

@Path("/customer-exception-mapper")
public class CustomerResourceMapper {

	@GET
	@Path("/customer/{id}")
	//http://localhost:8080/RESTEasyWeek04/customer-exception-mapper/customer/1
	public Customer getCustomer(@PathParam("id") int id) {

		CustomerService service = new CustomerService();

		Customer customer = service.findCustomer(id);
		if (customer == null) {
			throw new CustomerNotFoundException("Could not find customer id : " + id);
		}
		return customer;

	}
}
