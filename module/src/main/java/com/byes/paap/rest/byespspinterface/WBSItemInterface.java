package com.byes.paap.rest.byespspinterface;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.byes.paap.rest.byespspinterface.dto.ResponseDTO;
import com.byes.paap.rest.byespspinterface.dto.WBSItemsDTO;
import com.planonsoftware.jaxrs.api.v9.context.IJaxRsResourceContext;

@Path("/wbsItems")
public class WBSItemInterface
{
    @Context 
    IJaxRsResourceContext jaxrsContext;

    @POST
    @Path("/updateWBSItems")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createOrder(WBSItemsDTO WBSItems) {
        ResponseDTO response = new ResponseDTO();
        response.setStatus(200);
        response.setStatusDescription("WBSItem created/updated.");
        return Response.ok().entity(response).build();
    }
           
}