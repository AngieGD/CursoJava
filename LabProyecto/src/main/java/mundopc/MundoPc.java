/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.Monitor;
import com.gm.mundopc.Orden;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

/**
 *
 * @author Angie
 */
public class MundoPc {
    public static void main(String[] args) {
         
        //TECLADOS
        Teclado teclado1 = new Teclado("USB" , "Genius");
        Teclado teclado2 = new Teclado("USB" , "Paul");
        
        //Ratones
        Raton raton1 = new Raton( "USB" ,"Genius");
        Raton raton2 = new Raton( "USB" ,"mac");
        
        //MONITOR
        Monitor monitor1 = new Monitor("Asus" , 70);
        Monitor monitor2 = new Monitor("Sonic" , 80);
        
        //COMPUTADORAS
        Computadora computador1 = new Computadora("HP" , monitor1 , teclado1 , raton1 );
        Computadora computador2 = new Computadora("Aser" , monitor2 , teclado2 , raton2);
        
        //ORDENES
        Orden orden1 = new Orden();
        
        
        
        orden1.agregarComputadora(computador2);
        orden1.agregarComputadora(computador1);
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computador1);
        orden2.agregarComputadora(computador2);
        orden2.mostrarOrden();
        
        
    }
    
}
