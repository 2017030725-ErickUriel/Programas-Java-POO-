/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

/**
 *
 * @author Erick
 */
public class Cotizacion {
    //Atributos
    private int numCotizacion;
    private String descripcionAuto;
    private float precioAuto;
    private float porcentajePago;
    private int plazoPago;
    
    //Constructores
    public Cotizacion()
    {
        //Cosntructtor por omision
        this.numCotizacion=1;
        this.descripcionAuto="Toyota Yaris Rc Rally car";
        this.precioAuto=340000F;
        this.porcentajePago=29F;
        this.plazoPago=40;
    }
    
    public Cotizacion(int num,String auto,float precio,float porcentaje,int plazo)
    {
        //Constructor con argumentos
        this.numCotizacion=num;
        this.descripcionAuto=auto;
        this.precioAuto=precio;
        this.porcentajePago=porcentaje;
        this.plazoPago=plazo;
    }
    
    public Cotizacion(Cotizacion cotizacion)
    {
        //constructor Copia
        this.numCotizacion=cotizacion.numCotizacion;
        this.descripcionAuto=cotizacion.descripcionAuto;
        this.precioAuto=cotizacion.precioAuto;
        this.porcentajePago=cotizacion.porcentajePago;
        this.plazoPago=cotizacion.plazoPago;
    }

    /**
     * @return the numCotizacion
     */
    public int getNumCotizacion() {
        return numCotizacion;
    }

    /**
     * @param numCotizacion the numCotizacion to set
     */
    public void setNumCotizacion(int numCotizacion) {
        this.numCotizacion = numCotizacion;
    }

    /**
     * @return the descripcionAuto
     */
    public String getDescripcionAuto() {
        return descripcionAuto;
    }

    /**
     * @param descripcionAuto the descripcionAuto to set
     */
    public void setDescripcionAuto(String descripcionAuto) {
        this.descripcionAuto = descripcionAuto;
    }

    /**
     * @return the precioAuto
     */
    public float getPrecioAuto() {
        return precioAuto;
    }

    /**
     * @return the porcentajePago
     */
    public float getPorcentajePago() {
        return porcentajePago;
    }

    /**
     * @param porcentajePago the porcentajePago to set
     */
    public void setPorcentajePago(float porcentajePago) {
        this.porcentajePago = porcentajePago;
    }

    /**
     * @return the plazoPago
     */
    public int getPlazoPago() {
        return plazoPago;
    }

    /**
     * @param plazoPago the plazoPago to set
     */
    public void setPlazoPago(int plazoPago) {
        this.plazoPago = plazoPago;
    }
    
   //Metodos
    public float calcularPagoInicial()
    {
        return  (porcentajePago/100)*precioAuto;
    }
    
    public float calcularTotal()
    {
        return precioAuto-calcularPagoInicial();
    }
    
    public float calcularMensualidad()
    {
        return calcularTotal()/plazoPago;
    }

    /**
     * @param precioAuto the precioAuto to set
     */
    public void setPrecioAuto(float precioAuto) {
        this.precioAuto = precioAuto;
    }
}
