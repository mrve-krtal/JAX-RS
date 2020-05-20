package service._09beanParam;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/product-beanParam")
public class ProductResourceBeanParam {
	
	@GET
	@Path("/getProduct/{category}")
	//http://localhost:8080/RESTEasyWeek02/root-path/product-beanParam/getProduct/computer?productId=1000
	//http://localhost:8080/RESTEasyWeek02/root-path/product-beanParam/getProduct/computer;brand=apple;price=8550.55?productId=1000
	public String getProduct(@BeanParam Product product) {
		return "getProduct: "+product.toString();
	}

}
