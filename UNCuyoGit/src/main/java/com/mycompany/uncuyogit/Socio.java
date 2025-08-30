/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uncuyogit;

/**
 *
 * @author graci
 */
public class Socio extends Persona {
    private Boolean DebeLibro;
    private String Email;
    private String Telefono;
    private int LibrosNoDevueltos;

    public Boolean getDebeLibro() {
        return DebeLibro;
    }

    public void setDebeLibro(Boolean DebeLibro) {
        this.DebeLibro = DebeLibro;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getLibrosNoDevueltos() {
        return LibrosNoDevueltos;
    }

    public void setLibrosNoDevueltos(int LibrosNoDevueltos) {
        this.LibrosNoDevueltos = LibrosNoDevueltos;
    }
}
