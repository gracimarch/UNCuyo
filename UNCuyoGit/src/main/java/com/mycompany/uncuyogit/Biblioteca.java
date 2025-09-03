/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uncuyogit;

/**
 *
 * @author graci
 */
public class Biblioteca {
    public Biblioteca(){
    }
    
    public void BuscarLibro(int idlibro){
        for (Libro l : Libro.ListaLibros) {
            if (l.getIdLibro() == idlibro){
                System.out.print("\rEl libro " + l.getTitulo());
                if (l.getDisponible() == true) {
                    System.out.println(" está disponible");
                } else {
                    System.out.println(" no está disponible");
                }
            return;
            }
        }
        System.out.println("\rNo se encontró el libro con ID " + idlibro);
    }
    
    public boolean PrestarLibro(int idlibro, String nombre){
        for (Libro l : Libro.ListaLibros) {
            if (l.getIdLibro() == idlibro){
                if (l.getDisponible() == true) {
                    System.out.println("\rSe ha prestado el libro " + l.getTitulo() + " a " + nombre);
                    l.setDisponible(false);
                    return true;
                } else {
                    System.out.println("\rEl libro no está disponible");
                    return false;
                }
            }
        }
        System.out.println("\rNo se encontró el libro con ID " + idlibro);
        return false;
    }
    
    public boolean RecibirLibro(int idlibro, String nombre){
        for (Libro l : Libro.ListaLibros) {
            if (l.getIdLibro() == idlibro){
                if (l.getDisponible() == false) {
                    System.out.println("\r" + nombre + " ha devuelto el libro " + l.getTitulo());
                    l.setDisponible(true);
                    return true;
                } else {
                    System.out.println("\rEl libro no ha sido prestado");
                    return false;
                }
            }
        }
        System.out.println("\rNo se encontró el libro con ID " + idlibro);
        return false;
    }
}
