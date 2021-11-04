
package com.gm.mundopc;

/**
 *
 * @author Angie
 */
public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private  int contadorComputadora;
    private static final int maxComputadoras = 10;      

    public Orden() {
        
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[maxComputadoras];              
    }
    
    public void agregarComputadora(Computadora computador){
        if(this.contadorComputadora < Orden.maxComputadoras){
            this.computadoras[this.contadorComputadora++] = computador;
        }else {
            System.out.println("Exede el número de computadores");
        }
        
        
    }
    
    public void mostrarOrden(){
       System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
       System.out.println("Orden # " + this.idOrden);
       for(int i = 0 ; i <  this.contadorComputadora ; i++){
           System.out.println("Computadora: " + this.computadoras[i].getNombre());
           
       
       }
        
    }



}



