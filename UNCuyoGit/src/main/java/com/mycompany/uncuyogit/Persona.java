/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uncuyogit;

/**
 *
 * @author graci
 */
public class Persona {
    private String DNI;
    String Nombre;
    String Apellido;
    private String FechaNacimiento;

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }
    
    public Persona(String dni, String nombre, String apellido, String fechanacimiento){
        this.DNI = dni;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.FechaNacimiento = fechanacimiento;
    }
    
    /*sobrecarga*/
    public Persona(String dni, String nombre, String apellido){
        this.DNI = dni;
        this.Nombre = nombre;
        this.Apellido = apellido;
    }
    
    public void MostrarDatos(){
        System.out.println("\rDNI: " + DNI + "\rNombre y apellido: " + Nombre + " " + Apellido);
    }
}
