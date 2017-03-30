/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.FooBarSpam.figurasgeometricas;

/**
 *
 * @author jonat
 */
public class Triangulo extends Figura{
    
    private double base = 0d;
    private double altura = 0d;

    public Triangulo() {

        super();
    }

    public Triangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;

    }

    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;

    }

    public double getBase() {
        return this.base;

    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura() {
        this.altura = altura;
    }

    @Override
    public double area() {
        return (getBase() * getAltura())/2;
    }


}
