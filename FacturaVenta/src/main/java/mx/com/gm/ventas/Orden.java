package mx.com.gm.ventas;

/**
 *
 * @author Angie
 */
public class Orden {
    private int idOrden ;
    private static final int MAX_PRODUCTOS = 10;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new  Producto[Orden.MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto){
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            productos[this.contadorProductos++] = producto;
            
            
        }else {
            System.out.println("No puedes ingresar más de 10 productos");
        }
    }
    public double calcularTotal(){
        double total = 0;
        for(int  i = 0 ; i<this.contadorProductos ; i++){
            total += this.productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
        for(int i = 0 ; i < this.contadorProductos ; i++){
            System.out.println("Producto: " + productos[i].getNombre()
                +" Precio: " + productos[i].getPrecio() );
        }
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Id Orden: " + this.idOrden);
        System.out.println("Total " + this.calcularTotal());
        
    }

    
}
