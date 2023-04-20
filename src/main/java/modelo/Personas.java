/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alejandro
 */
public abstract class Personas {
    private String nombres;
    private String apellidos;
    private String email;
    private String dni;
    private String fechaNacimiento;

    public Personas(String nombres, String apellidos, String email, String dni, String fechaNacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", email=" + email + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
       
    
}
