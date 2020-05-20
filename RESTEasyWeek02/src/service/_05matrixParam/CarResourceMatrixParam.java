package service._05matrixParam;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;

@Path("/car-matrixParam")
public class CarResourceMatrixParam {
	
	@GET
	@Path("/car")
	public String getCar(@MatrixParam("brand") String brand, @MatrixParam("color") List<String> color) {
		return "Model : "+brand+ " renk : "+color;
		
	}

}
