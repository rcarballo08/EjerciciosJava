/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospotify;

/**
 *
 * @author HP
 */
public class Cancion {
    private String id;
    private String titulo;
    private String autor;
    private String duracion;
    private String añoDeCreacion;
    
    public Cancion(String id, String titulo, String autor, String duracion, String añoDeCreacion){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.añoDeCreacion = añoDeCreacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getAñoDeCreacion() {
        return añoDeCreacion;
    }

    public void setAñoDeCreacion(String añoDeCreacion) {
        this.añoDeCreacion = añoDeCreacion;
    }
    
}
