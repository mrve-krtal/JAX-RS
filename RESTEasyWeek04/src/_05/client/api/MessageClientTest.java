package _05.client.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;

public class MessageClientTest {

	public static void main(String[] args) {
	
		String URI="http://localhost:8080/RESTEasyWeek04/root-path/message-client-api/message";
		//
		Client client = ClientBuilder.newClient(); //newClient yeni bir Client objesi olusturur.
		WebTarget target = client.target(URI); //WebTarget objesi olusturmak icin client objesinden yararlaniriz.
		//WebTarget , belirtigimiz URI adresini cagirmamizi/ invoke etmemizi saglar.
		
		Invocation.Builder builder = target.request();

		String message = builder.get(String.class);

		System.out.println(message);
	}
}

// the javax.ws.rs.client.Client interface is the main
// entry point into the JAX-RS Client API.

// Client arabirimi , JAX-RS client API nin giris noktasidir.
// Client objeleri , socket connection acmak/yonetmekten sorumludur.
// Client objleerini ClientBuilder abstract classi yardimiyla olustururz.

