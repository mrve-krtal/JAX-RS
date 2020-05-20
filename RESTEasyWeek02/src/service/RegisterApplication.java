package service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import service._01path.CustomerResource;
import service._02pathParam.CustomerResourcePathParam;
import service._02pathParam.OrderResourcePathParam;
import service._03pathSegment.CarResourcePathSegment;
import service._04queryParam.LibraryResourceQueryParam;
import service._05matrixParam.CarResourceMatrixParam;
import service._06fromParam.PersonResourceFromParam;
import service._07headerParam.LoginResourceHeaderParam;
import service._08cookieParam.UserResourceCookieParam;
import service._09beanParam.ProductResourceBeanParam;
import service._10defaultValue.CarResourceDefaultValue;

//@ApplicationPath("/") // OK 
@ApplicationPath("/root-path") //OK 
///* kullanma // NOT OK
///root-path/*" // NOT OK
public class RegisterApplication extends Application {
	
	private Set<Object> singletons=new HashSet<Object>();
	
	public RegisterApplication() {
		singletons.add(new MessageService());
		singletons.add(new CustomerResource());
		singletons.add(new CustomerResourcePathParam());
		singletons.add(new OrderResourcePathParam());
		singletons.add(new CarResourcePathSegment());
		singletons.add(new CarResourceMatrixParam());
		singletons.add(new LibraryResourceQueryParam());
		singletons.add(new PersonResourceFromParam());
		singletons.add(new LoginResourceHeaderParam());
		singletons.add(new UserResourceCookieParam());
		singletons.add(new ProductResourceBeanParam());
		singletons.add(new CarResourceDefaultValue());
	}
	
	@Override
	public Set<Object> getSingletons(){
		
		return singletons;
		
	}

// rest service siniflari ,. singleton ya da per request olabilir.
}
