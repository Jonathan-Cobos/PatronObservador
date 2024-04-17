/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package patron.observación;

/**
 *
 * @author Acer
 */
public interface Devolucion {
    
void agregarObservador(ObservadorCambios observador);
    void eliminarObservador(ObservadorCambios observador);
    void notificarObservadores(String mensaje);
}