/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author graci
 */
public class ListaTareas {

    public ArrayList<Tarea> ArrayListTarea = new ArrayList<>();

    public void AgregarTarea(Tarea tarea) {
        ArrayListTarea.add(tarea);
    }

    public void MostrarTarea() {
        System.out.println("\rTareas: ");
        Iterator<Tarea> itrArrayListTarea = ArrayListTarea.iterator();
        while (itrArrayListTarea.hasNext()) {
            Tarea t = itrArrayListTarea.next();
            System.out.print("\rNombre: " + t.getNombre() + "\rDescripción: " + t.getDescripcion() + "\r");
            if (t.getCompletada()) {
                System.out.println("Completada");
            } else {
                System.out.println("No completada");
            }
        }
    }

    public Tarea ObtenerTarea(int indice) {
        try {
            return ArrayListTarea.get(indice);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: índice " + indice + " fuera de rango.");
            return null;
        }
    }

    public void ContieneTarea(Tarea t) {
        try {
            if (t == null) {
                throw new NullPointerException("La tarea no puede ser null.");
            }
            if (ArrayListTarea.contains(t)) {
                System.out.println("La tarea " + t.getNombre() + " está en la lista.");
            } else {
                System.out.println("La tarea " + t.getNombre() + " no está en la lista.");
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void IndiceTarea(Tarea t) {
        System.out.println("El índice de la tarea es " + ArrayListTarea.indexOf(t));
    }

    public void EliminarTarea(int indice) {
        try {
            ArrayListTarea.remove(indice);
            System.out.println("Se eliminó la tarea correctamente.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: no existe una tarea en el índice " + indice);
        }
    }

    public void EliminarTarea(Tarea t) {
        try {
            if (!ArrayListTarea.remove(t)) {
                throw new IllegalArgumentException("La tarea no existe en la lista.");
            }
            System.out.println("Se eliminó la tarea correctamente.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void LimpiarLista() {
        ArrayListTarea.clear();
        System.out.println("Se vació la lista correctamente.");
    }

    public void EstaVacia() {
        if (ArrayListTarea.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("La lista no está vacía.");
        }
    }

    public ListaTareas ClonarLista() {
        ListaTareas copia = new ListaTareas();
        copia.ArrayListTarea = (ArrayList<Tarea>) this.ArrayListTarea.clone();
        System.out.println("Se clonó la lista correctamente.");
        return copia;
    }
}
