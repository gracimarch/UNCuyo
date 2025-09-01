/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uncuyogit;

/**
 *
 * @author graci
 */
public class Personal extends Persona {
    private float Sueldo;

    public float getSueldo() {
        return Sueldo;
    }

    public void setSueldo(float Sueldo) {
        this.Sueldo = Sueldo;
    }
    
    public Personal(String dni, String nombre, String apellido, float sueldo){
        super(dni, nombre, apellido);
        this.Sueldo = sueldo;
    }
    
    /* polimorfismo */
    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("Sueldo: " + Sueldo);
    }
}
