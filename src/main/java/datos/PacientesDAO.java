/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Pacientes;

/**
 *
 * @author alejandro
 */
public class PacientesDAO implements IDAO<Pacientes>{
   
    private Connection con = null;
   
    public PacientesDAO() {
        con = ConexionBD.conectar();
    }

    @Override
    public ArrayList<Pacientes> listar(String condicion) {
        try {
            Pacientes pacientesT;
            ArrayList<Pacientes> listaPacientes = new ArrayList<>();
            String consultaSQL = "SELECT * FROM Pacientes "+ condicion + ";";
            PreparedStatement ps = con.prepareStatement(consultaSQL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
				pacientesT = new Pacientes(
                                        (Integer)rs.getInt("idPaciente"), 
                                        rs.getString("nombres"),
                                        rs.getString("apellidos"),
                                        rs.getString("email"),
                                        rs.getString("dni"),
                                        rs.getString("profesion"),
                                        rs.getString("fechaNacimiento"),
                                        rs.getString("fechaIngreso")
                                        );
				listaPacientes.add(pacientesT);
            }
            return listaPacientes;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
           
        }
        finally{
            try {
                ConexionBD.cerrarConexion(con);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        return null;
    }

    @Override
    public void insertar(Pacientes paciente) {
        try {
			String sqlSentence = "INSERT INTO Pacientes (nombres, apellidos, email, dni, profesion, "
                                            + "fechaNacimiento,fechaIngreso) "
                                            + "VALUES (?,?,?,?,?,?,CURDATE());";
			PreparedStatement ps = con.prepareStatement(sqlSentence);
			ps.setString(1, paciente.getNombres());
			ps.setString(2, paciente.getApellidos());
			ps.setString(3, paciente.getEmail());
			ps.setString(4, paciente.getDni());
                        ps.setString(5, paciente.getProfesion());
			ps.setString(6, paciente.getFechaNacimiento());
			ps.executeUpdate();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
         finally{
            try {
                ConexionBD.cerrarConexion(con);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }

    @Override
    public void modificar(Pacientes paciente) {
        try {
			String sqlSentence = "UPDATE Pacientes SET nombres=?, apellidos=?, email=?, dni=?,"
                                        + "profesion=?, fechaNacimiento=?"
					+ " WHERE idPaciente=?";
			PreparedStatement ps = con.prepareStatement(sqlSentence);
			ps.setString(1, paciente.getNombres());
			ps.setString(2, paciente.getApellidos());
			ps.setString(3, paciente.getEmail());
			ps.setString(4, paciente.getDni());
                        ps.setString(5, paciente.getProfesion());
                        ps.setString(6, paciente.getFechaNacimiento());
			ps.setInt(7, paciente.getId());
			ps.executeUpdate();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
        finally{
            try {
                ConexionBD.cerrarConexion(con);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }

    @Override
    public void eliminar(Pacientes paciente) {
            try {
			String sqlSentence = "DELETE FROM Pacientes WHERE idPaciente=?";
			PreparedStatement ps = con.prepareStatement(sqlSentence);
			ps.setInt(1, paciente.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
            finally{
            try {
                ConexionBD.cerrarConexion(con);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
    
    
}
