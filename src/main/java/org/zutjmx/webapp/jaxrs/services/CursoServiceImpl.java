package org.zutjmx.webapp.jaxrs.services;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.jws.WebMethod;
import org.zutjmx.webapp.jaxrs.models.Curso;
import org.zutjmx.webapp.jaxrs.repositorios.CursoRepository;

import java.util.List;
import java.util.Optional;

@Stateless
public class CursoServiceImpl implements CursoService {

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

    @Override
    public Optional<Curso> porId(Long id) {
        return Optional.ofNullable(cursoRepository.porId(id));
    }

    @Override
    public void eliminar(Long id) {
        cursoRepository.eliminar(id);
    }
}
