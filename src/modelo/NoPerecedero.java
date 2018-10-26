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
public class NoPerecedero extends Productos{
    
    private int loteFabricacion;
    public NoPerecedero(){
        super();
        this.loteFabricacion=23;
    }
    
    public NoPerecedero(int id,String producto,float precio,int unidad,int lote){
        super(id,producto,precio,unidad);
        this.loteFabricacion=lote;
    }
    
    
    
    @Override
    public float calcularPrecio() {
        return precioUnitario*1.50F;
    }

    /**
     * @return the loteFabricacion
     */
    public int getLoteFabricacion() {
        return loteFabricacion;
    }

    /**
     * @param loteFabricacion the loteFabricacion to set
     */
    public void setLoteFabricacion(int loteFabricacion) {
        this.loteFabricacion = loteFabricacion;
    }
}
