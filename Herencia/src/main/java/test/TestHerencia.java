
package test;

import domain.Cliente;
import domain.Empleado;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author Angie
 */
public class TestHerencia {
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Angie Garcia" , BigDecimal.valueOf(3000000));
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1 = new Cliente(LocalDate.now() , true , "Pablo" , 'M' , 23 , "Campo");
        System.out.println("cliente1 = " + cliente1);
        Cliente cliente2 = new Cliente(LocalDate.now() , true , "Diego" , 'M' , 18 , "Berlin");
        System.out.println("cliente2 = " + cliente2);
        
    }
}
