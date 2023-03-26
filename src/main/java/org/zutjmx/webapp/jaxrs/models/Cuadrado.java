package org.zutjmx.webapp.jaxrs.models;

public class Cuadrado {
    private Integer numero;
    private Integer resultado;

    public Cuadrado() {
    }

    public Cuadrado(Integer numero, Integer resultado) {
        this.numero = numero;
        this.resultado = resultado;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getResultado() {
        return resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }
}
