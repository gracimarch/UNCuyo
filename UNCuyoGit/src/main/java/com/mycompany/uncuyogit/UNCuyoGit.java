/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uncuyogit;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author graci
 */
public class UNCuyoGit {

    public static void main(String[] args) {
        Alumno a1 = new Alumno("47372498", "Cristian", "Fernandez", "15136", 2025);
        Alumno a2 = new Alumno("47875212", "Graciana", "March", "15168", 2025);
        a1.MostrarDatos();
        a2.MostrarDatos();
        
        Materia Programacion = new Materia(1,"Programación", 6, true);
        Materia SO = new Materia(2, "Sistemas Operativos", 6, true);
        Materia PAFS = new Materia(3, "Prácticas de Actividad Física Saludable", 12, false);
        
        Materia.MostrarMaterias();
        
        a1.InscribirseMateria(1, Materia.ListaMaterias);
        a1.InscribirseMateria(2, Materia.ListaMaterias);
        a1.InscribirseMateria(3, Materia.ListaMaterias);
        a2.InscribirseMateria(1, Materia.ListaMaterias);
        a2.InscribirseMateria(2, Materia.ListaMaterias);
        
        a1.MostrarMateriasInscriptas();
        a2.MostrarMateriasInscriptas();
        
        Docente pf1 = new Docente("30202404", "Jorge", "Lucero", 800000 , "Licenciado");
        pf1.MostrarDatos();
        pf1.DictarClase(3);
        
        pf1.cargarNota("15168", 1, 10, Alumno.ListaAlumnos);
        a2.MostrarNotas();
        
        Comedor comedor = new Comedor();

        comedor.AgregarPlato(new Menu("Milanesas a la napolitana con arroz", 2800));
        comedor.AgregarPlato(new Menu("Pastel de papa", 3000));
        comedor.AgregarPlato(new Menu("Ravioles con tuco", 2500));
        comedor.AgregarPlato(new Menu("Tarta de zapallito", 2000));
        comedor.AgregarPlato(new Menu("Pollo a la portuguesa", 2800));

        comedor.MostrarMenu();
        
        comedor.RegistrarCompra("47372498", 1, "01/09/2025", 2500, "Mercado Pago");
        comedor.RegistrarCompra("47875212", 2, "02/09/2025", 2800, "Efectivo");
        
        Biblioteca biblioteca = new Biblioteca();
        
        Libro l1 = new Libro(1, "Matemática Discreta", "Johnsonbaugh", true);
        Libro l2 = new Libro(2, "POO en Java", "Blasco", true);
        
        Libro.MostrarLibros();
        
        biblioteca.BuscarLibro(2);
        
        Socio s1 = new Socio("47372498", "Cristian", "Fernandez", "cristiandavidf06@gmail.com", "2615785196", 0);
        s1.MostrarDatos();
        s1.SoliticarLibro(2, biblioteca);
        s1.MostrarDatos();
        biblioteca.BuscarLibro(2);
        s1.DevolverLibro(2, biblioteca);
        s1.MostrarDatos();
        biblioteca.BuscarLibro(2);
    }
}
