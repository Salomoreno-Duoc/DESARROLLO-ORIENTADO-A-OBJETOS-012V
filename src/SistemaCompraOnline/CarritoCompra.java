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
public class CarritoCompra {
    private String productos;
    private double total;
    
    public CarritoCompra(String productos, double total){
        this.productos = productos;
        this.total = total;
    }
}
