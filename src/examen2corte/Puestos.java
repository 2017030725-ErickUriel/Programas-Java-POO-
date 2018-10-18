/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2corte;

/**
 *
 * @author Erick
 */
public class Puestos {
    private int numeroPuesto;
    private String descripcion;
    private String funciones;
    private int nivelAcademico;
    private int puesto;
    
    public Puestos(){
        this.numeroPuesto=1;
        this.descripcion="Maestro";
        this.funciones="Da clases de matematicas";
        this.nivelAcademico=2;
        this.puesto=2;
    }
    public Puestos(int numero,String descripcion,String funciones,int nivel,int puesto){
        this.numeroPuesto=numero;
        this.descripcion=descripcion;
        this.funciones=funciones;
        this.nivelAcademico=nivel;
        this.puesto=puesto;
    }

    /**
     * @return the numeroPuesto
     */
    public int getNumeroPuesto() {
        return numeroPuesto;
    }

    /**
     * @param numeroPuesto the numeroPuesto to set
     */
    public void setNumeroPuesto(int numeroPuesto) {
        this.numeroPuesto = numeroPuesto;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the funciones
     */
    public String getFunciones() {
        return funciones;
    }

    /**
     * @param funciones the funciones to set
     */
    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    /**
     * @return the nivelAcademico
     */
    public int getNivelAcademico() {
        return nivelAcademico;
    }

    /**
     * @param nivelAcademico the nivelAcademico to set
     */
    public void setNivelAcademico(int nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    /**
     * @return the puesto
     */
    public int getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }
}
