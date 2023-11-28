/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.colegiado.pkg2;

/**
 *
 * @author rosca
 */
public class Spotify {
    
    public int idCancion, año, pos = 0, añoT = 2023;
    public String titulo, autor;
    public double duracion;
    public Array top[] = new Array[10];
 
    public Spotify() {
 
    }
 
    public void agregarCancion(int idCancion, String titulo, String autor, int año, double duracion) {
 
        top[pos] = new Array(idCancion, titulo, autor, año, duracion);
        pos += 1;
    }
 
    public void Mostrarcancion() {
 
        for (int i = 0; i < top.length; i++) {
 
            if (top[i] != null) {
 
                if (top[i].año < añoT) {
                    System.out.println("Canciones anteriores al año" + añoT);
                    System.out.println(
                            "Id de la cancion = " + top[i].idCancion + "\nTitulo = " + top[i].titulo + "\nAutor = "
                                    + top[i].autor + "\nAño = " + top[i].año + "\nDuracion = " + top[i].duracion);
                    System.out.println("*****************************************************");
                }
 
                if (top[i].año == añoT) {
                    System.out.println("Canciones del mismo año" + añoT);
                    System.out.println(
                            "Id de la cancion = " + top[i].idCancion + "\nTitulo = " + top[i].titulo + "\nAutor = "
                                    + top[i].autor + "\nAño = " + top[i].año + "\nDuracion = " + top[i].duracion);
                    System.out.println("*****************************************************");
 
                }
                System.out.println("*****************************************************");
 
                System.out.println("Autor numero 1 = " + top[0].autor);
                System.out.println(
                        "Id de la cancion = " + top[i].idCancion + "\nTitulo = " + top[i].titulo + "\nAutor = "
                                + top[i].autor + "\nAño = " + top[i].año + "\nDuracion = " + top[i].duracion);
 
            }
        }
    }
 
    public void separar() {
 
    }
 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
 
    public void setAutor(String autor) {
        this.autor = autor;
    }
 
    public void setId(int idCancion) {
        this.idCancion = idCancion;
    }
 
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
 
    public void setAño(int año) {
        this.año = año;
    }
 
    public int getId() {
        
        return idCancion;
    }
 
    public double getDuracion() {
        return duracion;
    }
 
    public int getAño() {
        return año;
    }
 
    public String getTitulo() {
        return titulo;
    }
 
    public String getAutor() {
        return autor;
    }

}
