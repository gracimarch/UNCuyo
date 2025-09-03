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
        
        Comedor comedor = new Comedor();

        comedor.agregarPlato(new Menu("Milanesas a la napolitana con arroz", 2800));
        comedor.agregarPlato(new Menu("Pastel de papa", 3000));
        comedor.agregarPlato(new Menu("Ravioles con tuco", 2500));
        comedor.agregarPlato(new Menu("Tarta de zapallito", 2000));
        comedor.agregarPlato(new Menu("Pollo a la portuguesa", 2800));

        comedor.MostrarMenu();
    }
}
