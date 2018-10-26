/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Factura;
import modelo.Perecedero;
import vista.VistaAbarrotesFactura;
import vista.VistaAbarrotesMenu;
import vista.VistaAbarrotesNota;
import vista.VistaAbarrotesProducto;
import controlador.ControladorAbarrotesProducto;
import controlador.ControladorAbarrotesNota;
import controlador.ControladorAbarrotesFactura;

/**
 *
 * @author Erick
 */
public class ControladorAbarrotesMenu implements ActionListener{
    private Perecedero producto;
    private Factura factura;
    private VistaAbarrotesMenu view;
    
    public ControladorAbarrotesMenu(Perecedero producto,Factura factura,VistaAbarrotesMenu view){
        this.producto=producto;
        this.factura=factura;
        this.view=view;
        this.view.btnProducto.addActionListener(this);
        this.view.btnNota.addActionListener(this);
        this.view.btnFacturar.addActionListener(this);
    }
    public void iniciar(){
        this.view.setTitle("Menu");
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.view.btnProducto){
            VistaAbarrotesProducto vdlgProducto=new VistaAbarrotesProducto();
            ControladorAbarrotesProducto ctrlProducto=new ControladorAbarrotesProducto(producto,vdlgProducto);
            ctrlProducto.iniciar();
            vdlgProducto.setVisible(true);
        }
        if(e.getSource()==this.view.btnNota){
            VistaAbarrotesNota vdlgNota=new VistaAbarrotesNota();
            ControladorAbarrotesNota ctrlNota=new ControladorAbarrotesNota(producto,factura,vdlgNota);
            ctrlNota.iniciar();
            vdlgNota.setVisible(true);
        }
        if(e.getSource()==this.view.btnFacturar){
            VistaAbarrotesFactura vdlgFactura=new VistaAbarrotesFactura();
            ControladorAbarrotesFactura ctrlFactura=new ControladorAbarrotesFactura(factura,vdlgFactura);
            ctrlFactura.iniciar();
            vdlgFactura.setVisible(true);
        }
    }
    
    
            
    
}
