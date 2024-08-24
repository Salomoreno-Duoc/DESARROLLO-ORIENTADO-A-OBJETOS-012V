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
public class Pizza {
    private String tamano, masa, nombre;

    public Pizza(String tamano, String masa, String nombre) {
        this.tamano = tamano;
        this.masa = masa;
        this.nombre = nombre;
    }
    public void preparar(){
        
    }

    public String getTamano() {
        return tamano;
    }

    public String getMasa() {
        return masa;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
