package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import logic.CounterController;

import com.sun.jersey.api.view.Viewable;


@Path("/counter")
public class CounterService {

	
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path ("/update")
	public Viewable updateCounter()
	{
		CounterController counterController = new CounterController ();
		boolean result = counterController.updateCounter();
		Viewable view = null;
		if (result)
		{
			view = new Viewable ("/templates/counter/success");
		}
		else
		{
			view = new Viewable ("/templates/counter/error");
		}
		return view; 
	}
	
	
	
	
}
