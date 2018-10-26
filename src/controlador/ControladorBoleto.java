/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Boleto;
import vista.VistaBoleto;

/**
 *
 * @author Erick
 */
public class ControladorBoleto implements ActionListener {
    
    private Boleto boleto;
    private VistaBoleto view;
    private boolean enableEdit=false;
    private float total=0F;
    
    public ControladorBoleto(Boleto boleto,VistaBoleto view){
        this.boleto=boleto;
        this.view=view;
        this.view.btnNuevo.addActionListener(this);
        this.view.btnModificar.addActionListener(this);
        this.view.btnGuardar.addActionListener(this);
    }
    public void iniciar(){
        this.view.setTitle("Boleto");
        this.view.setLocationRelativeTo(null);
        limpiarCajas();
        desactivarCajas();
    }
    public void limpiarCajas(){
        this.view.txtBoleto.setText("");
        this.view.txtNombre.setText("");
        this.view.txtDestino.setText("");
        this.view.txtEdad.setText("");
        this.view.txtFecha.setText("");
        this.view.txtPrecio.setText("");
    }
    public void activarCajas(){
        this.view.txtBoleto.setEditable(true);
        this.view.txtNombre.setEditable(true);
        this.view.txtDestino.setEditable(true);
        this.view.txtEdad.setEditable(true);
        this.view.txtFecha.setEditable(true);
        this.view.txtPrecio.setEditable(true);
        enableEdit=true;
    }
    public void desactivarCajas(){
        this.view.txtBoleto.setEditable(false);
        this.view.txtNombre.setEditable(false);
        this.view.txtDestino.setEditable(false);
        this.view.txtEdad.setEditable(false);
        this.view.txtFecha.setEditable(false);
        this.view.txtPrecio.setEditable(false);
        enableEdit=false;
    }
    public boolean validarVacios(){
        boolean aux=true;
        if(this.view.txtBoleto.getText().trim().isEmpty()){
            aux=false;
            JOptionPane.showMessageDialog(view, "Campo No.Boleto vacio");
            this.view.txtBoleto.requestFocus();
        }
        if(this.view.txtNombre.getText().trim().isEmpty()){
            aux=false;
            JOptionPane.showMessageDialog(view, "Campo Nombre vacio");
            this.view.txtNombre.requestFocus();
        }
        if(this.view.txtDestino.getText().trim().isEmpty()){
            aux=false;
            JOptionPane.showMessageDialog(view, "Campo Destino vacio");
            this.view.txtDestino.requestFocus();
        }
        if(this.view.txtEdad.getText().trim().isEmpty()){
            aux=false;
            JOptionPane.showMessageDialog(view, "Campo Edad vacio");
            this.view.txtEdad.requestFocus();
        }
        if(this.view.txtFecha.getText().trim().isEmpty()){
            aux=false;
            JOptionPane.showMessageDialog(view, "Campo Fecha vacio");
            this.view.txtFecha.requestFocus();
        }
        if(this.view.txtPrecio.getText().trim().isEmpty()){
            aux=false;
            JOptionPane.showMessageDialog(view, "Campo Precio vacio");
            this.view.txtPrecio.requestFocus();
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
                    boleto.setNumeroBoleto((Integer.parseInt(view.txtBoleto.getText())));
                    boleto.setNombreCliente((String)view.txtNombre.getText());
                    boleto.setDestino((String)view.txtDestino.getText());
                    boleto.setFecha((String)view.txtFecha.getText());
                    boleto.setPrecio(Float.parseFloat(view.txtPrecio.getText()));
                    if(this.view.rdbNormal.isSelected()){
                        boleto.setTipoViaje(1);
                    }else if(this.view.rdbRedondo.isSelected()){
                        boleto.setTipoViaje(2);
                    }
                    total=boleto.calcularTotal()-boleto.calcularDescuento(Integer.parseInt(view.txtEdad.getText()));
                    JOptionPane.showMessageDialog(view,"Datos guardados con exito");
                    JOptionPane.showMessageDialog(view,"Subtotal $"+boleto.calcularSubtotal()+
                            "\nImpuesto $"+boleto.calcularImpuesto()+
                            "\nDescuento $"+boleto.calcularDescuento(Integer.parseInt(view.txtEdad.getText()))+
                            "\nTotal $ "+total);
                    desactivarCajas();
                }
            }else{
                JOptionPane.showMessageDialog(view,"Campos Vacios ");
            }
        }
    }
    
}
