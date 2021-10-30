/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.ventas.test;

import mx.com.gm.ventas.Orden;
import mx.com.gm.ventas.Producto;

/**
 *
 * @author Angie
 */
public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Shampoo" , 25000);
        Producto producto2 = new Producto("Jabón" , 20000);
        Producto producto3 = new Producto("Pasta" , 1000);
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto1);
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        
        
    }
    
}
