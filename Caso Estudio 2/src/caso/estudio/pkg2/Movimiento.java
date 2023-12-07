/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.estudio.pkg2;

/**
 *
 * @author rosca
 */

//Clase Movimiento
public class Movimiento {
    String descripcion;     
    Amigo[] participantes;    
    Amigo quienPago;     
    double montoTotal;     
    String moneda;     
    
    public Movimiento(String descripcion, Amigo[] participantes, Amigo quienPago, double montoTotal, String moneda) {         
        this.descripcion = descripcion;         
        this.participantes = participantes;         
        this.quienPago = quienPago;         
        this.montoTotal = montoTotal;         
        this.moneda = moneda;     } 
}
