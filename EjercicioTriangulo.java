/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.triangulo;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class EjercicioTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String Triangulo="";
        
        String entry=JOptionPane.showInputDialog("Introduzca el numero de filas que requiera: ");
        int cifra=Integer.parseInt(entry);
        
        for (int i = 0; i < cifra + 1; i++) {
            for (int j = 0; j < i; j++) {
                Triangulo=Triangulo + "*";
                
            }
            Triangulo=Triangulo+"\n";
            
        }
        
        System.out.println(Triangulo);
               
        }
    
}
