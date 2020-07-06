package service.register;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import _01.conneg.service.CustomerResource;
import _03_uriBuilder.service.UriBuilderResource;
import _04_uriInfo.service.UriInfoResource;
import _05.link.service.LinkService;


@ApplicationPath("/root-path") // OK
public class RegisterApplication extends Application {


	private Set<Object> singletons = new HashSet<Object>();

	public RegisterApplication() {
		singletons.add(new CustomerResource());
		singletons.add(new UriBuilderResource());
		singletons.add(new UriInfoResource());
		singletons.add(new LinkService());
		singletons.add(new _05.link.service.CustomerResource());
	
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}

