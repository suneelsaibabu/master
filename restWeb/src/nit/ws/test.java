package nit.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/test")
public class test {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/hi")
	public String Wish()
	{
		return "good Morning";
	}
}
