/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Bomba;
import modelo.Gasolina;
import vista.VistaGasolinera;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class ControladorGasolinera implements ActionListener {
    
    private VistaGasolinera view;
    private Gasolina gasolina;
    private Bomba bomba;
    
    public ControladorGasolinera(VistaGasolinera view,Gasolina gasolina,Bomba bomba){
        this.view=view;
        this.gasolina=gasolina;
        this.bomba=bomba;
        this.view.txtBomba.addActionListener(this);
        this.view.txtMarca.addActionListener(this);
        this.view.txtPrecio.addActionListener(this);
        this.view.txtLitros.addActionListener(this);
        this.view.rdbTipo1.addActionListener(this);
        this.view.rdbTipo2.addActionListener(this);
        this.view.btnGuardar.addActionListener(this);
        this.view.btnInventario.addActionListener(this);
        this.view.btnCorte.addActionListener(this);
        this.view.btnVenta.addActionListener(this);
    }
    
    public void Iniciar(){
        this.view.setTitle("Gasolinera");
        this.view.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.view.btnGuardar){
            bomba.setNumeroBomba(Integer.parseInt(view.txtBomba.getText()));
            gasolina.setMarcaGasolina((String)view.txtMarca.getText());
            gasolina.setPrecioGasolina(Float.parseFloat(view.txtPrecio.getText()));
            if(view.rdbTipo1.isSelected())
                gasolina.setTipoGasolina(1);
            else if(view.rdbTipo2.isSelected())
                gasolina.setTipoGasolina(2);
            JOptionPane.showMessageDialog(null,"Datos guardados con exito");
        }
        
        if(e.getSource()==this.view.btnInventario){
            JOptionPane.showMessageDialog(null," La bomba tiene "+bomba.revisarInventario()+
                    " Litros disponibles");
        }
        
        if(e.getSource()==this.view.btnCorte){
            JOptionPane.showMessageDialog(null," Total de ventas "+bomba.getContador()+
                            " litros"+"\n Venta total $ "+bomba.calcularVentaTotal()+" pesos");
        }
        
        if(e.getSource()==this.view.btnVenta){
            float litros=Float.parseFloat(view.txtLitros.getText());
            float total=bomba.realizarVenta(litros);
            if(litros<=bomba.revisarInventario()){
                JOptionPane.showMessageDialog(null," Venta exitosa"+"\n Num.Bomba "+bomba.getNumeroBomba()+
                                "\n Gasolina "+gasolina.getMarcaGasolina()+
                                "\n tipo "+gasolina.getTipoGasolina()+
                                "\n Litros "+litros+
                                "\n Precio $"+gasolina.calcularPrecio()+
                                "\n total $"+total+
                                "\n vuelva pronto");
                view.txtLitros.setText("");
            }else{
                JOptionPane.showMessageDialog(null," Cantidad insuficiente de gasolina");
                view.txtLitros.setText("");
            }
                
            
        }
       
    }
    
}
