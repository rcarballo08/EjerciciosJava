/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.tabla.de.multiplicar.pkg2;

/**
 *
 * @author HP
 */
public class EjercicioTablaDeMultiplicar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla de multiplicar del numero: " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + i*j);
                
            }  
        }    
    }  
}
