/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.colegiado.pkg2;

/**
 *
 * @author rosca
 */
public class EjercicioColegiado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Spotify spo = new Spotify();
        spo.agregarCancion(11345, "Te amo", "Franco de Vita", 1988, 3.43);
        spo.agregarCancion(16327, "Cuando Nadie Ve", "Morat", 2016, 3.45);
        spo.agregarCancion(18365, "Me Muero", "Carlos Rivera", 2018, 3.29);
        spo.agregarCancion(17452, "Me Cambiaste La Vida", "Rio Roma", 2011, 3.54);
        spo.agregarCancion(12652, "Rude", "MAGIC", 2014, 3.45);
        spo.agregarCancion(15562, "Somebody That I Used To Know", "Gotye", 2011, 4.03);
        spo.agregarCancion(14785, "Ride", "Twenty One Pilots", 2015, 3.45);
        spo.agregarCancion(15581, "Let Her Go", "Passenger", 2012, 4.14);
        spo.agregarCancion(15211, "Coldplay", "Coldplay", 2011, 4.20);
        spo.agregarCancion(17841, "Wake Me Up", "Avicii", 2013, 4.32);
        spo.Mostrarcancion();
    }
    
}
