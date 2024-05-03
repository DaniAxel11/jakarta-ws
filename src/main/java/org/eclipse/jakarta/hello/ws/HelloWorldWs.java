package org.eclipse.jakarta.hello.ws;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.jakarta.hello.Dani;


@Path("echo")
public class HelloWorldWs {
	@GET
	@Path("daniWorld")
	@Produces( MediaType.APPLICATION_JSON )
	public Dani dannny(@QueryParam("name") String name) {
		Dani danni = null;
		if ((name == null) || name.trim().isEmpty())  {
			name = "mundito";
			danni = new Dani(name);
		}
		return danni;
	}
}