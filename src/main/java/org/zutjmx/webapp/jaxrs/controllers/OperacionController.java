package org.zutjmx.webapp.jaxrs.controllers;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.zutjmx.webapp.jaxrs.models.Cuadrado;
import org.zutjmx.webapp.jaxrs.services.CuadradoService;

@RequestScoped
@Path("/operacion")
@Produces(MediaType.APPLICATION_JSON)
public class OperacionController {

    @Inject
    private CuadradoService cuadradoService;

    @GET
    @Path("/cuadrado/{numero}")
    public Response getCuadrado(@PathParam("numero") int numero) {
        return Response.ok(cuadradoService.calculaCuadrado(numero)).build();
    }

}
