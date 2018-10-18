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
public abstract class Empleados {
    protected int numeroEmpleado;
    protected String nombre;
    protected Puestos puesto;
    protected String fechaIngreso;
    
    public Empleados(){
        this.numeroEmpleado=1;
        this.nombre="Erick";
        this.puesto=null;
        this.fechaIngreso="18/10/2018";
    }
    public Empleados(int numero,String nombre,Puestos puesto,String fecha){
        this.numeroEmpleado=numero;
        this.nombre=nombre;
        this.puesto=puesto;
        this.fechaIngreso=fecha;
    }

    /**
     * @return the numeroEmpleado
     */
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    /**
     * @param numeroEmpleado the numeroEmpleado to set
     */
    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return the puesto
     */
    public Puestos getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(Puestos puesto) {
        this.puesto = puesto;
    }

    /**
     * @return the fechaIngreso
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    public abstract  float calcularPago(float horas);
        
    public abstract  float calcularImpuesto(float horas);

    

   
                
    
}
