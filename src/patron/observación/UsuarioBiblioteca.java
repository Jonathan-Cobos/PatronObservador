/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron.observación;

/**
 *
 * @author Acer
 */
import java.util.ArrayList;
import java.util.List;

public class UsuarioBiblioteca implements ObservadorCambios {
    private String nombre;
    private List<String> mensajes;

    public UsuarioBiblioteca(String nombre) {
        this.nombre = nombre;
        this.mensajes = new ArrayList<>();
    }

    @Override
    public void actualizar(String mensaje) {
        mensajes.add(mensaje);
        System.out.println("[" + nombre + "] Nuevo mensaje: " + mensaje);
    }
}
