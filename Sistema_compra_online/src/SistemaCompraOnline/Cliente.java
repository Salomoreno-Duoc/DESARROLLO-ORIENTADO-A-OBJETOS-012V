/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaCompraOnline;

/**
 *
 * @author CETECOM
 */
public class Cliente {
    private String idCliente, nombre;
    private CarritoCompra carrito;

    public Cliente(String idCliente, String nombre, CarritoCompra carrito) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.carrito = carrito;
    }
    
}
