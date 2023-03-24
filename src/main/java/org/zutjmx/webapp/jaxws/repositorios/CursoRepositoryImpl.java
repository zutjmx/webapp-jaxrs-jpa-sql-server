package org.zutjmx.webapp.jaxws.repositorios;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.zutjmx.webapp.jaxws.models.Curso;

import java.util.List;

@RequestScoped
public class CursoRepositoryImpl implements CursoRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public List<Curso> listar() {
        return entityManager
                .createQuery("from Curso",Curso.class)
                .getResultList();
    }

    @Override
    public Curso guardar(Curso curso) {
        entityManager.persist(curso);
        return curso;
    }
}
