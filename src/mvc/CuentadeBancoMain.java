/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import controlador.ControladorNomina;
import modelo.CuentadeBanco;
import vista.VistaNomina;

/**
 *
 * @author Erick
 */
public class CuentadeBancoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic h
        CuentadeBanco cuenta=new CuentadeBanco();
        VistaNomina view=new VistaNomina();
        ControladorNomina controlador=new ControladorNomina(cuenta,view);
        controlador.iniciar();
        view.setVisible(true);
    }
    
}
