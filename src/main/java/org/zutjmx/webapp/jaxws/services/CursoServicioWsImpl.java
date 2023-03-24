package org.zutjmx.webapp.jaxws.services;

import com.github.javafaker.Faker;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.zutjmx.webapp.jaxws.models.Curso;
import org.zutjmx.webapp.jaxws.repositorios.CursoRepository;

import java.util.Arrays;
import java.util.List;

@Stateless
@WebService(endpointInterface = "org.zutjmx.webapp.jaxws.services.CursoServicioWs")
public class CursoServicioWsImpl implements CursoServicioWs {

    @Inject
    private CursoRepository cursoRepository;

    @Override
    @WebMethod
    public List<Curso> listar() {
        return cursoRepository.listar();
    }

    @Override
    @WebMethod
    public Curso guardar(Curso curso) {
        return cursoRepository.guardar(curso);
    }
}
