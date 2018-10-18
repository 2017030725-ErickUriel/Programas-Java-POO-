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
public class Docentes extends Empleados {
    private int numeroMaterias;
    private float pagoHora;
    
    public Docentes(){
        super();
        this.numeroMaterias=1;
        this.pagoHora=30;
    }
    public Docentes(int numero,String nombre,Puestos puesto,String fecha,int materias,float pago){
        super(numero,nombre,puesto,fecha);
        this.numeroMaterias=materias;
        this.pagoHora=pago;
    }


    /**
     * @return the numeroMaterias
     */
    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    /**
     * @param numeroMaterias the numeroMaterias to set
     */
    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }

    /**
     * @return the pagoHora
     */
    public float getPagoHora() {
        return pagoHora;
    }

    /**
     * @param pagoHora the pagoHora to set
     */
    public void setPagoHora(float pagoHora) {
        this.pagoHora = pagoHora;
    }
     public float calcularPerseccion(float horas){
         if(numeroMaterias>=1 && numeroMaterias<=3)
            return calcularPago(horas)*0.10F;
         else if(numeroMaterias>=4 && numeroMaterias<=5)
             return calcularPago(horas)*0.30F;
         else
             return 0F;
             
     }
     @Override
    public float calcularPago(float horas) {
        if(puesto.getPuesto()==1)
            return (horas*pagoHora)*1.18F;
        else
            return horas*pagoHora;
    }

    @Override
    public float calcularImpuesto(float horas) {
        if(puesto.getNivelAcademico()==1 || puesto.getNivelAcademico()==2)
            return calcularPago(horas)*0.16F;
        else
            return calcularPago(horas)*0.18F;
    }
}
