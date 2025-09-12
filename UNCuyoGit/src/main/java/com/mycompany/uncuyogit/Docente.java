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
public class Docente extends Personal {
    private String Titulo;    

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    
    public Docente(String dni, String nombre, String apellido, float sueldo, String titulo){
        super(dni, nombre, apellido, sueldo);
        this.Titulo = titulo;
    }
    
    /* polimorfismo */
    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("Título: " + Titulo);
    }
    
    public void DictarClase(int idmateria){
        for (Materia m : Materia.ListaMaterias) {
            if (m.getIdMateria() == idmateria){
                System.out.println("\rEl docente " + Nombre + " ha dictado clase de " + m.getNombre());
                return;
            }
        }
        System.out.println("\rNo se encontró la materia con ID " + idmateria);
    }
    
    public void cargarNota(String legajo, int idmateria, float nota, ArrayList<Alumno> ListaAlumnos) {
    for (Alumno a : ListaAlumnos) {
        if (a.getLegajo() == legajo) {
            for (Materia m : Materia.ListaMaterias) {
                if (m.getIdMateria() == idmateria) {
                    a.AgregarNota(m, nota);
                    System.out.println("El docente " + Nombre + " cargó la nota " + nota + " a " + a.getNombre() + " en " + m.getNombre());
                    return;
                }
            }
            System.out.println("No se encontró la materia con ID " + idmateria);
            return;
        }
    }
    System.out.println("No se encontró el alumno con legajo " + legajo);
}
}
