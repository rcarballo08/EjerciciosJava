/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int empleador = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de empleados"));
    double total = 0;
        
        for (int i = 0; i < empleador; i++) {
        int SalarioTemporal = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el salario del empleador " + (i + 1)));
        total = total + ((SalarioTemporal*0.0925)+(SalarioTemporal*0.0508));
        
        JOptionPane.showMessageDialog(null, "La empresa debera abonar a la CCSS el monto de "+total+"por concepto de SEM y IVM"); 
        
        }
    }
}
    