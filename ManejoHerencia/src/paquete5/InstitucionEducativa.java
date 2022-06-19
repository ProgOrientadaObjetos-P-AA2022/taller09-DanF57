package paquete5;

/**
 *
 * @author Daniel
 */
public class InstitucionEducativa {

    protected String nombre;
    protected String siglas;

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
        return siglas;
    }

}
