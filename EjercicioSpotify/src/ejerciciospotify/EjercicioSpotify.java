/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospotify;

/**
 *
 * @author HP
 */
public class EjercicioSpotify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cancion = new Cancion("5485","I wanna be yours","Artic Monkeys","187","2013");
        
        System.out.println("ID de la canción: " + cancion.getId());
        System.out.println("Titulo de la canción: " + cancion.getTitulo());
        System.out.println("Autor de la canción: " + cancion.getAutor());
        System.out.println("Duracion de la canción: " + cancion.getDuracion() + " segundos ");
        System.out.println("Año de creación: " + cancion.getAñoDeCreacion());
        
    }
}
