package service._01path;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/customer-path")
public class CustomerResource {

	@GET
	//her HTTP istegine karsilik bir tane metot tanimlanabilir. eger @Path annotation kullanilmayakca
	public String greeting(){
		String message = "CustomerResource#greeting";
		return message;
	}
	
	@POST
	//her HTTP istegine karsilik bir tane metot tanimlanabilir. eger @Path annotation kullanilmayakca
	public String greetingPOST(){
		String message = "CustomerResource#greetingPOST";
		return message;
	}
	
	@GET
	@Path("/customers")
	public String getCustomers(){
		return "CustomerResource#getCustomers";
	}
}
