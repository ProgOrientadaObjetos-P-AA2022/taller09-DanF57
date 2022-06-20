package paquete1;

import java.util.ArrayList;
import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<PrestamoAutomovil> listaAutomovil = new ArrayList<>();
        ArrayList<PrestamoEducativo> listaEducativo = new ArrayList<>();

        int op;

        do {
            System.out.println("Ingrese [1] para crear Prestamo Automovil\n"
                    + "Ingrese [2] para crear Prestamo Educativo\n"
                    + "Ingrese [0] para Salir y mostrar la lista de Prestamos.");
            op = entrada.nextInt();
            
            entrada.nextLine();

            if ((op != 0) && (op != 1) && (op != 2)) {
                System.out.println("--------------------------------------");
                System.out.println("Error, ingrese opción válida");
            } else {
                switch (op) {
                    case 1:

                        System.out.println("Ingrese nombre del beneficiario: ");
                        String nombre = entrada.nextLine();
                        System.out.println("Ingrese apellido del beneficiario: ");
                        String apellido = entrada.nextLine();
                        System.out.println("Ingrese el Username del beneficiario: ");
                        String username = entrada.nextLine();
                        //Se crea el beneficiario de tipo Persona
                        //Datos para el objeto tipo Prestamo
                        Persona beneficiario = new Persona(nombre, apellido, username);

                        System.out.println("Ingrese la ciudad del prestamo: ");
                        String ciudad = entrada.nextLine();
                        System.out.println("Ingrese el tiempo a pagar el prestamo: ");
                        int tiempo = entrada.nextInt();

                        entrada.nextLine(); //Limpieza de buffer

                        System.out.println("Ingrese el tipo de Automovil: ");
                        String tA = entrada.nextLine();
                        System.out.println("Marca del Automovil: ");
                        String marca = entrada.nextLine();

                        System.out.println("Ingrese el nombre del garante: ");
                        String nombreG = entrada.nextLine();
                        System.out.println("Ingrese el apellido del garante: ");
                        String apellidoG = entrada.nextLine();
                        System.out.println("Ingrese el usuario del garante: ");
                        String userG = entrada.nextLine();
                        Persona garante = new Persona(nombreG, apellidoG, userG);

                        System.out.println("Ingrese el valor del automoóvil: ");
                        double vA = entrada.nextDouble();

                        entrada.nextLine();

                        PrestamoAutomovil prestamo
                                = new PrestamoAutomovil(beneficiario, tiempo, ciudad,
                                        tA, marca, garante, vA);
                        prestamo.establecerValorMensualPagoA();
                        listaAutomovil.add(prestamo);
                        break;

                    case 2:
                        //Datos para el objeto tipo Prestamo
                        System.out.println("Ingrese nombre del beneficiario: ");
                        String nombre = entrada.nextLine();
                        System.out.println("Ingrese apellido del beneficiario: ");
                        String apellido = entrada.nextLine();
                        System.out.println("Ingrese el Username del beneficiario: ");
                        String username = entrada.nextLine();
                        Persona beneficiario = new Persona(nombre, apellido, username);

                        System.out.println("Ingrese la ciudad del prestamo: ");
                        String ciudad = entrada.nextLine();
                        System.out.println("Ingrese el tiempo a pagar el prestamo: ");
                        int tiempo = entrada.nextInt();

                        entrada.nextLine(); //Limpieza de buffer

                        //Datos de Prestamo Educativo
                        System.out.println("Ingrese el nivel de Estudio: ");
                        String nE = entrada.nextLine();
                        //Objeto tipo Insitutcion Educativa
                        InstitucionEducativa ins = new InstitucionEducativa();
                        System.out.println("Ingrese el nombre del "
                                + "Centro Educativo: ");
                        ins.establecerNombre(entrada.nextLine());
                        System.out.println("Ingrese las siglas del "
                                + "Centro educativo: ");
                        ins.establecerSiglas(entrada.nextLine());


                        System.out.println("Ingrese el valor de Carrera: ");
                        double vC = entrada.nextDouble();

                        PrestamoEducativo prestamo
                                = new PrestamoEducativo(beneficiario, tiempo,
                                        ciudad, nE, ins, vC);
                        prestamo.establecerValorMensualPagoB();

                        listaEducativo.add(prestamo);
                        break;
                    default:
                        break;
                }
            }

        } while (op != 0);
        System.out.println("Prestamos Automovil");
        for (int i = 0; i < listaAutomovil.size(); i++) {
            System.out.println(listaAutomovil.get(i));     
        }
        System.out.println("Prestamos Educativos");
        for (int i = 0; i < listaEducativo.size(); i++) {
            System.out.println(listaEducativo.get(i));     
        }
    }

}
