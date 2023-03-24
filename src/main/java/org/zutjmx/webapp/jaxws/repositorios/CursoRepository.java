package org.zutjmx.webapp.jaxws.repositorios;

import org.zutjmx.webapp.jaxws.models.Curso;

import java.util.List;

public interface CursoRepository {
    List<Curso> listar();
    Curso guardar(Curso curso);
}
