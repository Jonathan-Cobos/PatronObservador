/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron.observación;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Libro implements Devolucion {
    private String titulo;
    private List<ObservadorCambios> observadores;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.observadores = new ArrayList<>();
    }

    @Override
    public void agregarObservador(ObservadorCambios observador) {
        observadores.add(observador);
    }

    @Override
    public void eliminarObservador(ObservadorCambios observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores(String mensaje) {
        for (ObservadorCambios observador : observadores) {
            observador.actualizar(mensaje);
        }
    }

    public void devolverLibro(String usuario) {
        String mensaje = "El libro '" + titulo + "' ha sido devuelto por " + usuario;
        notificarObservadores(mensaje);
    }
}
