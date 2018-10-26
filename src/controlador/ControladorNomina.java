/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.CuentadeBanco;
import vista.VistaNomina;
import javax.swing.JOptionPane;
/**
 *
 * @author Erick
 */
public class ControladorNomina implements ActionListener {
    
    private CuentadeBanco cuenta;
    private VistaNomina view;
    
    public ControladorNomina(CuentadeBanco cuenta,VistaNomina view){
        this.view=view;
        this.cuenta=cuenta;
        this.view.btnNuevo.addActionListener(this);
        this.view.btnModificar.addActionListener(this);
        this.view.btnGuardar.addActionListener(this);
        this.view.btnDepositar.addActionListener(this);
        this.view.btnRetirar.addActionListener(this);
        this.view.btnConsultar.addActionListener(this);
    }
    public void activarFunciones(){
        this.view.btnConsultar.setEnabled(true);
        this.view.btnDepositar.setEnabled(true);
        this.view.btnRetirar.setEnabled(true);
        this.view.txtSaldo.setEditable(true);
    }
    public void desactivarFunciones(){
        this.view.btnConsultar.setEnabled(false);
        this.view.btnDepositar.setEnabled(false);
        this.view.btnRetirar.setEnabled(false);
        this.view.txtSaldo.setEditable(false);
    }
    public void limpiarCajas(){
        this.view.txtCuenta.setText("");
        this.view.txtSucursal.setText("");
        this.view.txtFechaApertura.setText("");
        this.view.txtNombre.setText("");
        this.view.txtDomicilio.setText("");
        this.view.txtFechaNacimiento.setText("");
        this.view.txtSaldoInicial.setText("");
        this.view.txtEdad.setText("");
        this.view.txtSaldo.setText("");
    }
    public void activarCajas(){
        this.view.txtCuenta.setEnabled(true);
        this.view.txtSucursal.setEnabled(true);
        this.view.txtFechaApertura.setEnabled(true);
        this.view.txtNombre.setEnabled(true);
        this.view.txtDomicilio.setEnabled(true);
        this.view.txtFechaNacimiento.setEnabled(true);
        this.view.txtSaldoInicial.setEnabled(true);
        this.view.txtEdad.setEnabled(true);
        this.view.txtSaldo.setEnabled(true);
    }
    public void desactivarCajas(){
        this.view.txtCuenta.setEnabled(false);
        this.view.txtSucursal.setEnabled(false);
        this.view.txtFechaApertura.setEnabled(false);
        this.view.txtNombre.setEnabled(false);
        this.view.txtDomicilio.setEnabled(false);
        this.view.txtFechaNacimiento.setEnabled(false);
        this.view.txtSaldoInicial.setEnabled(false);
        this.view.txtEdad.setEnabled(false);
    }
    public void activarBotones(){
        this.view.btnConsultar.setEnabled(false);
        this.view.btnDepositar.setEnabled(false);
        this.view.btnRetirar.setEnabled(false);
    }
    //public void 
    public void iniciar(){
        this.view.setTitle("Cuenta de banco");
        this.view.setLocationRelativeTo(null);
        limpiarCajas();
        desactivarCajas();
        desactivarFunciones();
        
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
            if(view.txtCuenta.isEnabled()){
                if(cuenta.aperturarCuenta(Float.parseFloat(view.txtSaldoInicial.getText()),Integer.parseInt(view.txtEdad.getText()))){
                   cuenta.setNumeroCuenta(Integer.parseInt(view.txtCuenta.getText()));
                   cuenta.setFechaApertura((String)view.txtFechaApertura.getText());
                   cuenta.setNombreSucursal((String)view.txtFechaApertura.getText());
                   cuenta.setNombreCliente((String)view.txtNombre.getText());
                   cuenta.setFechaNacimiento((String)view.txtFechaNacimiento.getText());
                   cuenta.setDomicilioCliente((String)view.txtDomicilio.getText());
                   cuenta.setSaldoCuenta(Float.parseFloat(view.txtSaldoInicial.getText()));
                   desactivarCajas();
                   activarFunciones();
                   JOptionPane.showMessageDialog(null,"Datos guardados con exito");
              }else{
                    JOptionPane.showMessageDialog(null,"Edad o Saldo insuficiente para aperturar cuenta");
                 limpiarCajas();
              }
            }
        }
        
        if(e.getSource()==this.view.btnDepositar){
            cuenta.depositarSaldo(Float.parseFloat(view.txtSaldo.getText()));
            JOptionPane.showMessageDialog(null,"Se ha depositado $"+view.txtSaldo.getText()+" a su cuenta");
            view.txtSaldo.setText("");
        }
        
        if(e.getSource()==this.view.btnRetirar){
            if(cuenta.retirarSaldo(Float.parseFloat(view.txtSaldo.getText()))){
                JOptionPane.showMessageDialog(null,"Se ha retirado $"+view.txtSaldo.getText()+" pesos de su cuenta");
                view.txtSaldo.setText("");
            }else{
                JOptionPane.showMessageDialog(null,"Saldo insuficiente");
                view.txtSaldo.setText("");

            }
        }
        
        if(e.getSource()==this.view.btnConsultar)
            JOptionPane.showMessageDialog(null,"El saldo se se cuenta es $"+cuenta.getSaldoCuenta()+" pesos");
    }
    
    
}
