/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaregistroasignaturas;
import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 *
 * @author CETECOM
 */
public class SistemaRegistroAsignaturas {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat unaDecima = new DecimalFormat("#.#");
        Alumno alumno1 = new Alumno("21.773.160-7","Amalia Nunes",18,LocalDate.parse("2006-11-01"));
        Asignatura asignatura1;
        asignatura1 = new Asignatura("Juan Soto",alumno1,"MAT0101","Matemática Aplicada",4.5f,3.8f,4.5f);
        asignatura1.calcularNota();
        asignatura1.getEximicion();
        
        System.out.println("nota de presentación "+unaDecima.format(asignatura1.getPresentacionExamen()));
        Alumno alumno2 = new Alumno("21.321.123-3","Francisco Fuentes",18,LocalDate.parse("2006-11-01"));
        Asignatura asignatura2;
        asignatura2 = new Asignatura("Pedro Suazo",alumno2,"PBD2208","Programación de BD",5.2f,4.7f,5.1f);
        asignatura2.calcularNota();
        asignatura2.getEximicion();
        System.out.println("nota de presentación "+unaDecima.format(asignatura2.getPresentacionExamen()));
        
    }
    
}
