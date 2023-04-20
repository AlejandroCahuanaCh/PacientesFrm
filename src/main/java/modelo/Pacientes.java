/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alejandro
 */
public class Pacientes extends Personas{
    private String profesion;    // profesion del paciente
    private String fechaIngreso; // ingreso paciente
    private final Integer id;

    public Pacientes(Integer id, String nombres, String apellidos, String email, String dni,String profesion, String fechaNacimiento,
                     String fechaIngreso) {
        super(nombres, apellidos, email, dni, fechaNacimiento);
        this.id= id;
        this.profesion = profesion;
        this.fechaIngreso = fechaIngreso;
        
    }

    public Integer getId() {
        return id;
    }
    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return super.toString()+"Pacientes{" +", id=" + id +"profesion=" + profesion + ", fechaIngreso=" + fechaIngreso + '}';
    }


    
    
    
}
