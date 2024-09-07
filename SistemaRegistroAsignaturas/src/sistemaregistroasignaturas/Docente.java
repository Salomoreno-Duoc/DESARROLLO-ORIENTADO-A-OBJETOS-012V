/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaregistroasignaturas;

import java.time.LocalDate;

/**
 *
 * @author CETECOM
 */
public class Docente {
    private String rut;
    private String nro_docente;
    private String nombre;
    private LocalDate fechaIngreso;
    private String sede;

    public Docente(String rut, String nro_docente, String nombre, LocalDate fechaIngreso, String sede) {
        this.rut = rut;
        this.nro_docente = nro_docente;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.sede = sede;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNro_docente() {
        return nro_docente;
    }

    public void setNro_docente(String nro_docente) {
        this.nro_docente = nro_docente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
    
    
}
