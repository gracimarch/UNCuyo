/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp3;

/**
 *
 * @author Estudiante
 */
public class TP3 {

    public static void main(String[] args) {
        ListaTareas lista = new ListaTareas();
        
        Tarea t1 = new Tarea("Matematica", "TP1", false);
        Tarea t2 = new Tarea("Matematica", "TP2", false);
        Tarea t3 = new Tarea("Historia", "TP5", false);
        Tarea t4 = new Tarea("Biologia", "Examen", false);
        Tarea t5 = new Tarea("Geografia", "TP2", false);
        
        t1.MostrarTarea();
        t1.CompletarTarea();
        t1.MostrarTarea();
        
        lista.agregarTarea(t1);
        lista.agregarTarea(t2);
        lista.agregarTarea(t3);
        lista.agregarTarea(t4);
        lista.mostrarTareas();
        
        lista.obtenerTarea(2).MostrarTarea();
        
        lista.contieneTarea(t2);
        lista.contieneTarea(t5);
        lista.indiceTarea(t4);
        lista.eliminarTarea(t3);
        ListaTareas listaClonada = lista.clonarLista();
        listaClonada.mostrarTareas();
        lista.estaVacia();
        lista.limpiarLista();
        lista.estaVacia();
    }
}
