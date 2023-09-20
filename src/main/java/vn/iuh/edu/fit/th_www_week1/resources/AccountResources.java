package vn.iuh.edu.fit.th_www_week1.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import vn.iuh.edu.fit.th_www_week1.models.Account;
import vn.iuh.edu.fit.th_www_week1.services.AccontServices;

@Path("/acc")
public class AccountResources {
    private AccontServices accontServices;

    public AccountResources() {
        accontServices = new AccontServices();
    }

    @GET
    @Produces("application/json")
    public Response getAll(){
        return Response.ok(accontServices.getAll()).build();

    }
}
