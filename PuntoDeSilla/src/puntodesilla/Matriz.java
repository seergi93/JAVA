/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodesilla;

/**
 *
 * @author Sergi
 */
public class Matriz {

    private int[][] matriz = new int[3][3];
    private int numeroDePosiciones = 0;
    private int[] minimosFilas = new int[3];

    public int[] getMinimosFilas() {
        return minimosFilas;
    }

    public void setMinimosFilas(int[] minimosFilas) {
        this.minimosFilas = minimosFilas;
    }

    public void setNumeroDePosiciones(int numeroDePosiciones) {
        this.numeroDePosiciones = numeroDePosiciones;
    }

    public int getNumeroDePosiciones() {
        return numeroDePosiciones;
    }

    public Matriz() {
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void recorrerMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {

                //valorPosicion = matriz[i][j];
                setNumeroDePosiciones(getNumeroDePosiciones()+1);
            }
        }
    }

    public void minFilas(int[][] matriz) {

        for (int i = 0; i < matriz.length-1; i++) {

            for (int j = 0; j < matriz.length ; j++) {
                if (matriz[i][j] < matriz[i + 1][j]) {
                    setMinimosFilas(matriz[i]);
                }

            }
        }

    }

}
