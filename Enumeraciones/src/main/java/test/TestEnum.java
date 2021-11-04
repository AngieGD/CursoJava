
package test;

import enumeracion.Continentes;
import enumeracion.Enumdias;

/**
 *
 * @author Angie
 */
public class TestEnum {
    public static void main(String[] args) {
//        System.out.println("Dia 1: " + Enumdias.LUNES); 
//        indicardiaSemana(Enumdias.MIERCOLES );
          System.out.println("Continente #4: " + Continentes.AMERICA);  
          System.out.println("Numero de paises del 4 contiente " + Continentes.AMERICA.getPaises() );
    }
    private static void indicardiaSemana(Enumdias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer día de la semana");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana");
                break;
            default:
                System.out.println("Dia no valido");
        }
    }
}

