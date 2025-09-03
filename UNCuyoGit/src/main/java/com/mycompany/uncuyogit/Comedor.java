/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uncuyogit;

import java.util.ArrayList;

/**
 *
 * @author graci
 */
public class Comedor {
    public static ArrayList<Menu> ListaMenus = new ArrayList<>();

    public Comedor() {
    }
    
    public void agregarPlato(Menu m) {
        ListaMenus.add(m);
    }
    
    public void MostrarMenu() {
        System.out.println("Menú");
        for (Menu m : ListaMenus) {
            m.MostrarDatos();
        }
    }
    
    /*public void MostrarMenu() {
        System.out.println("Menú\r1. Milanesas a la napolitana con arroz\r2. Pastel de papa\r3. Ravioles con tuco\r4. Tarta de zapallito\r5. Pollo a la portuguesa");
    }*/
}
