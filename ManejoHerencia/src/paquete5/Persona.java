package paquete5;

/**
 *
 * @author Daniel
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String username;
    
    public Persona(String n, String a, String u){
        nombre = n;
        apellido = a;
        username = u;
    }

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
    
    @Override
    public String toString(){
        String cadena = String.format("Nombre: %s - "
                + "Apellido: %s - "
                + "Username: %s", 
                nombre,
                apellido,
                username);
        return cadena;
    }

}
