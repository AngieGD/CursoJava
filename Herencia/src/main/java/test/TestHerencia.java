
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
        
        var fecha = LocalDate.now();
        Cliente cliente1 = new Cliente(fecha , true , "Pablo" , 'M' , 23 , "Campo");
        System.out.println("cliente1 = " + cliente1);
   
        
    }
}
