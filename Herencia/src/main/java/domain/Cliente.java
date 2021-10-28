/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.time.LocalDate;

/**
 *
 * @author Angie
 */
public class Cliente extends Persona {
    private int idCliente;
    private LocalDate fechaRegistro; 
    private boolean vip;
    private static int contadorcliente;



    public Cliente(LocalDate fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++ Cliente.contadorcliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }
        public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
    
    
}
