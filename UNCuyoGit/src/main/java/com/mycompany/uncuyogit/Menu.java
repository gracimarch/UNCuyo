/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uncuyogit;

/**
 *
 * @author graci
 */
public class Menu {
    public String Plato;
    public float Precio;

    public String getPlato() {
        return Plato;
    }

    public void setPlato(String Plato) {
        this.Plato = Plato;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }
    
    public Menu(String plato, float precio) {
        this.Plato = plato;
        this.Precio = precio;
    }
    
    public void MostrarDatos(){
        System.out.println(Plato + " | $" + Precio);
    }
}
