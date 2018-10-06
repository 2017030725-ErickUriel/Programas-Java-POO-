/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasolinera;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class Gasolinera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        Bomba bomba=new Bomba();
        Gasolina gasolina=new Gasolina();
        bomba.setTipoGasolina(gasolina);
        Object menu[]={"Iniciar bomba","Realizar venta","Revisar inventario","Venta total","Salir"};
        float litros=0F,precio=0F,total=0F;
        String opcMenu=" ",marca=" ";
        int tipo=0;
        do{
            
            opcMenu=(String)JOptionPane.showInputDialog(null,"Opcion","Gasolinera"
                    ,JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
            
            switch(opcMenu){
                
                case (String)"Iniciar bomba":
                    marca=(String)JOptionPane.showInputDialog(null," Ingrese marca de gasolina",
                            " Iniciar bomba",JOptionPane.QUESTION_MESSAGE);
                    do{
                        tipo=Integer.parseInt(JOptionPane.showInputDialog(null," elije el tipo de gasolina",
                                " Iniciar bomba",JOptionPane.QUESTION_MESSAGE));
                    }while(tipo<0 || tipo>3);
                    precio=Float.parseFloat(JOptionPane.showInputDialog(null," Ingrese precio base",
                            " Iniciar bomba",JOptionPane.QUESTION_MESSAGE));
                    gasolina.setMarcaGasolina(marca);
                    gasolina.setPrecioGasolina(precio);
                    gasolina.setTipoGasolina(tipo);
                    bomba.setTipoGasolina(gasolina);
                    break;
                case (String)"Realizar venta":
                    litros=Float.parseFloat(JOptionPane.showInputDialog(null," Ingrese la contidad de litros",
                            "Venta",JOptionPane.QUESTION_MESSAGE));
                    if(litros<=bomba.revisarInventario())
                    {
                        total=bomba.realizarVenta(litros);
                        JOptionPane.showMessageDialog(null," Venta exitosa"+"\n Num.Bomba "+bomba.getNumeroBomba()+
                                "\n Gasolina "+gasolina.getMarcaGasolina()+
                                "\n tipo "+gasolina.getTipoGasolina()+
                                "\n Litros "+litros+
                                "\n Precio $"+gasolina.calcularPrecio()+
                                "\n total $"+total+
                                "\n vuelva pronto");
                    }else
                    {
                        JOptionPane.showMessageDialog(null," Cantidad insuficiente de gasolina");
                    }
                    break;
                case (String)"Revisar inventario":
                    JOptionPane.showMessageDialog(null," Cantidad de gasolina disponible, "+
                            bomba.revisarInventario()+" Litros");
                    break;
                case (String)"Venta total":
                    JOptionPane.showMessageDialog(null," Total de ventas "+bomba.getContador()+
                            " litros"+"\n Venta total $ "+bomba.calcularVentaTotal()+" pesos");
                    break;
                case (String)"Salir":
                    JOptionPane.showMessageDialog(null," Cerrando sistema");
            }
        }while(!opcMenu.equals("Salir"));
    }
    
}
