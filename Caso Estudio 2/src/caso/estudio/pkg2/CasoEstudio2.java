/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.estudio.pkg2;

/**
 *
 * @author rosca
 */
public class CasoEstudio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gastos gastos = new Gastos();
        
        Amigo amigoGuillermo = gastos.amigos[2];
        double [] deudasGuillermo = gastos.calcularDeudas(amigoGuillermo);
        
        for (int i = 0; i < deudasGuillermo.length; i++) {
            if (gastos.amigos[i] != amigoGuillermo) {
                System.out.println(gastos.amigos[i].nombre + "le debe a" + amigoGuillermo.nombre + "un total de" + deudasGuillermo[i] + "dolares.");
            }
        }
    }
}
