/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import controlador.ControladorAbarrotesMenu;
import modelo.Factura;
import modelo.Perecedero;
import vista.VistaAbarrotesMenu;


/**
 *
 * @author Erick
 */
public class AbarrotesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factura factura=new Factura();
        Perecedero producto=new Perecedero();
        factura.setProductoPerecedero(producto);
        VistaAbarrotesMenu view=new VistaAbarrotesMenu();
        ControladorAbarrotesMenu ctrlMenu=new ControladorAbarrotesMenu(producto,factura,view);
        ctrlMenu.iniciar();
    }
    
}
