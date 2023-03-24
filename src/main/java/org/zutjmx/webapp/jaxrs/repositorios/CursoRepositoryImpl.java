package org.zutjmx.webapp.jaxrs.repositorios;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.zutjmx.webapp.jaxrs.models.Curso;

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
        if(curso.getId() != null && curso.getId() > 0) {
            entityManager.merge(curso);
        } else {
            entityManager.persist(curso);
        }
        return curso;
    }

    @Override
    public Curso porId(Long id) {
        return entityManager.find(Curso.class, id);
    }

    @Override
    public void eliminar(Long id) {
        Curso curso = this.porId(id);
        entityManager.remove(curso);
    }
}
