package org.zutjmx.webapp.jaxrs.controllers;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.zutjmx.webapp.jaxrs.models.Curso;
import org.zutjmx.webapp.jaxrs.services.CursoService;

import java.util.List;
import java.util.Optional;

@RequestScoped
@Path("/cursos")
@Produces(MediaType.APPLICATION_XML)
public class CursoRestController {

    @Inject
    private CursoService cursoService;

    @GET
    public List<Curso> listar() {
        return cursoService.listar();
    }

    @GET
    @Path("/{id}")
    public Response porId(@PathParam("id") Long id) {
        Optional<Curso> cursoOptional = cursoService.porId(id);
        if (cursoOptional.isPresent()) {
            return Response.ok(cursoOptional.get()).build();
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }

}
