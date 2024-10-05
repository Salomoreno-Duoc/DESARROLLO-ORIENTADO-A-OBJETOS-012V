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
public class Cliente {
    private String idCliente, nombre;
    private ArrayList<Pedido> pedidosRealizados = new ArrayList<>();

    public Cliente(String idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pedido> getPedidosRealizados() {
        return pedidosRealizados;
    }

    public void agregaPedido(Pedido pedido){
    this.pedidosRealizados.add(pedido);
    }
    
}
