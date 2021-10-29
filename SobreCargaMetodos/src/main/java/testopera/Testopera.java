/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testopera;

import operaciones.Operaciones;

/**
 *
 * @author Angie
 */
public class Testopera {
    public static void main(String[] args) {
        var resultado  = Operaciones.sumar(5, 6);
        var result3 = Operaciones.sumar(5.5, 8);
        System.out.println("re" + resultado + "resu" + result3);
    }
    
}
