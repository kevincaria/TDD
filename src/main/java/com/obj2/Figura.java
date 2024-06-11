package com.obj2;

public abstract class Figura implements Comparable<Figura> {
    public abstract Double area();

    public abstract void mover(Integer deltaX, Integer deltaY);

    @Override
    public int compareTo(Figura otra) {
        return Double.compare(this.area(), otra.area());
    }
}
