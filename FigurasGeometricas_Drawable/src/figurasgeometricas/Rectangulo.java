/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author jonat
 */
public class Rectangulo extends Figura {

    private double altura = 0d;
    private double anchura = 0d;

    public Rectangulo() {

        super();
    }

    public Rectangulo(double altura, double anchura) {
        super();
        this.altura = altura;
        this.anchura = anchura;

    }

    public Rectangulo(String nombre, double altura, double anchura) {
        super(nombre);
        this.altura = altura;
        this.anchura = anchura;

    }

    public double getAltura() {
        return this.altura;

    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAnchura() {
        return this.anchura;
    }

    public void setAnchura() {
        this.anchura = anchura;
    }

    @Override
    public double area() {
        return getAltura() * getAnchura();
    }

}
