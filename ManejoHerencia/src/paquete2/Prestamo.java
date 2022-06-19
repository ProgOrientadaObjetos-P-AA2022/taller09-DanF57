/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.Persona;


public class Prestamo {

    protected Persona beneficiario;
    protected int tiempo;
    protected String ciudad;

    public Prestamo(Persona b, int t, String c) {
        beneficiario = b;
        tiempo = t;
        ciudad = c;
    }

    public void establecerBeneficiario(Persona c) {
        beneficiario = c;
    }

    public void establecerTiempo(int c) {
        tiempo = c;
    }

    public void establecerCiudad(String c) {
        ciudad = c;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerTiempo() {
        return tiempo;
    }
    
    public String obtenerCiudad(){
        return ciudad;
    }

}
