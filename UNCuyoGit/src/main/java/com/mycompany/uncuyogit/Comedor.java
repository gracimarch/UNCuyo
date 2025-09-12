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
    private static ArrayList<Menu> ListaMenus = new ArrayList<>();

    public Comedor() {
    }
    
    public void AgregarPlato(Menu m) {
        ListaMenus.add(m);
    }
    
    public void MostrarMenu() {
        System.out.println("\rMenú");
        for (Menu m : ListaMenus) {
            m.MostrarPlato();
        }
    }
    
    public void RegistrarCompra(String dni, int idcompra, String fecha, float monto, String metodopago){
        System.out.println("\rCompra de " + dni + " registrada");
        Compra compra = new Compra(idcompra, fecha, monto, metodopago);
        compra.GenerarTicket();
    }
    
    /* dejo esto por las dudas :)
    public void MostrarMenu() {
        System.out.println("Menú\r1. Milanesas a la napolitana con arroz\r2. Pastel de papa\r3. Ravioles con tuco\r4. Tarta de zapallito\r5. Pollo a la portuguesa");
    }*/
}
