package net.codejava;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;


public class HelloClient {

	public static void main(String[] args) {
		String uri = "http://localhost:8080/HelloREST/rest/bonjour";
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		WebTarget target = client.target(uri);
		
		String response = target.request().accept(MediaType.APPLICATION_JSON).get(String.class);
		
		System.out.println(response);

	}

}
