/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Cotizacion;
import vista.VistaCotizacion;

/**
 *
 * @author Erick
 */
public class ControladorCotizacion implements ActionListener  {
    private Cotizacion cotizacion;
    private VistaCotizacion view;
    private boolean enableEdit=false;
    
    public ControladorCotizacion(Cotizacion cotizacion,VistaCotizacion view){
        this.cotizacion=cotizacion;
        this.view=view;
        this.view.btnNuevo.addActionListener(this);
        this.view.btnModificar.addActionListener(this);
        this.view.btnGuardar.addActionListener(this);
    }
     public void iniciar(){
        this.view.setTitle("Cotizacion");
        this.view.setLocationRelativeTo(null);
        limpiarCajas();
        desactivarCajas();
    }
    public void limpiarCajas(){
        this.view.txtCotizacion.setText("");
        this.view.txtDescripcion.setText("");
        this.view.txtPlazo.setText("");
        this.view.txtPorcentaje.setText("");
        this.view.txtPrecio.setText("");
    }
    public void activarCajas(){
        this.view.txtCotizacion.setEditable(true);
        this.view.txtDescripcion.setEditable(true);
        this.view.txtPlazo.setEditable(true);
        this.view.txtPorcentaje.setEditable(true);
        this.view.txtPrecio.setEditable(true);
        enableEdit=true;
    }
    public void desactivarCajas(){
        this.view.txtCotizacion.setEditable(false);
        this.view.txtDescripcion.setEditable(false);
        this.view.txtPlazo.setEditable(false);
        this.view.txtPorcentaje.setEditable(false);
        this.view.txtPrecio.setEditable(false);
        enableEdit=false;
    }
    public boolean validarVacios(){
        boolean aux=true;
       if(this.view.txtCotizacion.getText().trim().isEmpty()){
           aux=false;
           JOptionPane.showMessageDialog(view,"Campo No.Cotizacion vacio");
           this.view.txtCotizacion.requestFocus();
       }
       if(this.view.txtDescripcion.getText().trim().isEmpty()){
           aux=false;
           JOptionPane.showMessageDialog(view,"Campo Descripcion vacio");
           this.view.txtCotizacion.requestFocus();
       }
       if(this.view.txtPlazo.getText().trim().isEmpty()){
           aux=false;
           JOptionPane.showMessageDialog(view,"Campo Plazo vacio");
           this.view.txtCotizacion.requestFocus();
       }
       if(this.view.txtPorcentaje.getText().trim().isEmpty()){
           aux=false;
           JOptionPane.showMessageDialog(view,"Campo Porcentaje vacio");
           this.view.txtCotizacion.requestFocus();
       }
       if(this.view.txtPrecio.getText().trim().isEmpty()){
           aux=false;
           JOptionPane.showMessageDialog(view,"Campo Precio vacio");
           this.view.txtCotizacion.requestFocus();
       }
       return aux;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.view.btnNuevo){
            activarCajas();
        }
        
        if(e.getSource()==this.view.btnModificar){
            activarCajas();
        }
        
        if(e.getSource()==this.view.btnGuardar){
            if(enableEdit){
                if(validarVacios()){
                    cotizacion.setNumCotizacion(Integer.parseInt(view.txtCotizacion.getText()));
                    cotizacion.setDescripcionAuto((String)view.txtDescripcion.getText());
                    cotizacion.setPorcentajePago(Float.parseFloat(view.txtPorcentaje.getText()));
                    cotizacion.setPrecioAuto(Float.parseFloat(view.txtPrecio.getText()));
                    cotizacion.setPlazoPago(Integer.parseInt(view.txtPlazo.getText()));
                    JOptionPane.showMessageDialog(view,"Datos Guardados");
                    JOptionPane.showMessageDialog(null," \n Precio del auto : $"+cotizacion.getPrecioAuto()+
                             " \n Porcentaje de pago incial : %"+cotizacion.getPorcentajePago()+
                             " \n Pago Inicial : $"+cotizacion.calcularPagoInicial()+
                             " \n Total a Pagar : $"+cotizacion.calcularTotal()+
                             " \n Plazo de pago : "+cotizacion.getPlazoPago()+" Mensualidades"+
                             " \n Mensualidad : $"+cotizacion.calcularMensualidad());
                }
            }else{
                JOptionPane.showMessageDialog(view,"Campos Vacios");
            }
        }
            
    }
    
    
            
    
}
