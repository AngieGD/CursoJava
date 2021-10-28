
package domain;

import java.math.BigDecimal;

/**
 *
 * @author Angie
 */

public class Empleado extends Persona{
    private int idEmpleado;
    private BigDecimal sueldo;
    private static int contadorEmpleado;

    public Empleado(String nombre , BigDecimal sueldo) {
        super (nombre);
        this.idEmpleado = ++ Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

   
    
}
