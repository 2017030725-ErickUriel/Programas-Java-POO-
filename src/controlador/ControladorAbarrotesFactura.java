/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Factura;
import vista.VistaAbarrotesFactura;

/**
 *
 * @author Erick
 */
public class ControladorAbarrotesFactura implements ActionListener {
    private Factura factura;
    private VistaAbarrotesFactura view;
    private boolean enableEdit=false;
    
    public ControladorAbarrotesFactura(Factura factura,VistaAbarrotesFactura view){
        this.factura=factura;
        this.view=view;
        this.view.btnNuevo.addActionListener(this);
        this.view.btnModificar.addActionListener(this);
        this.view.btnGuardar.addActionListener(this);
    }
    public void iniciar(){
        this.view.setTitle("Factura");
        this.view.setLocationRelativeTo(null);
        this.view.txtIva.setText(String.valueOf(factura.getIva()));
        this.view.txtIva.setEditable(false);
        desactivarCajas();
        limpiarCajas();
    }
    
    public void limpiarCajas(){
        this.view.txtRFC.setText("");
        this.view.txtNombre.setText("");
        this.view.txtDomicilio.setText("");
        this.view.txtFecha.setText("");
    }
    public void activarCajas(){
        this.view.txtRFC.setEditable(true);
        this.view.txtNombre.setEditable(true);
        this.view.txtDomicilio.setEditable(true);
        this.view.txtFecha.setEditable(true);
        enableEdit=true;
    }
    public void desactivarCajas(){
        this.view.txtRFC.setEditable(false);
        this.view.txtNombre.setEditable(false);
        this.view.txtDomicilio.setEditable(false);
        this.view.txtFecha.setEditable(false);
        enableEdit=false;
    }
    public boolean  validarVacios(){
        boolean aux=true;
        if(this.view.txtRFC.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(view,"Campo RFC vacio");
            this.view.txtRFC.requestFocus();
            aux=false;
        }
        if(this.view.txtNombre.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(view,"Campo Nombre vacio");
            this.view.txtNombre.requestFocus();
            aux=false;
        }
        if(this.view.txtDomicilio.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(view,"Campo Domicilio vacio");
            this.view.txtDomicilio.requestFocus();
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
            limpiarCajas();
            activarCajas();
        }
        if(e.getSource()==this.view.btnModificar){
            activarCajas();
        }
        if(e.getSource()==this.view.btnGuardar){
            if(enableEdit){
                if(validarVacios()){
                    factura.setRfc((String)view.txtRFC.getText());
                    factura.setNombreCliente((String)view.txtNombre.getText());
                    factura.setDomicilioFiscal((String)view.txtDomicilio.getText());
                    factura.setFechaFactura((String)view.txtFecha.getText());
                    JOptionPane.showMessageDialog(view,"Factura realizada con exito");
                    JOptionPane.showMessageDialog(view," RFC "+factura.getRfc()+"\n Nombre "+factura.getNombreCliente()
                        +"\n Domicilio "+factura.getDomicilioFiscal()+"\n fecha "+factura.getFecha()
                        +"\n IVA %"+factura.getIva()+"\n Impuesto $"+factura.calcularImpuesto()
                        +"\n Total $"+factura.calcularTotal());
                    desactivarCajas();
                }
            }else{
                JOptionPane.showMessageDialog(view,"No es posible guardar los datos");
            }
        }
    }
    
}
