package com.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")

public class MyResource {
	@GET
	@Produces("text/plain")
	public String hello()
	{
		return "Helli jax-rs";
	}

}
