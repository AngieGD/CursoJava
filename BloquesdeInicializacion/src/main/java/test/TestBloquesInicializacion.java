package test;

import domain.Persona;

/**
 *
 * @author Angie
 */
public class TestBloquesInicializacion {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        System.out.println("Persona: " + persona1.toString());
        System.out.println("-----------");
        Persona persona2 = new Persona();
        System.out.println("Persona: " + persona2.toString());        
        
        
    }
}
