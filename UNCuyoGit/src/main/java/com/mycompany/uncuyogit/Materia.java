/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uncuyogit;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author graci
 */
public class Materia {
    public int IdMateria;
    public String Nombre;
    public int Duracion;
    public Boolean Promocionable;
    public static ArrayList<Materia> ListaMaterias = new ArrayList<>();

    public int getIdMateria() {
        return IdMateria;
    }

    public void setIdMateria(int IdMateria) {
        this.IdMateria = IdMateria;
    }

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

    public Boolean getPromocionable() {
        return Promocionable;
    }

    public void setPromocionable(Boolean Promocionable) {
        this.Promocionable = Promocionable;
    }

    public Materia(int id, String nombre, int duracion, Boolean promocionable) {
        this.IdMateria = id;
        this.Nombre = nombre;
        this.Duracion = duracion;
        this.Promocionable = promocionable;
        ListaMaterias.add(this);
    }

    public void MostrarMaterias() {
        System.out.println("Materias:");
        Iterator<Materia> itrListaMaterias = ListaMaterias.iterator();
        while (itrListaMaterias.hasNext()) {
            Materia ListaMaterias = itrListaMaterias.next();
            System.out.print("IdMateria: " + ListaMaterias.getIdMateria() + " | Nombre: " + ListaMaterias.getNombre() + " | Duración: " + ListaMaterias.getDuracion() + " meses");
            if (ListaMaterias.getPromocionable() == true) {
                System.out.println(" | Promocionable");
            } else {
                System.out.println(" | No promocionable");
            }
        }
    }

}
