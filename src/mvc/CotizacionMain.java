/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import controlador.ControladorCotizacion;
import modelo.Cotizacion;
import vista.VistaCotizacion;

/**
 *
 * @author Erick
 */
public class CotizacionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cotizacion cotizacion=new Cotizacion();
        VistaCotizacion view=new VistaCotizacion();
        ControladorCotizacion controlador=new ControladorCotizacion(cotizacion,view);
        controlador.iniciar();
        view.setVisible(true);
    }
    
}
