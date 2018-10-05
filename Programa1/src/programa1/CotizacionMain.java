/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 
 * @author Erick
 */
public class CotizacionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        
        Object menu[]={"Iniciar objeto","Consultar datos","Modificar datos","Salir"};
        Object subMenu[]={"Modificar numero de cotizacion","Modificar descripcion del auto",
        "Modificar precio del auto","Modificar procentaje de pago incial","Modificar plazo de pago",
        "Volver"};
        
        int numCotizacion=0, plazoPago=0,op=0;
        float precio=0F,porcentaje=0F;
        String auto,opcMenu=" ",opcSubMenu=" ";
        
        
        
        Cotizacion cotizacion=new Cotizacion();
        
        do{
            opcMenu=(String)JOptionPane.showInputDialog(null," Opcion","Menu",
                    JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
            /*System.out.println(" 1- Inciar Objeto");
            System.out.println(" 2- Consultar Datos");
            System.out.println(" 3- Modificar Datos");
            System.out.println(" 4 -Salir");
            System.out.print(" Opcion ---> ");
            op=in.nextInt();*/
            
            switch(opcMenu)
            {
                case (String)"Iniciar objeto":
                    //System.out.println(" Ingrese numero de cotizacion :");
                    numCotizacion=Integer.parseInt(JOptionPane.showInputDialog(null," Ingrese numero de cotizacion",
                            "Cotizacion",JOptionPane.QUESTION_MESSAGE));
                    //System.out.println(" Ingrese descripcion del auto :");
                    //in.nextLine();
                    auto=(String)JOptionPane.showInputDialog(null," Ingrese descripcion del auto",
                            "Cotizacion",JOptionPane.QUESTION_MESSAGE);
                    //System.out.println(" Ingrese Precio del auto :");
                    precio=Float.parseFloat(JOptionPane.showInputDialog(null," Ingrese precio del auto",
                            "Cotizacion",JOptionPane.QUESTION_MESSAGE));
                    //System.out.println(" Ingrese porcentaje de pago inicial :");
                    porcentaje=Float.parseFloat(JOptionPane.showInputDialog(null," Ingrese porcentaje de pago inicial",
                            "Cotizacion",JOptionPane.QUESTION_MESSAGE));
                    //System.out.println(" Ingrese plazo de pago :");
                    plazoPago=Integer.parseInt(JOptionPane.showInputDialog(null," Ingrese plazo de pago",
                            "Cotizacion",JOptionPane.QUESTION_MESSAGE));
                    cotizacion.setNumCotizacion(numCotizacion);
                    cotizacion.setDescripcionAuto(auto);
                    cotizacion.setPrecioAuto(precio);
                    cotizacion.setPorcentajePago(porcentaje);
                    cotizacion.setPlazoPago(plazoPago);
                    break;
                case (String)"Consultar datos":
                    JOptionPane.showMessageDialog(null," Numero de Cotizacion : "+cotizacion.getNumCotizacion()+
                           "  \n Descripcion auto : "+cotizacion.getDescripcionAuto()+
                           " \n Precio del auto : $"+cotizacion.getPrecioAuto()+
                           " \n Porcentaje de pago incial : %"+cotizacion.getPorcentajePago()+
                           " \n Pago Inicial : $"+cotizacion.calcularPagoInicial()+
                           " \n Total a Pagar : $"+cotizacion.calcularTotal()+
                            " \n Plazo de pago : "+cotizacion.getPlazoPago()+" Mensualidades"+
                            " \n Mensualidad : $"+cotizacion.calcularMensualidad());
                    /*System.out.println(" Numero de Cotizacion : "+cotizacion.getNumCotizacion());
                    System.out.println(" Descripcion auto : "+cotizacion.getDescripcionAuto());
                    System.out.println(" Precio del auto : $"+cotizacion.getPrecioAuto());
                    System.out.println(" Porcentaje de pago incial : %"+cotizacion.getPorcentajePago());
                    System.out.println(" Pago Inicial : $"+cotizacion.calcularPagoInicial());
                    System.out.println(" Total a Pagar : $"+cotizacion.calcularTotal());
                    System.out.println(" Plazo de pago : "+cotizacion.getPlazoPago()+" Mensualidades");
                    System.out.println(" Mensualidad : $"+cotizacion.calcularMensualidad());*/
                    break;
                case (String)"Modificar datos":
                    do
                    {
                        opcSubMenu=(String)JOptionPane.showInputDialog(null," Opcion","Modificar dato",
                                JOptionPane.QUESTION_MESSAGE,null,subMenu,subMenu[0]);
                        /*System.out.println(" 1- Modificar numero de cotizacion ");
                        System.out.println(" 2- Modificar descripcion del auto ");
                        System.out.println(" 3- Modificar precio del auto ");
                        System.out.println(" 4- Modificar procentaje de pago incial ");
                        System.out.println(" 5- Modificar plazo de pago");
                        System.out.println(" 6- Volver");
                        System.out.print(" Opcion ---> ");
                        op=in.nextInt();*/
                        
                        switch(opcSubMenu)
                        {
                            case (String)"Modificar numero de cotizacion":
                                //System.out.println(" Ingrese numero de cotizacion :");
                                numCotizacion=Integer.parseInt(JOptionPane.showInputDialog(null," Modificar numero de cotizacion",
                                        "Modificar",JOptionPane.QUESTION_MESSAGE));
                                cotizacion.setNumCotizacion(numCotizacion);
                                break;
                            case (String)"Modificar descripcion del auto":
                                //System.out.println(" Ingrese descripcion del auto :");
                                //in.nextLine();
                                auto=(String)JOptionPane.showInputDialog(null," Modificar descripcion de auto",
                                        "Modificar",JOptionPane.QUESTION_MESSAGE);
                                cotizacion.setDescripcionAuto(auto);
                                break;
                            case (String)"Modificar precio del auto":
                                //System.out.println(" Ingrese precio del auto :");
                                precio=Float.parseFloat(JOptionPane.showInputDialog(null," Modificar precio del auto",
                                        "Modificar",JOptionPane.QUESTION_MESSAGE));
                                cotizacion.setPrecioAuto(precio);
                                break;
                            case (String)"Modificar procentaje de pago incial":
                                //System.out.println(" Ingrese porcentaje de pago incial :");
                                porcentaje=Float.parseFloat(JOptionPane.showInputDialog(null," Modificar porcentaje de pago inicial",
                                        "Modificar",JOptionPane.QUESTION_MESSAGE));;
                                cotizacion.setPorcentajePago(porcentaje);
                                break;
                            case (String)"Modificar plazo de pago":
                                //System.out.println(" Ingrese plazo de pago :");
                                plazoPago=Integer.parseInt(JOptionPane.showInputDialog(null," Modificar plazo de pago",
                                        "Modificar",JOptionPane.QUESTION_MESSAGE));
                                cotizacion.setPlazoPago(plazoPago);
                                break;
                            default: System.out.println(" Opcion Invalida");
                        }
                    }while(!opcSubMenu.equals("Volver"));
                    break;
                default:System.out.println(" Opcion Invalida");
            }
            
        }while (!opcMenu.equals("Salir"));
    }
    
}
