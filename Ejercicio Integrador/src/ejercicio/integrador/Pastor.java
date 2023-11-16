/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.integrador;

/**
 *
 * @author HP
 */
public class Pastor {
    //atributos 
    public String iglesia;
    public String nombre;
    public int cantidadFeligreses;
    
    //constructor
    public Pastor(String iglesia, String nombre, int cantidadFeligreses) {
        this.iglesia = iglesia;
        this.nombre = nombre;
        this.cantidadFeligreses = cantidadFeligreses;
    }
    
    //setters and getters

    public String getIglesia() {
        return iglesia;
    }

    public void setIglesia(String iglesia) {
        this.iglesia = iglesia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadFeligreses() {
        return cantidadFeligreses;
    }

    public void setCantidadFeligreses(int cantidadFeligreses) {
        this.cantidadFeligreses = cantidadFeligreses;
    }
    
}
