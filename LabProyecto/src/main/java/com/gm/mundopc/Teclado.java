
package com.gm.mundopc;

/**
 *
 * @author Angie
 */
public class Teclado extends DispositivoEntrada{
    
    private int idTeclado;
    private static int contadorTeclado;
    
    public Teclado(String Entrada, String marca) {
        super(Entrada, marca);
        this.idTeclado = ++Teclado.contadorTeclado;              
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + '}';
    }
    
    
}
