package com.obj2;

public class Elipse extends Figura {
    private Punto centro;
    private Double radioMayor;
    private Double radioMenor;

    public Elipse(Punto centro, Double radioMayor, Double radioMenor) {
        this.centro = centro;
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public Double getRadioMayor() {
        return radioMayor;
    }

    public void setRadioMayor(Double radioMayor) {
        this.radioMayor = radioMayor;
    }

    public Double getRadioMenor() {
        return radioMenor;
    }

    public void setRadioMenor(Double radioMenor) {
        this.radioMenor = radioMenor;
    }

    @Override
    public Double area() {
        return Math.PI * radioMayor * radioMenor;
    }

    @Override
    public void mover(Integer deltaX, Integer deltaY) {
        centro.mover(deltaX, deltaY);
    }

}
