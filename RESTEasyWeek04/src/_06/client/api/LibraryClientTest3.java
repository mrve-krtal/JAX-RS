package _06.client.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;


public class LibraryClientTest3 {
	
	public static void main(String[] args) {

		
		String URI = "http://localhost:8080/RESTEasyWeek04/root-path/library-client-api/bookXML";
		//
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(URI);
		
		Invocation.Builder builder = target.request();
		
		Response response = builder.get();
		Book book = response.readEntity(Book.class);
		System.out.println(book);
		
		//xml class için
		Response response2 = builder.get();
		
		String xmlData=response2.readEntity(String.class);
		System.out.println(xmlData);
		
	}
}