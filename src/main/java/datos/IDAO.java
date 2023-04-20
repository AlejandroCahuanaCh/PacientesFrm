/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author alejandro
 * @param <T>
 */
public interface IDAO<T> {
    
    public ArrayList<T> listar(String condicion);
    public void insertar(T obj);
    public void modificar(T obj);
    public void eliminar(T obj);
    
}
