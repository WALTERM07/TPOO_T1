/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpoo_exament1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author MENDOZA-PC
 */
public class TPOO_ExamenT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ControlAlumnos controlador = new ControlAlumnos();
        int opcion = 0;
        do {
            System.out.println("\n--- SISTEMA DE GESTION ---");
            System.out.println("1. Registrar nuevo alumno");
            System.out.println("2. Ver lista de alumnos");
            System.out.println("3. Salir");
            System.out.print("Elija una opcion: ");
            try {
                opcion = leer.nextInt();
                leer.nextLine(); // Limpiar salto de linea

                if (opcion == 1) {
                    System.out.print("Ingrese nombre completo: ");
                    String nombre = leer.nextLine();

                    System.out.print("Ingrese tipo de documento (DNI / Carnet): ");
                    String tipoDoc = leer.nextLine();

                    System.out.print("Ingrese numero de documento: ");
                    String numDoc = leer.nextLine();

                    System.out.print("Ingrese nivel socioeconomico (A, B, C): ");
                    char nivel = leer.next().charAt(0);
                    leer.nextLine();

                    System.out.print("Ingrese tipo de beca (Total, Parcial, Ninguna): ");
                    String beca = leer.nextLine();

                    Alumno nuevo = new Alumno(nombre, tipoDoc, numDoc, nivel, beca);

                    if (nuevo.validarDocumento()) {
                        controlador.agregarAlumno(nuevo);
                        System.out.println("Alumno registrado con exito.");
                    } else {
                        System.out.println("Error: El documento no es valido (DNI: 8 digitos, Carnet: 11 digitos).");
                    }
                } else {
                    if (opcion == 2) {
                        controlador.listarAlumnos();
                    } else {
                        if (opcion == 3) {
                            System.out.println("Saliendo del programa...");
                        } else {
                            System.out.println("Opcion no valida. Intente del 1 al 3.");
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un numero valido en el menu.");
                leer.nextLine();
                opcion = 0;
            }
        } while (opcion != 3);

        leer.close();
    }
}
