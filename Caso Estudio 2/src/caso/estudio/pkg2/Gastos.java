/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.estudio.pkg2;

/**
 *
 * @author rosca
 */
public class Gastos {
    Amigo[] amigos;
    Movimiento [] movimientos;
    int totalAmigos;
    int totalMovimientos;
    
    public Gastos() {
        amigos = new Amigo[6];
        movimientos = new Movimiento[8];
        totalAmigos = 6;
        totalMovimientos = 0;
        AgAmigo();
        AgMovimientos();
    }
    
    private void AgAmigo() {
        amigos[0] = New Amigo("Joshua");
        amigos[1] = New Amigo("Greivin");
        amigos[2] = New Amigo("Guillermo");
        amigos[3] = New Amigo("Andres");
        amigos[4] = New Amigo("Tavo");
        amigos[5] = New Amigo("David");
    }
    
    private void AgMovimientos() {
        Amigo[] participantes1 = { amigos[0], amigos[1], amigos[2], amigos[3], amigos[4], amigos[5] };
        movimientos[0] = new Movimiento("Desayuno coffePrime", participantes1, amigos[2], 120, "Dolares");
 
        Amigo[] participantes2 = { amigos[0], amigos[1], amigos[2], amigos[3], amigos[4] };
        movimientos[1] = new Movimiento("Almuerzo Pig Factory", participantes2, amigos[2], 200, "Dolares");
 
        Amigo[] participantes3 = { amigos[0], amigos[5] };
        movimientos[2] = new Movimiento("Cena FastFood", participantes3, amigos[5], 50, "Dolares");
 
        Amigo[] participantes4 = { amigos[2], amigos[3], amigos[1], amigos[4] };
        movimientos[3] = new Movimiento("Pizza Hut", participantes4, amigos[4], 100, "Dolares");
 
        Amigo[] participantes5 = { amigos[2] };
        movimientos[4] = new Movimiento("Quicksilver store", participantes5, amigos[1], 150, "Dolares");
 
        Amigo[] participantes6 = { amigos[3], amigos[0] };
        movimientos[5] = new Movimiento("Apple store", participantes6, amigos[0], 200, "Dolares");
 
        Amigo[] participantes7 = { amigos[0], amigos[1], amigos[2], amigos[3], amigos[4], amigos[5] };
        movimientos[6] = new Movimiento("Desayuno chillis", participantes7, amigos[1], 150, "Dolares");
 
        Amigo[] participantes8 = { amigos[0], amigos[1], amigos[2], amigos[3], amigos[4], amigos[5] };
        movimientos[7] = new Movimiento("Almuerzo hooters", participantes8, amigos[4], 180, "Dolares");
    }
    
    public void agregarMovimiento(String descripcion, Amigo[] participantes, Amigo quienPago, double montoTotal, String moneda) {
        movimientos[totalMovimientos] = new Movimiento(descripcion, participantes, quienPago, montoTotal, moneda);
        totalMovimientos++;
    }
    
    public double [] calcularDeudas(Amigo amigoEspecifico) {
        double [] deudas = new double[totalAmigos];
        
        for (int i = 0; i < totalAmigos; i++) {
            deudas[i] = 0.0;
        }
        
        for(int i = 0; i < totalMovimientos;i++) {
            if (movimientos[i].quienPago == amigoEspecifico) {
                for (Amigo participante : movimientos[i].participantes) {
                    if (participante != amigoEspecifico) {
                        double montoPorPersona = movimientos[i].montoTotal / movimientos[i].participantes.length;
                        for (int j = 0;j < totalAmigos;j++) {
                            if (amigos[j] == participante) {
                                deudas[j] += montoPorPersona;
                                break;
                            }
                        }
                    }
                }
            }
        }
        
    return deudas;
    
    }
}
