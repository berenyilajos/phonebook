package hu.hugo.phonebook.service;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import hu.hugo.phonebook.common.system.log.qualifier.WebContextLogger;

@Path("")
@WebContextLogger
public interface IPhonebookService {
    
    @Path("/user")
    @Produces(MediaType.APPLICATION_JSON)
    @GET
    public Map<String, String> data(@QueryParam("user") String user);
    
}
