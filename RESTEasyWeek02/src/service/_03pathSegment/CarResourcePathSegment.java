package service._03pathSegment;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.PathSegment;

@Path("/car-pathSegment")
public class CarResourcePathSegment {
	
	@GET
	@Path("/car/{search : criteria}")
	public String getCar(@PathParam("search") PathSegment pathSegment) {
		
		//http://localhost:8080/RESTEasyWeek02/root-path/car-pathSegment/car/criteria;brand=bmw;color=red;color=white;
		String brand=pathSegment.getMatrixParameters().getFirst("brand");
		List<String> colors=pathSegment.getMatrixParameters().get("color");
		return "Model : "+brand+ " srenkler : "+colors;
		
	}

}
