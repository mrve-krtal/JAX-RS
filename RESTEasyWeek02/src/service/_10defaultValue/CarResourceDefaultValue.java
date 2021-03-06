package service._10defaultValue;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/car-defaultValue")
public class CarResourceDefaultValue {

	@GET
	@Path("/car")
	//http://localhost:8080/RESTEasyWeek02/root-path/car-defaultValue/car
	public String getCarById(@DefaultValue("1000") @QueryParam("id") int id) {
		return "getCarById : "+id;
		
	}
}

//bu degerler icin kullilabilir;
//javax.ws.rs.PathParam
//javax.ws.rs.QueryParam
//javax.ws.rs.MatrixParam
//javax.ws.rs.CookieParam
//javax.ws.rs.FormParam
//javax.ws.rs.HeaderParam