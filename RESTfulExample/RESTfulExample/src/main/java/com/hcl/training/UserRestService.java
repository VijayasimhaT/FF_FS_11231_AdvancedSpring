package com.hcl.training;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserRestService {

	@GET //http://localhost:1234/RESTfulExample/users/
	public Response getUser() {

		return Response.status(200).entity("getUser is called").build();

	}

	@GET
	@Path("/vip") //http://localhost:1234/RESTfulExample/users/vip
	public Response getUserVIP() {

		return Response.status(200).entity("getUserVIP is called").build();

	}

	@GET
	@Path("{name}")	//http://localhost:1234/RESTfulExample/users/anbu
	public Response getUserByName(@PathParam("name") String name) {

		return Response.status(200)
				.entity("getUserByName is called, name : " + name).build();

	}
	
	@GET
	@Path("query")	//http://localhost:1234/RESTfulExample/users/query?firstname=hcl&lastname=technologies
	public Response getUserByQuery(@QueryParam("firstname") String firstname,@QueryParam("lastname") int lastname) {

		return Response.status(200)
				.entity("getUserByName is called, full name : " + firstname + " " + lastname).build();

	}
	@POST
	@Path("/add")
	public Response addUser(@FormParam("name") String name,@FormParam("age") int age) {
		return Response.status(200)
				.entity("addUser is called,name : " +name + ",age: " +age)
				.build();
	}


}