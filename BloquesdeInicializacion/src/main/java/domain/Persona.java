/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Angie
 */
public class Persona {
    //Bloques de inicialización
    //van antes del constructor
    private final int idPersona;
    private static int contadorPersonas;
    
    //este es el bloque de inicialización  estatico
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
        //idPersona no se puede utilizar en el contexto estatico debido a que no es 
        //estatica 
        
    } 
    //El siguiente es un bloque de inicialización no estatico
    {
        System.out.println("Ejecución de bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
               
    }
    public Persona(){
        System.out.println("Ejecucion  de la clase");
        
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
    
    
    
}
