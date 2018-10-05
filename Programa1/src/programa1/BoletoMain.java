/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class BoletoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        Boleto nuevoBoleto=new Boleto();
        
        Object menu[]={"Comprar boleto","Mostrar boleto","Modificar boleto","Salir"};
        Object subMenu[]={"Modificar No. Boleto","Modificar nombre del cliente","Modificar edad del cliente"
                ,"Modificar destino","Modificar tipo de viaje","Modificar fecha de compra",
                "Modificar precio del boleto","Volver"};
        
        int op=0,boleto=0,tipoViaje=0,edad=0;
        float precio=0F,total=0F;
        String nombre,fecha,destino,opcMenu=" ",opcSubMenu=" ";
        
        do
        {
            opcMenu=(String)JOptionPane.showInputDialog(null," Elije una opcion"," Menu",
                    JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
            /*System.out.println(" 1- Comprar boleto ");
            System.out.println(" 2- Mostrar boleto ");
            System.out.println(" 3- Modificar boleto ");
            System.out.println(" 4- Salir ");
            System.out.print(" Opcion---> ");
            op=in.nextInt();*/
            
            switch(opcMenu)
            {
                case (String)"Comprar boleto":
                    //System.out.println(" Ingrese numero de boleto :");
                    boleto=Integer.parseInt(JOptionPane.showInputDialog(null," Ingrese numero de boleto ",
                            "Comprar boleto",JOptionPane.QUESTION_MESSAGE));
                    //System.out.println(" Ingrese nombre de cliente :");
                    //in.nextLine();
                    nombre=(String)JOptionPane.showInputDialog(null," Ingrese nombre del cliente ",
                            "Comprar boleto",JOptionPane.QUESTION_MESSAGE);
                    //System.out.println(" Ingrese edad del cliente :");
                    edad=Integer.parseInt(JOptionPane.showInputDialog(null," Ingrese edad del cliente ",
                            "Comprar boleto",JOptionPane.QUESTION_MESSAGE));
                    //System.out.println(" Ingrese destino :");
                    
                    destino=(String)JOptionPane.showInputDialog(null," Ingrese destino  ",
                            "Comprar boleto",JOptionPane.QUESTION_MESSAGE);
                    do
                    {
                       // System.out.println(" 1- Viaje sencillo ");
                        //System.out.println(" 2- Viaje redondo ");
                        tipoViaje=Integer.parseInt(JOptionPane.showInputDialog(null," 1- Viaje sencillo \n 2- Viaje redondo ",
                            "Comprar boleto",JOptionPane.QUESTION_MESSAGE));
                        
                    }while(tipoViaje<=0 || tipoViaje>2);
                    //System.out.println(" ingrese fecha de compra :");
                   // in.nextLine();
                    fecha=(String)JOptionPane.showInputDialog(null," Ingrese fecha de compra  ",
                            "Comprar boleto",JOptionPane.QUESTION_MESSAGE);
                    //System.out.println(" Ingrese precio de boleto :");
                    precio=Float.parseFloat(JOptionPane.showInputDialog(null," Precio boleto",
                            "Comprar boleto",JOptionPane.QUESTION_MESSAGE));
                    nuevoBoleto.setNombreCliente(nombre);
                    nuevoBoleto.setNumeroBoleto(boleto);
                    nuevoBoleto.setDestino(destino);
                    nuevoBoleto.setTipoViaje(tipoViaje);
                    nuevoBoleto.setFecha(fecha);
                    nuevoBoleto.setPrecio(precio);
                    break;
                case (String)"Mostrar boleto":
                    total=nuevoBoleto.calcularTotal()-nuevoBoleto.calcularDescuento(edad);
                    JOptionPane.showMessageDialog(null," No. Boleto "+nuevoBoleto.getNumeroBoleto()+
                            " \n Nombre del cliente : "+nuevoBoleto.getNombreCliente()+
                            " \n Destino : "+nuevoBoleto.getDestino()+
                            " \n Tipo de viaje : "+nuevoBoleto.getTipoViaje()+
                            " \n Fecha : "+nuevoBoleto.getFecha()+
                            " \n Precio boleto $"+nuevoBoleto.getPrecio()+
                            " \n Subtotal $"+nuevoBoleto.calcularSubtotal()+
                            " \n Impuesto $"+nuevoBoleto.calcularImpuesto()+
                            " \n Descuento $"+nuevoBoleto.calcularDescuento(edad)+
                            " \n Total $"+total);
                   /* System.out.println(" No. Boleto _"+nuevoBoleto.getNumeroBoleto());
                    System.out.println(" Nombre del cliente :"+nuevoBoleto.getNombreCliente());
                    System.out.println(" Destino "+nuevoBoleto.getDestino());
                    System.out.println(" Tipo de viaje :"+nuevoBoleto.getTipoViaje());
                    System.out.println(" Fecha "+nuevoBoleto.getFecha());
                    System.out.println(" Precio boleto $"+nuevoBoleto.getPrecio());
                    System.out.println(" Subtotal $"+nuevoBoleto.calcularSubtotal());
                    System.out.println(" Impuesto $"+nuevoBoleto.calcularImpuesto());
                    System.out.println(" Descuento $"+nuevoBoleto.calcularDescuento(edad));
                    System.out.println(" Total $"+total);*/
                    break;
                case (String)"Modificar boleto":
                    do
                    {
                        /*System.out.println(" 1- Modificar No. Boleto");
                        System.out.println(" 2- Modificar nombre del cliente");
                        System.out.println(" 3- Modificar edad del cliente");
                        System.out.println(" 4- Modificar destino");
                        System.out.println(" 5- Modificar tipo de viaje");
                        System.out.println(" 6- Modificar fecha de compra");
                        System.out.println(" 7- Modificar precio del boleto");
                        System.out.println(" 8- Volver");
                        System.out.print(" Opcion---> ");
                        op=in.nextInt();*/
                        
                        opcSubMenu=(String)JOptionPane.showInputDialog(null," Elije una opcion"," Menu",
                                     JOptionPane.QUESTION_MESSAGE,null,subMenu,subMenu[0]);
                        switch(opcSubMenu)
                        {
                            case (String)"Modificar No. Boleto":
                               // System.out.println(" Ingrese numero de boleto :");
                                boleto=Integer.parseInt(JOptionPane.showInputDialog(null," Ingrese numero de boleto ",
                                        "Modificar",JOptionPane.QUESTION_MESSAGE));
                                nuevoBoleto.setNumeroBoleto(boleto);
                                break;
                            case (String)"Modificar nombre del cliente":
                                // System.out.println(" Ingrese nombre de cliente :");
                                // in.nextLine();
                                 nombre=(String)JOptionPane.showInputDialog(null," Ingrese nombre del cliente ",
                                         "Modificar",JOptionPane.QUESTION_MESSAGE);
                                 nuevoBoleto.setNombreCliente(nombre);
                                 break;
                            case (String)"Modificar edad del cliente":
                                 //System.out.println(" Ingrese edad del cliente :");
                                 edad=Integer.parseInt(JOptionPane.showInputDialog(null," Ingrese edad del cliente ",
                                      "Modificar",JOptionPane.QUESTION_MESSAGE));
                                 break;
                            case (String)"Modificar destino":
                                // System.out.println(" Ingrese destino :");
                                 //in.nextLine();
                                 destino=(String)JOptionPane.showInputDialog(null," Ingrese destino  ",
                                         "Modificar",JOptionPane.QUESTION_MESSAGE);
                                 nuevoBoleto.setDestino(destino);
                                 break;
                            case (String)"Modificar tipo de viaje":
                                do
                                 {
                                     //System.out.println(" 1- Viaje sencillo ");
                                     //System.out.println(" 2- Viaje redondo ");
                                     tipoViaje=Integer.parseInt(JOptionPane.showInputDialog(null," 1- Viaje sencillo \n 2- Viaje redondo ",
                                             "Modificar",JOptionPane.QUESTION_MESSAGE));
                                 }while(tipoViaje<=0 || tipoViaje>2);
                                 nuevoBoleto.setTipoViaje(tipoViaje);
                                 break;
                            case (String)"Modificar fecha de compra":
                                //System.out.println(" ingrese fecha de compra :");
                                //in.nextLine();
                                fecha=(String)JOptionPane.showInputDialog(null," Ingrese fecha de compra  ",
                                        "Modificar",JOptionPane.QUESTION_MESSAGE);
                                nuevoBoleto.setFecha(fecha);
                                break;
                            case (String)"Modificar precio del boleto":
                                 //System.out.println(" Ingrese precio de boleto :");
                                 precio=Float.parseFloat(JOptionPane.showInputDialog(null," Precio boleto",
                                        "Modificar",JOptionPane.QUESTION_MESSAGE));
                                 nuevoBoleto.setPrecio(precio);
                                 break;
                            default:System.out.println(" Opcion Invalida ");
                        }
                    }while(!opcSubMenu.equals("Volver"));
                    break;
                case (String)"Salir":
                    System.out.println(" Gracias Por su preferencia");
                    break;
                default:System.out.println(" Opcion Invalida");
            }
        }while(!opcMenu.equals("Salir"));
    }
    
}
