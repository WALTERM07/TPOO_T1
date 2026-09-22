/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpoo_exament1;

import java.util.ArrayList;



/**
 *
 * @author MENDOZA-PC
 */
public class ControlAlumnos {
   public ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    public void agregarAlumno(Alumno a) {
        listaAlumnos.add(a);
    }

    public void listarAlumnos() {
        if (listaAlumnos.isEmpty()) {
            System.out.println("\nNo hay alumnos registrados todavia.");
        } else {
            System.out.println("\n--- LISTA DE ALUMNOS REGISTRADOS ---");
            for (int i = 0; i < listaAlumnos.size(); i++) {
                Alumno alu = listaAlumnos.get(i);
                System.out.println((i + 1) + ". " + alu.mostrarDatos());
            }
        }
    }
}
