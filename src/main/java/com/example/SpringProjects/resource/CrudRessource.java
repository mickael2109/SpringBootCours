package com.example.SpringProjects.resource;

import java.sql.SQLException;
import java.util.ArrayList;

import com.example.SpringProjects.model.CrudModel;
import com.example.SpringProjects.service.CrudService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/crud")
public class CrudRessource {
    
    CrudService service = new CrudService();

    @Path("/insertion")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public CrudModel addUser(CrudModel user){
        return service.insertUser(user);
    }

    @Path("/getcrud")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<CrudModel> getUser() throws SQLException {
        return service.getUser();
    }
}
