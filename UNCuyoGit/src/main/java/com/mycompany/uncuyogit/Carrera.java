/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uncuyogit;

/**
 *
 * @author graci
 */
public class Carrera {
    private String Nombre;
    private int Duracion;
    private int CantidadMaterias;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public int getCantidadMaterias() {
        return CantidadMaterias;
    }

    public void setCantidadMaterias(int CantidadMaterias) {
        this.CantidadMaterias = CantidadMaterias;
    }

    public Carrera(String nombre, int duracion, int cantidadmaterias) {
        this.Nombre = nombre;
        this.Duracion = duracion;
        this.CantidadMaterias = cantidadmaterias;
    }
}
