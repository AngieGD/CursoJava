
package test;

import domain.Persona;

/**
 *
 * @author Angie
 */
public class PersonaPrueba {
    
    public static void main(String[] args){
        Persona persona1 = new Persona("Angie Garcia");
//        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona("Ginna Garcia");
//        System.out.println("persona2 = " + persona2);
        //PersonaPrueba pru = new PersonaPrueba();
        imprimir(persona2);

    }
    
    static public void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    
}
