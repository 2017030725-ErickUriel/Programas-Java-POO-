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
import vista.VistaAbarrotesProducto;

/**
 *
 * @author Erick
 */
public class ControladorAbarrotesProducto implements ActionListener {
    
    private Perecedero producto;
    private VistaAbarrotesProducto view;
    private boolean enableEdit=false;
    public ControladorAbarrotesProducto(Perecedero producto,VistaAbarrotesProducto view){
        this.producto=producto;
        this.view=view;
        this.view.btnNuevo.addActionListener(this);
        this.view.btnModificar.addActionListener(this);
        this.view.btnGuardar.addActionListener(this);
        
    }
    public void iniciar(){
        this.view.setTitle("Productos");
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
        desactivarCajas();
    }
    
    public void limpiarCajas(){
        this.view.txtId.setText("");
        this.view.txtProducto.setText("");
        this.view.txtPrecio.setText("");
        this.view.txtTemperatura.setText("");
        this.view.txtFecha.setText("");
    }
    public void activarCajas(){
        this.view.txtId.setEditable(true);
        this.view.txtProducto.setEditable(true);
        this.view.txtPrecio.setEditable(true);
        this.view.txtTemperatura.setEditable(true);
        this.view.txtFecha.setEditable(true);
        this.enableEdit=true;
    }
    public void desactivarCajas(){
        this.view.txtId.setEditable(false);
        this.view.txtProducto.setEditable(false);
        this.view.txtPrecio.setEditable(false);
        this.view.txtTemperatura.setEditable(false);
        this.view.txtFecha.setEditable(false);
        this.enableEdit=false;
    }
    public boolean validarVacios(){
        boolean aux=true;
        if(this.view.txtId.getText().trim().isEmpty()){
            aux=false;
            JOptionPane.showMessageDialog(view,"Campo Id vacio");
            this.view.txtId.requestFocus();
        }
        if(this.view.txtProducto.getText().trim().isEmpty()){
            aux=false;
            JOptionPane.showMessageDialog(view,"Campo Producto vacio");
            this.view.txtProducto.requestFocus();
        }
        if(this.view.txtPrecio.getText().trim().isEmpty()){
            aux=false;
            JOptionPane.showMessageDialog(view,"Campo Precio vacio");
            this.view.txtPrecio.requestFocus();
        }
        if(this.view.txtTemperatura.getText().trim().isEmpty()){
            aux=false;
            JOptionPane.showMessageDialog(view,"Campo Temperatura vacio");
            this.view.txtTemperatura.requestFocus();
        }
        if(this.view.txtFecha.getText().trim().isEmpty()){
            aux=false;
            JOptionPane.showMessageDialog(view,"Campo Fechas vacio");
            this.view.txtFecha.requestFocus();
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
                    producto.setIdProducto(Integer.parseInt(view.txtId.getText()));
                    producto.setNombreProducto((String)view.txtProducto.getText());
                    producto.setPrecioUnitario(Float.parseFloat(view.txtPrecio.getText()));
                    producto.setTemperatura(Float.parseFloat(view.txtTemperatura.getText()));
                    producto.setFechaCaducidad((String)view.txtFecha.getText());
                    if(view.rdbKilo.isSelected()){
                        producto.setUnidadProducto(1);
                    }else if(view.rdbLitro.isSelected()){
                        producto.setUnidadProducto(2);
                    }else if(view.rdbPieza.isSelected()){
                        producto.setUnidadProducto(2);
                    }
                    JOptionPane.showMessageDialog(view,"Producto Guardado con exito");
                    desactivarCajas();
                }
            }else{
                JOptionPane.showMessageDialog(view,"No es posible guardar los datos");
            }
        }
    }
    
}
