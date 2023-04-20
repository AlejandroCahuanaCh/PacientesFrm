/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import datos.IDAO;
import datos.PacientesDAO;
import java.util.ArrayList;
import modelo.Pacientes;

/**
 *
 * @author alejandro
 */
public class PacientesControl implements IDAO<Pacientes>{

    @Override
    public ArrayList<Pacientes> listar(String condicion) {
        return new PacientesDAO().listar(condicion);
    }

    @Override
    public void insertar(Pacientes paciente) {
        new PacientesDAO().insertar(paciente);
    }

    @Override
    public void modificar(Pacientes paciente) {
        new PacientesDAO().modificar(paciente);
    }

    @Override
    public void eliminar(Pacientes paciente) {
        new PacientesDAO().eliminar(paciente);
    }

   
    
}
