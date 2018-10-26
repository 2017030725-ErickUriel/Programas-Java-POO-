/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Perecedero;
import modelo.Factura;
import vista.VistaAbarrotesNota;

/**
 *
 * @author Erick
 */
public class ControladorAbarrotesNota implements ActionListener{
    
    private Perecedero producto;
    //private NotaVenta nota;
    private Factura factura;
    private VistaAbarrotesNota view;
    private boolean enableEdit=false;
    
    public ControladorAbarrotesNota(Perecedero producto,Factura factura,VistaAbarrotesNota view){
        this.producto=producto;
       // this.nota=nota;
        this.factura=factura;
        this.view=view;
        this.view.btnNuevo.addActionListener(this);
        this.view.btnModificar.addActionListener(this);
        this.view.btnGuardar.addActionListener(this);
        
    }
    public void iniciar(){
        this.view.setTitle("Nota de venta");
        this.view.setLocationRelativeTo(null);
        this.view.txtProducto.setText(String.valueOf(producto.getNombreProducto()));
        this.view.txtProducto.setEditable(false);
        desactivarCajas();
    }
    
    public void limpiarCajas(){
        this.view.txtNota.setText("");
        this.view.txtConcepto.setText("");
        this.view.txtCantidad.setText("");
        this.view.txtIva.setText("");
        this.view.txtFecha.setText("");
    }
    public void activarCajas(){
        this.view.txtNota.setEditable(true);
        this.view.txtConcepto.setEditable(true);
        this.view.txtCantidad.setEditable(true);
        this.view.txtIva.setEditable(true);
        this.view.txtFecha.setEditable(true);
        this.enableEdit=true;
    }
    public void desactivarCajas(){
        this.view.txtNota.setEditable(false);
        this.view.txtConcepto.setEditable(false);
        this.view.txtCantidad.setEditable(false);
        this.view.txtIva.setEditable(false);
        this.view.txtFecha.setEditable(false);
        this.enableEdit=false;
    }
    public boolean validarVacios(){
        boolean aux=true;
        if(this.view.txtNota.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(view,"Campo Nota vacio");
            this.view.txtNota.requestFocus();
            aux=false;
        }
        if(this.view.txtConcepto.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(view,"Campo Concepto vacio");
            this.view.txtConcepto.requestFocus();
            aux=false;
        }
        if(this.view.txtCantidad.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(view,"Campo Cantidad vacio");
            this.view.txtCantidad.requestFocus();
            aux=false;
        }
        if(this.view.txtIva.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(view,"Campo IVA vacio");
            this.view.txtIva.requestFocus();
            aux=false;
        }
        if(this.view.txtFecha.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(view,"Campo Fecha vacio");
            this.view.txtFecha.requestFocus();
            aux=false;
        }
        return aux;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.view.btnNuevo){
            activarCajas();
            limpiarCajas();
        }
        if(e.getSource()==this.view.btnModificar){
            activarCajas();
        }
        if(e.getSource()==this.view.btnGuardar){
            if(enableEdit){
                if(validarVacios()){
                    factura.setNumeroNota(Integer.parseInt(view.txtNota.getText()));
                    factura.setConcepto((String)view.txtConcepto.getText());
                    factura.setFecha((String)view.txtFecha.getText());
                    factura.setCantidad(Integer.parseInt(view.txtCantidad.getText()));
                    factura.setIva(Float.parseFloat(view.txtIva.getText()));
                    if(this.view.rdbContado.isSelected()==true){
                        factura.setTipoPago(1);
                    }else if(this.view.rdbCredito.isSelected()==true){
                        factura.setTipoPago(2);
                    }
                    JOptionPane.showMessageDialog(view,"Total a pagar es $"+factura.calcularTotal()+" pesos");
                    desactivarCajas();
                }
            }else{
                JOptionPane.showMessageDialog(view,"No es posible guardar los datos");
            }
        }
    }
    
}
