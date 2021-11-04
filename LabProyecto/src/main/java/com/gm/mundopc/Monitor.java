
package com.gm.mundopc;

/**
 *
 * @author Angie
 */
public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
        
    }

    public Monitor(String marca, double tamaño) {
        this();
        this.marca = marca;
        this.tamanio = tamaño;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tama\u00f1o=" + tamanio + '}';
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamaño(double tamaño) {
        this.tamanio = tamaño;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public double getTamaño() {
        return tamanio;
    }
    
    
    
    
    
    
    
}
