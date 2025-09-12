/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tp3;

/**
 *
 * @author graci
 */
public class TP3 {

    public static void main(String[] args) {
        ListaTareas lista = new ListaTareas();

        Tarea t1 = new Tarea("Estudiar Java", "Repasar colecciones y listas", false);

        Tarea t2 = new Tarea("Hacer ejercicio", "Correr 30 minutos", false);

        Tarea t3 = new Tarea("Leer un libro", "Avanzar 20 páginas", false);

        lista.AgregarTarea(t1);
        lista.AgregarTarea(t2);
        lista.AgregarTarea(t3);

        lista.MostrarTarea();

        System.out.println("\nProbando ObtenerTarea:");
        Tarea tareaObtenida = lista.ObtenerTarea(1);
        if (tareaObtenida != null) {
            tareaObtenida.MostrarInformacion();
        }

        System.out.println("\nProbando ContieneTarea (t1):");
        lista.ContieneTarea(t1);

        System.out.println("\nProbando IndiceTarea (t3):");
        lista.IndiceTarea(t3);

        System.out.println("\nProbando EliminarTarea por índice:");
        lista.EliminarTarea(0);
        lista.MostrarTarea();

        System.out.println("\nProbando EliminarTarea por objeto (t3):");
        lista.EliminarTarea(t3);
        lista.MostrarTarea();

        System.out.println("\nProbando EstaVacia:");
        lista.EstaVacia();

        /* probando excepciones */
        System.out.println("\nProbando ObtenerTarea con índice inválido:");
        Tarea tareaInvalida = lista.ObtenerTarea(10); // fuera de rango

        System.out.println("\nProbando EliminarTarea con índice inválido:");
        lista.EliminarTarea(5); // no existe ese índice

        System.out.println("\nProbando EliminarTarea con tarea que no existe:");
        Tarea falsa = new Tarea("Cocinar", "Preparar la cena", false);
        lista.EliminarTarea(falsa); // no está en la lista

        System.out.println("\nProbando CompletarTarea en tarea ya completada:");
        Tarea tCompletada = new Tarea("Pagar cuentas", "Luz, agua e internet", true);
        tCompletada.CompletarTarea();

        System.out.println("\nProbando ContieneTarea con null:");
        lista.ContieneTarea(null);

        System.out.println("\nProbando ClonarLista:");
        ListaTareas copia = lista.ClonarLista();
        copia.MostrarTarea();

        System.out.println("\nProbando LimpiarLista:");
        lista.LimpiarLista();
        lista.MostrarTarea();
        lista.EstaVacia();
    }
}
