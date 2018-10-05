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
public class CuentadeBancoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        
        String nombre,fechaNacimiento,fechaApertura,domicilio,sucursal,opcMenu=" ";
        CuentadeBanco nuevaCuenta=new CuentadeBanco();
        
        Object menu[]={"Aperturar cuenta","Depositar saldo","Retirar saldo","Consultar saldo","Salir"};
        int cuenta=0,op=0,edad=0;
        float saldo=0F;
        
        do
        {
            opcMenu=(String)JOptionPane.showInputDialog(null," Elije una opcion",
                    " Menu",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
            
            switch(opcMenu)
            {
                case (String)"Aperturar cuenta":
                    edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese edad",
                            " Aperturar cuenta",JOptionPane.QUESTION_MESSAGE));
                    saldo=Float.parseFloat(JOptionPane.showInputDialog(null," Ingrese saldo inicial",
                            " Aperturar cuenta",JOptionPane.QUESTION_MESSAGE));
                    if(nuevaCuenta.aperturarCuenta(saldo,edad))
                    {
                        
                        nombre=(String)JOptionPane.showInputDialog(null," Ingrese nombre del cliente ",
                                " Aperturar cuenta",JOptionPane.QUESTION_MESSAGE);
                        
                        domicilio=(String)JOptionPane.showInputDialog(null," Ingrese domicilio del cliente",
                                " Aperturar cuenta",JOptionPane.QUESTION_MESSAGE);
                       
                        fechaNacimiento=(String)JOptionPane.showInputDialog(null," Ingrese fecha de nacimiento del cliente",
                                " Aperturar cuenta",JOptionPane.QUESTION_MESSAGE);
                       
                        fechaApertura=(String)JOptionPane.showInputDialog(null," Ingrese fecha de apertura",
                                " Aperturar cuenta",JOptionPane.QUESTION_MESSAGE);
                        
                        sucursal=(String)JOptionPane.showInputDialog(null," Ingrese nombre de la sucursal bancaria",
                                " Aperturar cuenta",JOptionPane.QUESTION_MESSAGE);
                        nuevaCuenta.setNombreCliente(nombre);
                        nuevaCuenta.setDomicilioCliente(domicilio);
                        nuevaCuenta.setFechaNacimiento(fechaNacimiento);
                        nuevaCuenta.setFechaApertura(fechaApertura);
                        nuevaCuenta.setNombreSucursal(sucursal);
                        nuevaCuenta.setSaldoCuenta(saldo);
                    }else
                    {
                        JOptionPane.showMessageDialog(null," Edad o fondo insuficiente para aperturar cuenta");
                    }
                    break;
                    
                case (String)"Depositar saldo":
                    saldo=Float.parseFloat(JOptionPane.showInputDialog(null," Ingrese saldo a depositar",
                            "Depositar saldo",JOptionPane.QUESTION_MESSAGE));
                    nuevaCuenta.depositarSaldo(saldo);
                    JOptionPane.showMessageDialog(null, " Se ha depositado $"+saldo+" a su cuenta");
                    break;
                    
                case (String)"Retirar saldo":
                    saldo=Float.parseFloat(JOptionPane.showInputDialog(null," Ingrese saldo a retirar",
                            "Retirar saldo",JOptionPane.QUESTION_MESSAGE));
                    if(nuevaCuenta.retirarSaldo(saldo))
                    {
                        JOptionPane.showMessageDialog(null, " Se ha retirado $"+saldo+" a su cuenta");
                    }else
                    {
                        JOptionPane.showMessageDialog(null, " Saldo insuficiente");
                    }
                    break;
                    
                case (String)"Consultar saldo":
                   JOptionPane.showMessageDialog(null, " El saldo de la cuenta es $ "+nuevaCuenta.getSaldoCuenta());
                   break;
                   
                default: System.out.println(" Opcion Invalida");
            }
        }while(!opcMenu.equals("Salir"));
        
    }
    
}
