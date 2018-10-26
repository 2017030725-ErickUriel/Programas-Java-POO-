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
public class Factura extends NotaVenta{
    //atributos
    private String rfc;
    private String nombreCliente;
    private String domicilioFiscal;
    private String fechaFactura;
    private float iva;
    
    //Constructores
    public Factura(){
        super();
        this.rfc="0123FMA";
        this.nombreCliente="Francisco Mrtin Arellano";
        this.fechaFactura="01/01/2001";
        this.iva=20;
    }
    public Factura(int nota,String fecha,String concepto,
            Perecedero producto,int cantidad,int pago,String rfc
            ,String nombre,String domicilio,String fechaFactura,float iva){
        
        super(nota,fecha,concepto,producto,cantidad,pago);
        this.rfc=rfc;
        this.nombreCliente=nombre;
        this.fechaFactura=fechaFactura;
        this.iva=iva;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the domicilioFiscal
     */
    public String getDomicilioFiscal() {
        return domicilioFiscal;
    }

    /**
     * @param domicilioFiscal the domicilioFiscal to set
     */
    public void setDomicilioFiscal(String domicilioFiscal) {
        this.domicilioFiscal = domicilioFiscal;
    }

    /**
     * @return the fechaFactura
     */
    public String getFechaFactura() {
        return fechaFactura;
    }

    /**
     * @param fechaFactura the fechaFactura to set
     */
    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    /**
     * @return the iva
     */
    public float getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(float iva) {
        this.iva = iva;
    }
    public float calcularImpuesto(){
        return realizaCalculoPago()*(iva/100);
    }
    public float calcularTotal(){
        return realizaCalculoPago()+calcularImpuesto();
    }
    
}
