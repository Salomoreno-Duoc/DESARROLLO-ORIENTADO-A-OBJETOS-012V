/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadherencia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CETECOM
 */
public class Pedido {
    private ArrayList<Producto> productos = new ArrayList<>();
    private double total;
    public Pedido(){
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public double calcularTotal(){
        this.total = 0;
        for (Producto producto : productos){
            this.total += producto.getPrecio();
        }
        return this.total;
    }
    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }
    
}
