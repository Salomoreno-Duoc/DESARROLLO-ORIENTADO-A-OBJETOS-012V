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
public class Producto {
    private String idProducto, nombre;
    private double precio;

    public Producto(String idProducto, String nombre, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    
}
