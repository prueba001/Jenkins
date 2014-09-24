package logic;

import java.net.UnknownHostException;

import model.Counter;

public class CounterController {

	
	public boolean updateCounter ()
	{
		boolean result = true;
		try
		{
			Counter db = new Counter ();
			db.updateCounter();
			result = true;
		}
		catch (UnknownHostException e)
		{
			System.err.println ("Unknown Host Exception: "+ e);
			result = false;
		}
		return result;
	}
	
	
}
