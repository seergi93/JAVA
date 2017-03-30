/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentacorriente;

/**
 *
 * @author Sergi
 */
public class CuentaCorriente {

    private String dni = null;
    private String nombre = null;
    private String apellidos = null;
    private String direccion = null;
    private String telefono = null;
    private double saldo = 0;

    /*
    *******METODOS PROPIOS DE LA CLASE***********
     */
    public void retirarDinero(double restarSaldo) {
        setSaldo(getSaldo() - restarSaldo);

    }

    public void ingresarDinero(double sumarSaldo) {
        setSaldo(getSaldo() + sumarSaldo);

    }

    public void consultarCuenta(CuentaCorriente cuenta) {
        System.out.println("dni: " + getDni() + "\nNombre: " + getNombre() + "\nApellido: "
                + getApellidos() + "\nDirección: " + getDireccion() + "\nTeléfono: " + getTelefono() + "\n"
                + "Saldo: " + getSaldo());

    }

    public boolean saldoNegativo(CuentaCorriente cuenta) {
        if (getSaldo() < 0) {
            return true;
        } else {
            return false;
        }

    }

    /*
    **********CONSTRUCTORES*************
     */
    public CuentaCorriente() {
    }

    public CuentaCorriente(String dni, String nombre, String apellidos, String direccion, String telefono, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    /*
    ********SETTERS & GETTERS*********
     */
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
