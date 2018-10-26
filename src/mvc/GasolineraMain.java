/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import controlador.ControladorGasolinera;
import modelo.Bomba;
import modelo.Gasolina;
import vista.VistaGasolinera;

/**
 *
 * @author Erick
 */
public class GasolineraMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bomba bomba=new Bomba();
        Gasolina gasolina=new Gasolina();
        VistaGasolinera view=new VistaGasolinera();
        bomba.setTipoGasolina(gasolina);
        ControladorGasolinera controlador=new ControladorGasolinera(view,gasolina,bomba);
        controlador.Iniciar();
        view.setVisible(true);
    }
    
}
