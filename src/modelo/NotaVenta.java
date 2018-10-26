/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Erick
 */
public class NotaVenta {
    //Atributos
    protected int numeroNota;
    protected String fecha;
    protected String concepto;
    protected Perecedero ProductoPerecedero;
    protected int cantidad;
    protected int tipoPago;
    
    //Constructores
    public NotaVenta(){
        this.numeroNota=1;
        this.fecha="01/01/2001";
        this.concepto="Venta";
        this.ProductoPerecedero=null;
        this.cantidad=1;
        this.tipoPago=1;
    }
    public NotaVenta(int nota,String fecha,String concepto,
            Perecedero producto,int cantidad,int pago){
        this.numeroNota=nota;
        this.fecha=fecha;
        this.concepto=concepto;
        this.ProductoPerecedero=producto;
        this.cantidad=cantidad;
        this.tipoPago=pago;
    }

    /**
     * @return the numeroNota
     */
    public int getNumeroNota() {
        return numeroNota;
    }

    /**
     * @param numeroNota the numeroNota to set
     */
    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the concepto
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * @param concepto the concepto to set
     */
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    /**
     * @return the ProductoPerecedero
     */
    public Perecedero getProductoPerecedero() {
        return ProductoPerecedero;
    }

    /**
     * @param ProductoPerecedero the ProductoPerecedero to set
     */
    public void setProductoPerecedero(Perecedero ProductoPerecedero) {
        this.ProductoPerecedero = ProductoPerecedero;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the tipoPago
     */
    public int getTipoPago() {
        return tipoPago;
    }

    /**
     * @param tipoPago the tipoPago to set
     */
    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }
    public float realizaCalculoPago(){
        return cantidad*ProductoPerecedero.calcularPrecio();
    }
}
