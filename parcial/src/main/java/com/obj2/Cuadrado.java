package com.obj2;

public class Cuadrado extends Rectangulo {

    public Cuadrado(Punto esquinaInferiorIzquierda, Punto esquinaSuperiorDerecha) {
        super(esquinaInferiorIzquierda, esquinaSuperiorDerecha);
        Integer ancho = calcularAncho();
        Integer alto = calcularAlto();
        if (!ancho.equals(alto)) {
            throw new IllegalArgumentException("El ancho y el alto del cuadrado deben ser iguales");
        }
    }
}