/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uncuyogit;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author graci
 */
public class Alumno extends Persona {
    private String Legajo;
    private int AnioIngreso;
    private ArrayList<Materia> MateriasInscriptas = new ArrayList<>();
    static ArrayList<Alumno> ListaAlumnos = new ArrayList<>();
    private HashMap<Materia, Float> Notas = new HashMap<>();

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

    /* super usado para clases con herencia */
    public Alumno(String dni, String nombre, String apellido, String legajo, int anioingreso) {
        super(dni, nombre, apellido);
        this.Legajo = legajo;
        this.AnioIngreso = anioingreso;
        ListaAlumnos.add(this);
    }

    /* polimorfismo */
    @Override
    public void MostrarDatos() {
        super.MostrarDatos();
        System.out.println("Legajo: " + Legajo + "\rAño de ingreso: " + AnioIngreso);
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

    public void MostrarMateriasInscriptas() {
        if (MateriasInscriptas.isEmpty()) {
            System.out.println("\rEl alumno no está inscripto en ninguna materia.");
        } else {
            System.out.println("\rMaterias inscriptas de " + getNombre() + ":");
            for (Materia m : MateriasInscriptas) {
                System.out.println("- " + m.getNombre());
            }
        }
    }
    
    public void AgregarNota(Materia materia, float nota){
        Notas.put(materia, nota);
    }
    
    public void MostrarNotas(){
        System.out.println("\rNotas de " + Nombre + " " + Apellido + ":");
        for (Materia m : Notas.keySet()){
            System.out.println(m.getNombre() + ":" + Notas.get(m));
        }
    }
}
