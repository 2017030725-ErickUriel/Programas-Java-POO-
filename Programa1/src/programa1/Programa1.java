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
public class Programa1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Object menu[]={"Iniciar objeto","Consultar fecha","Cuantos dias tiene el mes",
        "Es año biciesto","Modificar fecha","Salir"};
        Object subMenu[]={"Dia","Mes","Año","Regresar"};
        
        String opcMenu=" ";
        int day = 0, month = 0, year = 0, op = 0;
        Fecha hoy = new Fecha();
        do{
            opcMenu=(String)JOptionPane.showInputDialog(null," Elije una opcion"," Menu",
                    JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);   
            
            switch(opcMenu)
            {
                case (String) "Iniciar objeto":
                    day=Integer.parseInt(JOptionPane.showInputDialog(null,"Dame el dia"
                    ," Fecha",JOptionPane.QUESTION_MESSAGE));
                    month=Integer.parseInt(JOptionPane.showInputDialog(null," Dame l mes"
                    ," Fecha",JOptionPane.QUESTION_MESSAGE));
                    year=Integer.parseInt(JOptionPane.showInputDialog(null," Dame el año"
                    ," Fecha",JOptionPane.QUESTION_MESSAGE));
                    hoy.setDia(day);
                    hoy.setMes(month);
                    hoy.setAño(year);
                    break;
                    
                case (String)"Consultar fecha":
                    JOptionPane.showMessageDialog(null,"La fecha es "+hoy.fechaConFormato());
                    break;
                    
                case (String)"Cuantos dias tiene el mes":
                    JOptionPane.showMessageDialog(null," El mes "+hoy.getMes()+" tiene "+hoy.getDia()+" dias" );
                    break;
                    
                case (String)"Es año biciesto":
                    if(hoy.isBiciesto())
                    {
                        JOptionPane.showMessageDialog(null," El año "+hoy.getAño()+" es biciesto");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null," El año "+hoy.getAño()+" no es biciesto");
                    }
                    break;
                    
                case (String)"Modificar fecha":
                    
                    String opcSubMenu=" ";
                    do
                    {
                        opcSubMenu=(String)JOptionPane.showInputDialog(null," Elije una opcion",
                         "Modificar fecha",JOptionPane.QUESTION_MESSAGE,null,subMenu,subMenu[0]);
                                                                    
                        switch(opcSubMenu)
                        {
                            case (String)"Dia": 
                                day = Integer.parseInt(JOptionPane.showInputDialog(null," Dame el dia",
                                        " Fecha",JOptionPane.QUESTION_MESSAGE));
                                hoy.setDia(day);
                                break;
                            case (String)"Mes":
                                month = Integer.parseInt(JOptionPane.showInputDialog(null," Dame el mes",
                                        " Fecha"),JOptionPane.QUESTION_MESSAGE);
                                hoy.setMes(month);
                                break;
                            case (String)"Año":
                                year = Integer.parseInt(JOptionPane.showInputDialog(null," Dame el año",
                                        " Fecha",JOptionPane.QUESTION_MESSAGE));
                                hoy.setAño(year);
                                break;
                            default:
                                System.out.println(" No es una opcion valida");
                        }
                    }while (!opcSubMenu.equals("Regresar"));
                    break;
                default: System.out.println("Opccion invalida");    
            }
        }while(!opcMenu.equals("Salir"));  
        System.out.println("Salio");
    }
}
