/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Estudiante
 */
public class ListaTareas {
    public ArrayList<Tarea> ArrayListTarea = new ArrayList<>();
    
    public void agregarTarea(Tarea tarea){
        ArrayListTarea.add(tarea);
    }
    
    public void mostrarTareas(){
        System.out.println("\r Tareas:");
        Iterator<Tarea> itrArrayListTarea = ArrayListTarea.iterator();
        while (itrArrayListTarea.hasNext()){
            Tarea t = itrArrayListTarea.next();
            System.out.print(t.getNombre() + ": " + t.getDescripcion());
            if (t.getCompletado()){
                System.out.println(". Completada");
            }else{
                System.out.println(". No completada");
            }
        }
    }
    
    public Tarea obtenerTarea(int id) {
        if (id < 0 || id >= ArrayListTarea.size()) {
            System.out.println("\rNo existe ese indice");
            return null;
        }
        return ArrayListTarea.get(id);
    }
    
    public void contieneTarea(Tarea t){
        if (ArrayListTarea.contains(t)){
            System.out.println("\rExiste esa tarea en la lista");
        }else{
            System.out.println("\rNo existe una tarea en la lista");
        }
    }
    
    public void indiceTarea(Tarea t){
        System.out.println("\rEl indice de la tarea es " + ArrayListTarea.indexOf(t));
    }
    
    public void eliminarTarea(Tarea t){
        ArrayListTarea.remove(t);
        System.out.println("\rSe ha eliminado la tarea");
    }
    
    public void limpiarLista(){
        ArrayListTarea.clear();
        System.out.println("\rSe ha vaciado la lista");
    }
    
    public void estaVacia(){
        if (ArrayListTarea.isEmpty()){
            System.out.println("\rLa lista de tareas esta vacia");
        }else{
            System.out.println("\rLa lista de tareas tiene elementos");
        }
    }
    
    public ListaTareas clonarLista(){
        ListaTareas copia = new ListaTareas();
        copia.ArrayListTarea = (ArrayList<Tarea>) this.ArrayListTarea.clone();
        System.out.println("\rSe clono la lista");
        return copia;
    }
}
