package paquete5;

/**
 *
 * @author Daniel
 */
public class InstitucionEducativa {

    private String nombre;
    private String siglas;

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerSiglas(String c) {
        siglas = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerSiglas() {
        return siglas.toUpperCase();
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre de la Institución: %s - "
                + "Siglas: %s",
                obtenerNombre(),
                obtenerSiglas());
        return cadena;
    }

}
