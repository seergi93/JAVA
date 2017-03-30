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
    public class Elipse extends Figura {

    private double ejeMayor = 0d;
    private double ejeMenor = 0d;

    public Elipse() {

        super();
    }

    public Elipse(double ejeMayor, double ejeMenor) {
        super();
        this.ejeMayor = ejeMayor;
        this.ejeMenor = ejeMenor;

    }

    public Elipse(String nombre, double ejeMayor, double ejeMenor) {
        super(nombre);
        this.ejeMayor = ejeMayor;
        this.ejeMenor = ejeMenor;

    }

    public double getEjeMayor() {
        return this.ejeMayor;

    }

    public void setEjeMayor(double ejeMayor) {
        this.ejeMayor = ejeMayor;
    }

    public double getEjeMenor() {
        return this.ejeMenor;
    }

    public void setEjeMenor() {
        this.ejeMenor = ejeMenor;
    }

    @Override
    public double area() {
        return Math.round((Math.PI * getEjeMayor() * getEjeMenor())*Math.pow(10,2))/Math.pow(10,2);
    }
        
    }
