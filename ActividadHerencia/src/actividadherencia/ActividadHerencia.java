/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadherencia;

/**
 *
 * @author CETECOM
 */
public class ActividadHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Electronico electronico1 = new Electronico("E0001","Microondas",15000,"Midea",12);
    Electronico electronico2 = new Electronico("E0002","Celular",15000,"Xaomi",3);
    Ropa ropa1 = new Ropa("R0001","Polera",12000,"L","Rojo");
    
    System.out.println(electronico1.calcularDescuento(0.2));
    System.out.println(electronico1.calcularDescuento(0.9));
    System.out.println(ropa1.calcularDescuento(0.2));
    
    Cliente cliente1 = new Cliente("C0001","Juan Perez");
    
    Pedido pedido1 = new Pedido();
    Pedido pedido2 = new Pedido();
    
    pedido1.agregarProducto(ropa1);
    pedido1.agregarProducto(electronico1);
    
    pedido2.agregarProducto(ropa1);
    pedido2.agregarProducto(electronico2);
    pedido2.agregarProducto(electronico2);
    
    cliente1.agregaPedido(pedido1);
    cliente1.agregaPedido(pedido2);
    for(Pedido pedido : cliente1.getPedidosRealizados()){
        System.out.println("Total Pedido: "+pedido.toString()+" "+pedido.calcularTotal());
    }
    
    }
    
}
