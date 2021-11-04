
package com.gm.mundopc;

/**
 *
 * @author Angie
 */
public class Computadora {
    
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadora;
    
    
    
    private Computadora() {
        this.idComputadora = ++Computadora.contadorComputadora;
    }


    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }
    

    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }
    
    
    
           
    
}
