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
    
    public Socio(String dni, String nombre, String apellido, String email, String telefono, int librosnodevueltos){
        super(dni, nombre, apellido);
        this.Email = email;
        this.Telefono = telefono;
        this.LibrosNoDevueltos = librosnodevueltos;
        if (librosnodevueltos > 0){
            this.DebeLibro = true;
        } else{
            this.DebeLibro = false;
        }
    }
    
    /* polimorfismo */
    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        System.out.println("Email: " + Email + "\rTeléfono: " + Telefono);
        if (DebeLibro == true){
            System.out.println("Debe " + LibrosNoDevueltos + " libros");
        } else {
            System.out.println("No debe libros");
        }
    }
    
    public void SoliticarLibro(int idlibro, Biblioteca biblioteca){
        boolean PrestamoExitoso = biblioteca.PrestarLibro(idlibro, Nombre);
        if (PrestamoExitoso == true){
            this.LibrosNoDevueltos++;
            this.DebeLibro = true;
        }
    }
    
    public void DevolverLibro(int idlibro, Biblioteca biblioteca){
        boolean DevolucionExitosa = biblioteca.RecibirLibro(idlibro, Nombre);
        if (DevolucionExitosa == true){
            this.LibrosNoDevueltos--;
            this.DebeLibro = false;
        }
    }
}
