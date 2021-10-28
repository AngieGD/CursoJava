
package test;

import domain.Empleado;
import java.math.BigDecimal;

/**
 *
 * @author Angie
 */
public class TestHerencia {
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Angie Garcia" , BigDecimal.valueOf(3000000));
        System.out.println("empleado1 = " + empleado1);
    }
}
