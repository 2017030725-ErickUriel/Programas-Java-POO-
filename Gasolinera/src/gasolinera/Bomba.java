/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasolinera;

/**
 *
 * @author Erick
 */
public class Bomba {
    //Atributos
    private int numeroBomba;
    private Gasolina tipoGasolina;
    private float capacidad;
    private float contador;
    
    //Constructores
    public Bomba(){
        //Constructor por omision
        this.numeroBomba=1;
        this.tipoGasolina=null;
        this.capacidad=1000F;
        this.contador=0F;
    }
    public Bomba(int numero,Gasolina tipo,float cantidad,float contador){
        //Constructor con parametros
        this.numeroBomba=numero;
        this.tipoGasolina=tipo;
        this.capacidad=cantidad;
        this.contador=contador;
    }
    public Bomba(Bomba otra){
        //Constructor copia
        this.numeroBomba=otra.numeroBomba;
        this.tipoGasolina=otra.tipoGasolina;
        this.capacidad=otra.capacidad;
        this.contador=otra.contador;
    }

    /**
     * @return the numeroBomba
     */
    public int getNumeroBomba() {
        return numeroBomba;
    }

    /**
     * @param numeroBomba the numeroBomba to set
     */
    public void setNumeroBomba(int numeroBomba) {
        this.numeroBomba = numeroBomba;
    }

    /**
     * @return the tipoGasolina
     */
    public Gasolina getTipoGasolina() {
        return tipoGasolina;
    }

    /**
     * @param tipoGasolina the tipoGasolina to set
     */
    public void setTipoGasolina(Gasolina tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    /**
     * @return the capacidad
     */
    public float getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the contador
     */
    public float getContador() {
        return contador;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(float contador) {
        this.contador = contador;
    }
    
    public float revisarInventario(){
        return capacidad-contador;
    }
    public float realizarVenta(float litros){
        contador+=litros;
        return tipoGasolina.calcularPrecio()*litros;
    }
    public float calcularVentaTotal(){
        return tipoGasolina.calcularPrecio()*contador;
    }
    
}
