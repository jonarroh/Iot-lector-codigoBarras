/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm.rest;

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.utl.dsm.controller.SerialController;

/**
 *
 * @author urieh
 */

@Path("serial")
public class Serial {
    
    @Path("mensaje")
    @Produces(MediaType.APPLICATION_JSON)
    @POST
    public Response mandarMensaje(@FormParam("mensaje") @DefaultValue("") String mensaje) throws InterruptedException{
    String out ="";
        SerialController objSerial = new SerialController();
        objSerial.conectar();
         Thread.sleep(3000);
        objSerial.mandarMensaje(mensaje);
        out = """
              {"result":"el mensaje se guardo correctamnete"}
              """;
    
    return Response.status(Response.Status.OK).entity(out).build();
    }
}
