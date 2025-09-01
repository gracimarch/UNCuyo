/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uncuyogit;

/**
 *
 * @author graci
 */
public class Docente extends Personal {
    private String Titulo;    

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    
    public Docente(String dni, String nombre, String apellido, float sueldo, String titulo){
        super(dni, nombre, apellido, sueldo);
        this.Titulo = titulo;
        
    }
    
    /* polimorfismo */
    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("Título: " + Titulo);
    }
}
