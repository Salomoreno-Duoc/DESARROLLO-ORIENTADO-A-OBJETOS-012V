/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestordetareas;

import java.util.Date;

/**
 *
 * @author CETECOM
 */
public class Task {
    private int prioridad, idTask;
    private String nombre;
    private Date fechaLimite;
    private boolean check;

    public Task(int prioridad, int idTask, String nombre, Date fechaLimite) {
        this.prioridad = prioridad;
        this.idTask = idTask;
        this.nombre = nombre;
        this.fechaLimite = fechaLimite;
        this.check = false;
    }
    
    
}
