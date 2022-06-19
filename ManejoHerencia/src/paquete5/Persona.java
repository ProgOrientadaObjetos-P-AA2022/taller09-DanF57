package paquete5;

/**
 *
 * @author Daniel
 */
public class Persona {

    protected String nombre;
    protected String apellido;
    protected String username;

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerUsername(String c) {
        username = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerUsername() {
        return username;
    }

}
