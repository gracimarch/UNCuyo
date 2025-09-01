/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uncuyogit;

/**
 *
 * @author graci
 */
public class NoDocente extends Personal{
    private String Puesto;

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }
    
    public NoDocente(String dni, String nombre, String apellido, float sueldo, String puesto){
        super(dni, nombre, apellido, sueldo);
        this.Puesto = puesto;
        
    }
    
    /* polimorfismo */
    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("Puesto: " + Puesto);
    }
}
