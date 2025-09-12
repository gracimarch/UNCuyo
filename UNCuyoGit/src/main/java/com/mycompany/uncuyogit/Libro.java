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
public class Libro {
    private int IdLibro;
    private String Titulo;
    private String Autor;
    private Boolean Disponible;
    static ArrayList<Libro> ListaLibros = new ArrayList<>();

    public int getIdLibro() {
        return IdLibro;
    }

    public void setIdLibro(int IdLibro) {
        this.IdLibro = IdLibro;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public Boolean getDisponible() {
        return Disponible;
    }

    public void setDisponible(Boolean Disponible) {
        this.Disponible = Disponible;
    }

    public Libro(int idlibro, String titulo, String autor, Boolean disponible) {
        this.IdLibro = idlibro;
        this.Titulo = titulo;
        this.Autor = autor;
        this.Disponible = disponible;
        ListaLibros.add(this);
    }
    
    public static void MostrarLibros() {
        System.out.println("\rLibros:");
        Iterator<Libro> itrListaLibros = ListaLibros.iterator();
        while (itrListaLibros.hasNext()) {
            Libro ListaLibros = itrListaLibros.next();
            System.out.print("IdLibro: " + ListaLibros.getIdLibro() + " | Título: " + ListaLibros.getTitulo() + " | Autor: " + ListaLibros.getAutor());
            if (ListaLibros.getDisponible() == true) {
                System.out.println(" | Disponible");
            } else {
                System.out.println(" | No disponible");
            }
        }
    }
}
