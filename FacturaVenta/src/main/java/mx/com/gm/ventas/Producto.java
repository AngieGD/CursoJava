
package mx.com.gm.ventas;

/**
 *
 * @author Angie
 */
public class Producto {
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    


    private Producto() {
        this.idProducto = ++Producto.contadorProductos; 
    }

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
        
    }

    public int getidProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idOrder=" + idProducto+ ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
    
    
    
    
    
}
