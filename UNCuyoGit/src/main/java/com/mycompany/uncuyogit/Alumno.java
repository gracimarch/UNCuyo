/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uncuyogit;

import java.util.ArrayList;

/**
 *
 * @author graci
 */
public class Alumno extends Persona {

    private String Legajo;
    private int AnioIngreso;
    private ArrayList<Materia> MateriasInscriptas = new ArrayList<>();

    public String getLegajo() {
        return Legajo;
    }

    public void setLegajo(String Legajo) {
        this.Legajo = Legajo;
    }

    public int getAnioIngreso() {
        return AnioIngreso;
    }

    public void setAnioIngreso(int AnioIngreso) {
        this.AnioIngreso = AnioIngreso;
    }

    public void InscribirseMateria(int IdMateria, ArrayList<Materia> ListaMaterias) {
        for (Materia m : ListaMaterias) {
            if (m.getIdMateria() == IdMateria) {
                MateriasInscriptas.add(m);
                System.out.println("Se inscribió a: " + m.getNombre() + " correctamente.");
                return;
            }
        }
        System.out.println("Materia con ID " + IdMateria + " no encontrada.");
    }

    public void MostrarMateriasInscritas() {
        if (MateriasInscriptas.isEmpty()) {
            System.out.println("El alumno no está inscripto en ninguna materia.");
        } else {
            System.out.println("Materias inscriptas de " + getNombre() + ":");
            for (Materia m : MateriasInscriptas) {
                System.out.println("- " + m.getNombre());
            }
        }
    }
}
