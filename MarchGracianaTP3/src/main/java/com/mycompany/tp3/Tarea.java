/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

/**
 *
 * @author graci
 */
public class Tarea {

    private String Nombre;
    private String Descripcion;
    private boolean Completada;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public boolean getCompletada() {
        return Completada;
    }

    public void setCompletada(boolean Completada) {
        this.Completada = Completada;
    }

    public Tarea(String Nombre, String Descripcion, boolean Completada) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Completada = Completada;
    }

    public void CompletarTarea() {
        try {
            if (Completada) {
                throw new IllegalStateException("La tarea '" + Nombre + "' ya está completada.");
            }
            Completada = true;
            System.out.println("Se completó la tarea: " + Nombre);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void MostrarInformacion() {
        System.out.print("\rNombre: " + Nombre + "\rDescripción: " + Descripcion + "\r");
        if (Completada) {
            System.out.println("Completada");
        } else {
            System.out.println("No completada");
        }
    }
}
