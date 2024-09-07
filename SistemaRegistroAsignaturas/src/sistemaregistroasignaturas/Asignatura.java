/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaregistroasignaturas;

/**
 *Respecto a la
asignatura, almacenar el código único de la asignatura, el nombre de la asignatura, el nombre del estudiante y docente que la dicta,
además de las notas parciales (nota1, nota2 y nota3).
 * @author CETECOM
 */
public class Asignatura {
    private Alumno alumno;
    private String docente,nombreAsignatura,codigoAsignatura,nombreEstudiante;
    private float nota1,nota2,nota3,presentacionExamen,notaExamen;

    public Asignatura(String docente, Alumno alumno, String codigoAsignatura,String nombreAsignatura,float nota1, float nota2, float nota3) {
        /* Aca deben estar las validaciones*/
        this.docente = docente;
        this.nombreAsignatura = nombreAsignatura;
        this.codigoAsignatura = codigoAsignatura;
        this.alumno = alumno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(String codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public float getPresentacionExamen() {
        return presentacionExamen;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }
    
    public void calcularNota(){
        presentacionExamen = (float) ((nota1*0.3)+(nota2*0.3)+(nota3*0.4));
    
    }

    public void setNotaExamen(float notaExamen) {
        this.notaExamen = notaExamen;
    }
    
    
    public void getEximicion(){
        if (presentacionExamen >= 5){
            System.out.println("eximido");
            notaExamen = presentacionExamen;
        }
        else{
            System.out.println("no eximido");
        }
    }

    public void getResultado(float notaExamen, float presentacionExamen) {
        if ((notaExamen*0.6)+(presentacionExamen)>= 4.0){
            System.out.println("aprobado");
        }
        else{
            System.out.println("reprobado");
        }
    } 
                    
        
    
    /*
    * 
    */
}
