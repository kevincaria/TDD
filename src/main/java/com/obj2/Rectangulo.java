package com.obj2;

public class Rectangulo extends Figura {
    private Punto esquinaInferiorIzquierda;
    private Punto esquinaSuperiorDerecha;

    public Rectangulo(Punto esquinaInferiorIzquierda, Punto esquinaSuperiorDerecha) {
        this.esquinaInferiorIzquierda = esquinaInferiorIzquierda;
        this.esquinaSuperiorDerecha = esquinaSuperiorDerecha;
    }

    public Punto getEsquinaInferiorIzquierda() {
        return esquinaInferiorIzquierda;
    }

    public void setEsquinaInferiorIzquierda(Punto esquinaInferiorIzquierda) {
        this.esquinaInferiorIzquierda = esquinaInferiorIzquierda;
    }

    public Punto getEsquinaSuperiorDerecha() {
        return esquinaSuperiorDerecha;
    }

    public void setEsquinaSuperiorDerecha(Punto esquinaSuperiorDerecha) {
        this.esquinaSuperiorDerecha = esquinaSuperiorDerecha;
    }

    @Override
    public Double area() {
        Integer ancho = calcularAncho();
        Integer alto = calcularAlto();
        return (double) (ancho * alto); 
    }

    @Override
    public void mover(Integer deltaX, Integer deltaY) {
        esquinaInferiorIzquierda.mover(deltaX, deltaY);
        esquinaSuperiorDerecha.mover(deltaX, deltaY);
    }

    protected Integer calcularAncho() {
        return Math.abs(esquinaSuperiorDerecha.getX() - esquinaInferiorIzquierda.getX());
    }

    protected Integer calcularAlto() {
        return Math.abs(esquinaSuperiorDerecha.getY() - esquinaInferiorIzquierda.getY());
    }

}
