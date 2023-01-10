package com.byes.paap.rest.byespspinterface;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.byes.paap.rest.byespspinterface.dto.WBSItemsDTO;
import com.planonsoftware.jaxrs.api.v9.context.IJaxRsResourceContext;

@Path("/wbsItems")
public class WBSItemInterface
{
    @Context 
    IJaxRsResourceContext jaxrsContext;

    @POST
    @Path("/updateWBSItems")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createOrder(WBSItemsDTO WBSItems) {
        return Response.ok().build();
    }
           
}