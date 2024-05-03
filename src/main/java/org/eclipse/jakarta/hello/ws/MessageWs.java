package org.eclipse.jakarta.hello.ws;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * @Author daniel-gonzalez
 * Date: 03/05/24
 */
@Path("message")
public class MessageWs {

    @GET
    @Path("viewMessage")
    @Produces(MediaType.TEXT_HTML)
    public Response doEcho() {
        String echo = "This is a message!";

        return Response.ok(echo).build();
    }

}
