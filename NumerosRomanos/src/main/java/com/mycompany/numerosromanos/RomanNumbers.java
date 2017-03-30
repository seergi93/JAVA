/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.numerosromanos;

/**
 *
 * @author
 */
public enum RomanNumbers {

    I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

    private int valor;

    private RomanNumbers(int valor) {

        this.valor = valor;

    }

    public int getValor() {

        return this.valor;
    }

//    public int insertarLetras(String cadena) {
//        int valor = 0;
//        for (int i = 0; i < cadena.length(); i++) {
//
//            switch (cadena.charAt(i)) {
//                case 'I':
//                    valor = I.getValor();
//                case 'V':
//                    valor = V.getValor();
//                case 'X':
//                    valor = X.getValor();
//                case 'L':
//                    valor = L.getValor();
//                case 'C':
//                    valor = C.getValor();
//                case 'D':
//                    valor = D.getValor();
//                case 'M':
//                    valor = M.getValor();
//                default:
//
//                    break;
//            }
//
//        }
//        return valor;
//    }

}
