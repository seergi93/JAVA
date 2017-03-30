/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.FooBarSpam.figurasgeometricas;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author jonathan
 */
public class DrawableTest {

    public DrawableTest() {
    }

    private static ArrayList<Drawable> figuras;

    @BeforeClass
    public static void setUpBeforeClass() {
        figuras = new ArrayList<>();
        Rectangulo figuraRectangulo = new Rectangulo("Rectangulo", 3, 4);
        Cuadrado figuraCuadrado = new Cuadrado("Cuadrado", 4);
        Circulo figuraCirculo = new Circulo("Circulo", 4);
        Triangulo figuraTriangulo = new Triangulo("Triangulo", 2, 2);
        Elipse figuraElipse = new Elipse("Elipse", 3, 4);

        figuras.add(figuraRectangulo);
        figuras.add(figuraCuadrado);
        figuras.add(figuraCirculo);
        figuras.add(figuraTriangulo);
        figuras.add(figuraElipse);
    }

    @Test
    public void testInterfazDrawableCuadrado() {
        Cuadrado cuadrado = new Cuadrado(2);
        assertTrue(cuadrado instanceof Drawable);
        assertTrue(cuadrado instanceof Cuadrado);

    }

    @Test
    public void testInterfazDrawableTriangulo() {
        Triangulo triangulo = new Triangulo();
        assertTrue(triangulo instanceof Drawable);
    }

    @Test
    public void testInterfazDrawableElipse() {
        Elipse elipse = new Elipse();
        assertTrue(elipse instanceof Drawable);
    }

    @Test
    public void testInterfazDrawableCirculo() {
        Circulo circulo = new Circulo();
        assertTrue(circulo instanceof Drawable);
    }

    @Test
    public void testInterfazDrawableRectangulo() {
        Rectangulo rectangulo = new Rectangulo();
        assertTrue(rectangulo instanceof Drawable);
    }

    @Test
    public void testArrayFigurasSize() {
        assertEquals(figuras.size(), 5);
    }

    @Test
    public void testImprimirArrayFigurasMetdodoDraw() {
        for (Drawable drawable : figuras) {
            drawable.draw();
        }
    }

    @Test
    public void testPolimorfismo() {

        Drawable circulito = new Circulo("Circulo", 3);

        assertTrue(circulito instanceof Circulo);
        assertTrue(circulito instanceof Drawable);

        circulito.draw();
        //circulito.applyTheme();

        // Casting
        Circulo vistaCirculo;
        vistaCirculo = (Circulo) circulito;
        

    }

    @Test
    public void testApplyTheme() {

        for (Drawable drawable : figuras) {

            drawable.applyTheme(figuras);

        }
    }

}
