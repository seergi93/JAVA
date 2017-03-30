/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjetaPrepago;

import hora.Hora;

/**
 *
 * @author Sergi
 */
public class TarjetaPrepago {

    private String numeroTelefono = null, nif = null;
    private double saldo = 0d;
    private Hora consumo = null;

    /*
    ********METODOS PROPIOS DE LA CLASE***********
     */
    public void ingresarSaldo(double dinero) {
        setSaldo(getSaldo() + dinero);
    }

    public void enviarMensaje(int mensajes) {

        for (int i = 0; i < mensajes; i++) {
            ingresarSaldo(-0.09);

        }
    }

    public void realizarLlamda(int segundos) {
        ingresarSaldo(-0.15 - segundos * 0.01);

        this.consumo = new Hora();

        convertirHora(segundos);

    }

    public void consultarTarjeta(TarjetaPrepago tarjeta) {

        System.out.println("Numero teléfono: " + getNumeroTelefono());
        System.out.println("NIF: " + getNif());
        System.out.println("Saldo: " + getSaldo());
        System.out.print("Tiempo hablado: ");
        consumo.imprimirHora();

    }

    private void convertirHora(int segundos) {
        boolean control = true;
        while (control) {
            if (segundos >= 60) {

                consumo.setMinutos(consumo.getMinutos() + 1);
                segundos -= 60;
            } else if (consumo.getMinutos() >= 60) {
                consumo.setHoras(consumo.getHoras() + 1);
                consumo.setMinutos(consumo.getMinutos() - 60);
            } else {
                control = false;
                consumo.setSegundos(segundos);
            }
        }
    }

    /*
    ******** CONSTRUCTORES **********
     */
    public TarjetaPrepago(String numeroTelefono, String nif, double saldo) {
        this.numeroTelefono = numeroTelefono;
        this.nif = nif;
        this.saldo = saldo;
    }

    public TarjetaPrepago() {
    }

    /*
    ******** SETTERS Y GETTERS
     */
    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Hora getConsumo() {
        return consumo;
    }

    public void setConsumo(Hora consumo) {
        this.consumo = consumo;
    }

}
