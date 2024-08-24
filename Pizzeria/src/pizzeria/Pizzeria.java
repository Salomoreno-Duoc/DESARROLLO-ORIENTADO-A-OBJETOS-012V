/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author CETECOM
 */
public class Pizzeria {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Pizzeria badonkadongs");
        Pizza pizza1 = new Pizza("gorda","mediana","sin piña");
        String tamano = pizza1.getTamano();
        System.out.println("Mi pizza es de tamaño "+tamano);
        
        pizza1.setTamano("Grande");
        System.out.println("Mi pizza es de tamaño "+tamano);
    }
    
}
