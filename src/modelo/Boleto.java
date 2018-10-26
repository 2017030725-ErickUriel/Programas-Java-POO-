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
public class Boleto {
    
    private int numeroBoleto;
    private String nombreCliente;
    private String destino;
    private int tipoViaje;
    private String fecha;
    private float precio;
    
    public Boleto()
    {
        //constructor por omision
        this.numeroBoleto=1;
        this.nombreCliente="Erick";
        this.destino="San Ignacio";
        this.tipoViaje=1;
        this.fecha="21/09/2018";
        this.precio=89;
    }
    
    public Boleto(int numero,String cliente,String destino,int viaje,String fecha,float precio)
    {
        //constructor por argumentos
        this.numeroBoleto=numero;
        this.nombreCliente=cliente;
        this.destino=destino;
        this.tipoViaje=viaje;
        this.fecha=fecha;
        this.precio=precio;
    }
    
    public Boleto(Boleto boleto)
    {
        //constructor copia
        this.numeroBoleto=boleto.numeroBoleto;
        this.nombreCliente=boleto.nombreCliente;
        this.destino=boleto.destino;
        this.tipoViaje=boleto.tipoViaje;
        this.fecha=boleto.fecha;
        this.precio=boleto.precio;
    }
    
    public float calcularPrecio(){
        
        return 0;
    }

    /**
     * @return the numeroBoleto
     */
    public int getNumeroBoleto() {
        return numeroBoleto;
    }

    /**
     * @param numeroBoleto the numeroBoleto to set
     */
    public void setNumeroBoleto(int numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
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
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the tipoViaje
     */
    public int getTipoViaje() {
        return tipoViaje;
    }

    /**
     * @param tipoViaje the tipoViaje to set
     */
    public void setTipoViaje(int tipoViaje) {
        this.tipoViaje = tipoViaje;
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
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    //Metodos 
    public float calcularSubtotal(){
        if(tipoViaje==2)
            return precio*1.80F;
        else
            return precio;
    }
    public float calcularImpuesto(){
        return precio*0.16F;
    }
    public float calcularDescuento(int edad){
        if(edad >=60)
            return precio-(precio*.50F);
        else
            return 0F;
    }
    public float calcularTotal()
    {
        return calcularSubtotal()+calcularImpuesto();
    }
}

