package com.ebac.modulo61.demo;

public class Cuadrado implements Figura{

    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
