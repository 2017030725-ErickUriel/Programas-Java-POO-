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
public abstract class Productos {
    //Atributos
    protected int idProducto;
    protected String nombreProducto;
    protected float precioUnitario;
    protected int unidadProducto;
    
    //constructores
    public Productos(){
        this.idProducto=1;
        this.nombreProducto="Carne de res";
        this.precioUnitario=14F;
        this.unidadProducto=1;
    }
    public Productos(int id,String producto,float precio,int unidad){
        this.idProducto=id;
        this.nombreProducto=producto;
        this.precioUnitario=precio;
        this.unidadProducto=unidad;   
    }

    /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * @return the precioUnitario
     */
    public float getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * @return the unidadProducto
     */
    public int getUnidadProducto() {
        return unidadProducto;
    }

    /**
     * @param unidadProducto the unidadProducto to set
     */
    public void setUnidadProducto(int unidadProducto) {
        this.unidadProducto = unidadProducto;
    }
    
    public abstract float calcularPrecio();
            
    
    
}
