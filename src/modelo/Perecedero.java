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
public class Perecedero extends Productos{

    //Atributos
    private String fechaCaducidad;
    private float temperatura;
    
    //constructores
    public Perecedero(){
        super();
        this.fechaCaducidad="01/01/200";
        this.temperatura=33F;
    }
    public Perecedero(int id,String producto,float precio,int unidad,String caducidad,float temperatura){
        super(id,producto,precio,unidad);
        this.fechaCaducidad=caducidad;
        this.temperatura=temperatura;
        
    }
    
    
    @Override
    public float calcularPrecio() {
      // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        
      if(unidadProducto==1)
          return precioUnitario*1.04F;
      else if(unidadProducto==2)
          return precioUnitario*1.05F;
      else 
          return precioUnitario*1.03F;
          
            
    }

    /**
     * @return the fechaCaducidad
     */
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * @param fechaCaducidad the fechaCaducidad to set
     */
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * @return the temperatura
     */
    public float getTemperatura() {
        return temperatura;
    }

    /**
     * @param temperatura the temperatura to set
     */
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
    
}
