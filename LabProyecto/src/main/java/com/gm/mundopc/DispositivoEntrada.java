
package com.gm.mundopc;

/**
 *
 * @author Angie
 */
public class DispositivoEntrada {
    protected String Entrada;
    protected String marca;

    public DispositivoEntrada(String Entrada, String marca) {
        this.Entrada = Entrada;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "Entrada=" + Entrada + ", marca=" + marca + '}';
    }

    public String getEntrada() {
        return Entrada;
    }

    public void setEntrada(String Entrada) {
        this.Entrada = Entrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
    
    
    
    
    
}
