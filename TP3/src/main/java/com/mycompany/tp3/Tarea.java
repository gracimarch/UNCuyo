package com.mycompany.tp3;


public class Tarea {

    private String Nombre;
    private String Descripcion;
    private Boolean Completado;

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

    public Boolean getCompletado() {
        return Completado;
    }

    public void setCompletado(Boolean Completado) {
        this.Completado = Completado;
    }

    public Tarea(String nombre, String descripcion, Boolean completado) {
        this.Nombre = nombre;
        this.Descripcion = descripcion;
        this.Completado = completado;
    }

    public void MostrarTarea() {
        System.out.println("\rNombre de la tarea: " + Nombre + "\r Descripción: " + Descripcion);
        if (Completado) {
            System.out.println("Completada");
        } else {
            System.out.println("No completada");
        }
    }

    public void CompletarTarea() {
        if (Completado == false) {
            this.setCompletado(true);
            System.out.println("\rSe completó la tarea");
        } else {
            System.out.println("\rLa tarea ya está completada");
        }
    }
}
