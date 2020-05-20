package service._02pathParam;

import java.time.LocalDate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import sun.util.resources.LocaleData;

@Path("/order-path")
public class OrderResourcePathParam {
	
	@GET
	@Path("/order/{day}/{month}/{year}")
	public String getOrderByDate(@PathParam("day") int day, @PathParam("month") int month, @PathParam("year") int year) {
		
		LocalDate date=LocalDate.of(year,month,day); 
		return date.toString();
	}

	@GET
	@Path("/orderById/{id : \\d+}")
	public String getOrderById(@PathParam("id") int id) {
		return "getOrderById : "+id;
		
	}	
	
	//REGEX
	@GET
	@Path("/orderByName/{name : order-\\d+\\w+}")
	public String getOrderByName(@PathParam("name") String orderName) {
		return "getOrderByName : "+orderName;
		
	}
}
