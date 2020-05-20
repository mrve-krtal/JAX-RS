package service._02pathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/customer-pathParam")
public class CustomerResourcePathParam {
	
	@GET
	@Path("/customer/{id}")
	
	   	//@Path("/customer/{idz}")
		//buradaki {pathParam} bilgisi ile metot tanimindaki @PathParamdaki {pathParam} bilgisi AYNI OLMALIDIR.
		// RESTEasy yoksa hata verir , jersey null deger verir.
	// http://localhost:8080/RESTEasyWeek02/root-path/customer-pathParam/customer/100
	public String getCustomerByid(@PathParam("id") String customerId) {
		//customerId'ye göre datayi getir.
		return "CustomerResourcePathParam#getCustomerByid : "+customerId;
	}

}
