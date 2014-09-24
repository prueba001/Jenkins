package service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.view.Viewable;

@Path("/hello")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path ("/sayHello")
	public String sayHtmlHello()
	{
		String data = "<html> " + "<title>" + "Hello Jersey" + "</title>"
		        + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
		
		return data;
	}
	

	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path ("/sayHelloV2")
	public Viewable sayHtmlHello2()
	{
		/*String data = "<html> " + "<title>" + "Hello Jersey" + "</title>"
		        + "<body><h1>" + "Hello Jersey Version 2" + "</body></h1>" + "</html> ";
		
		return data; */
		return new Viewable("/jerseyJSP	");
		
	}
}
