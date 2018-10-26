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
public class Gasolina {
    //Atributos
    private int idGasolina;
    private String marcaGasolina;
    private int tipoGasolina;
    private float precioGasolina;
    
    //Constructores
    public Gasolina(){
        //Constructor por omision
        this.idGasolina=1;
        this.marcaGasolina="Premiun";
        this.tipoGasolina=1;
        this.precioGasolina=19.90F;
    }
    public Gasolina(int id,String marca,int tipo,float precio){
        //Constructor con parametros
        this.idGasolina=id;
        this.marcaGasolina=marca;
        this.tipoGasolina=tipo;
        this.precioGasolina=precio;
    }
    public Gasolina(Gasolina otra){
        //Constructor copia
        this.idGasolina=otra.idGasolina;
        this.marcaGasolina=otra.marcaGasolina;
        this.tipoGasolina=otra.tipoGasolina;
        this.precioGasolina=otra.precioGasolina;
    }

    /**
     * @return the idGasolina
     */
    public int getIdGasolina() {
        return idGasolina;
    }

    /**
     * @param idGasolina the idGasolina to set
     */
    public void setIdGasolina(int idGasolina) {
        this.idGasolina = idGasolina;
    }

    /**
     * @return the marcaGasolina
     */
    public String getMarcaGasolina() {
        return marcaGasolina;
    }

    /**
     * @param marcaGasolina the marcaGasolina to set
     */
    public void setMarcaGasolina(String marcaGasolina) {
        this.marcaGasolina = marcaGasolina;
    }

    /**
     * @return the tipoGasolina
     */
    public int getTipoGasolina() {
        return tipoGasolina;
    }

    /**
     * @param tipoGasolina the tipoGasolina to set
     */
    public void setTipoGasolina(int tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    /**
     * @return the precioGasolina
     */
    public float getPrecioGasolina() {
        return precioGasolina;
    }

    /**
     * @param precioGasolina the precioGasolina to set
     */
    public void setPrecioGasolina(float precioGasolina) {
        this.precioGasolina = precioGasolina;
    }
    
    public float calcularPrecio(){
        if(tipoGasolina==1)
            return precioGasolina*1.10F;
        else if(tipoGasolina==2)
            return precioGasolina*1.20F;
        else
            return precioGasolina*1.25F;
    }
}

