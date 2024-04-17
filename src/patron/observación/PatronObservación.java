/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patron.observación;

/**
 *
 * @author Acer
 */
public class PatronObservación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Libro libro = new Libro("Principito :D");

       
        UsuarioBiblioteca usuario1 = new UsuarioBiblioteca("Usuario1");
        

   
        libro.agregarObservador(usuario1);
        libro.devolverLibro("Usuario1");
        


    
    }
}