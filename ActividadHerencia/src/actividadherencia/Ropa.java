/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadherencia;

/**
 *
 * @author CETECOM
 */
public class Ropa extends Producto {
    private String talla, color;

    public Ropa(String idProducto, String nombre, double precio, String talla, String color) {
        super(idProducto, nombre, precio);
        this.talla = talla;
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void ajustarTalla(String nuevaTalla){
        this.talla = nuevaTalla;
    }
}
