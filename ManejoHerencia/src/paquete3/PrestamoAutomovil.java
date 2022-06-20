package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipoAutomovil;
    private String marca;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensualPago;

    public PrestamoAutomovil(Persona b, int t, String c, String tipoA,
            String m, Persona g, double vA) {
        super(b, t, c);
        tipoAutomovil = tipoA;
        marca = m;
        garante1 = g;
        valorAutomovil = vA;
    }

    public void establecerTipoAutomovil(String t) {
        tipoAutomovil = t;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerGarante1(Persona g) {
        garante1 = g;
    }

    public void establecerValorAutomovil(double vA) {
        valorAutomovil = vA;
    }

    public void establecerValorMensualPagoA() {
        valorMensualPago = valorAutomovil / obtenerTiempo();
    }

    public String obtenerTipoAutomovil() {
        return tipoAutomovil;
    }

    public String obtenerMarca() {
        return marca;
    }

    public Persona obtenerGarante() {
        return garante1;
    }

    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public double obtenerValorMensualPago() {
        return valorMensualPago;
    }

    public String obtenerCiudadPrestamo() {
        return ciudad.toLowerCase();
    }

    @Override
    public String toString() {
        String reporte = String.format("%s", super.toString());
        reporte = String.format("%sCiudad: %s\n"
                + "Tipo Automovil: %s\n"
                + "Marca de Automovil: %s\n"
                + "Garante: %s\n"
                + "Valor Automovil: %.2f\n"
                + "Valor Mensual Pago: %.2f\n",
                reporte,
                obtenerCiudadPrestamo(),
                tipoAutomovil,
                marca,
                garante1,
                valorAutomovil,
                valorMensualPago);

        return reporte;
    }

}
