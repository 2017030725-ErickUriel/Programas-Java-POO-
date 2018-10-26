/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import controlador.ControladorBoleto;
import modelo.Boleto;
import vista.VistaBoleto;

/**
 *
 * @author Erick
 */
public class BoletoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VistaBoleto vdlgBoleto=new VistaBoleto();
        Boleto boleto=new Boleto();
        ControladorBoleto ctrlBoleto=new ControladorBoleto(boleto,vdlgBoleto);
        ctrlBoleto.iniciar();
        vdlgBoleto.setVisible(true);
    }
    
}
