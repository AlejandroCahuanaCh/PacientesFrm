/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author alejandro
 */
public class ConexionBD {
    private static final String DBNOMBRE = "clinicaDental_mysql";
    private static final String URL = "jdbc:mysql://localhost:3306/"+DBNOMBRE;
    private static final String USER = "root";
    private static final String PASSWORD = "12345678@aA";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
public static Connection conectar(){
    try {
        Connection conn= null;
        Class.forName(DRIVER);
        conn = DriverManager.getConnection(URL,USER,PASSWORD);
        System.out.println("conectado!!!!");
        return conn;
    } catch (ClassNotFoundException | SQLException e) {
       JOptionPane.showMessageDialog(null, e.getMessage());
        
    }
     return null;
}

public static void cerrarConexion(Connection conexion) throws SQLException {
       try {
        if (conexion != null) {
            conexion.close();
            System.err.println("conexion cerrada!!!!");
        }
    } catch (SQLException sQLException) {
      JOptionPane.showMessageDialog(null, sQLException);
    }
    }
}