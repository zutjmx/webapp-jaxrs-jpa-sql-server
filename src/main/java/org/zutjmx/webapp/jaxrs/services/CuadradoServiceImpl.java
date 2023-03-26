package org.zutjmx.webapp.jaxrs.services;

import jakarta.ejb.Stateless;
import org.zutjmx.webapp.jaxrs.models.Cuadrado;

@Stateless
public class CuadradoServiceImpl implements CuadradoService {
    @Override
    public Cuadrado calculaCuadrado(int numero) {
        Integer resultado = (int) Math.pow(numero,2);
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setNumero(numero);
        cuadrado.setResultado(resultado);
        return cuadrado;
    }
}
