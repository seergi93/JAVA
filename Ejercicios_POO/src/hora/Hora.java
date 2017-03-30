/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hora;

/**
 *
 * @author Sergi
 */
public class Hora {

    /**
     * @param args the command line arguments
     */
    private int horas = 0;
    private int minutos = 0;
    private int segundos = 0;

    /*
    *******METODOS PROPIOS DE LA CLASE***********
     */
    public void setHora(int horas, int minutos, int segundos) {

        if (horas <= 24) {
            setHoras(horas);
        } else {
            setHoras(0);
        }
        if (minutos <= 60) {
            setMinutos(minutos);
        } else {
            setMinutos(0);
        }
        if (segundos <= 60) {
            setSegundos(segundos);
        } else {
            setSegundos(0);
        }

    }

    public int[] getHora() {

        int[] time = new int[]{getHoras(), getMinutos(), getSegundos()};

        return time;
    }

    public void imprimirHora() {
        System.out.println("Són las " + getHoras() + "h, " + getMinutos() + " minutos y " + getSegundos() + " segundos.");
    }

    /*
    **********CONSTRUCTORES*************
     */
    public Hora() {
    }

    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    /*
    ********SETTERS & GETTERS*********
     */
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

}
