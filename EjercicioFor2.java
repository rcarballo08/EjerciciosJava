/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkgfor.pkg2;

/**
 *
 * @author HP
 */

public class EjercicioFor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String resultado ="";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                resultado = resultado + "@";   
            }
            resultado =resultado + "\n";   
        }
        System.out.println(resultado);
    }
    
}
