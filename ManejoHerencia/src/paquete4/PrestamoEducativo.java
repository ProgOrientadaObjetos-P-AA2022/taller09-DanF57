/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;
import paquete2.Prestamo;
import paquete5.InstitucionEducativa;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensualPago;
    
    public PrestamoEducativo(Persona b, int t, String c, String nE,
                InstitucionEducativa cE, double vC){
        super(b, t, c);
        nivelEstudio = nE;
        centroEducativo = cE;
        valorCarrera = vC;
    }
    
    public void establecerNivelEstudio(String t) {
        nivelEstudio = t;
    }
    public void establecerCentroEducativo(InstitucionEducativa t) {
        centroEducativo = t;
    }
    public void establecerValorCarrera(double t) {
        valorCarrera = t;
    }
    public void establecerValorMensualPago() {
        valorMensualPago = t;
    }
    
    
    
    
}
