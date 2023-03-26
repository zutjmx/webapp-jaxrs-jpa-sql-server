package org.zutjmx.webapp.jaxrs.services;

import jakarta.ejb.Local;
import org.zutjmx.webapp.jaxrs.models.Cuadrado;

@Local
public interface CuadradoService {
    Cuadrado calculaCuadrado(int numero);
}
