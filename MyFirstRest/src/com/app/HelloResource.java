
package com.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloResource {
	
	@GET
	@Produces("text/plain")
	
	public String hello()
	{
		return "hello jax-ws-rs";
	}

}
