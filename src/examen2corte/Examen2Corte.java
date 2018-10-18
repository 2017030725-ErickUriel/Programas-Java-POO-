/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2corte;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class Examen2Corte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Docentes docente=new Docentes();
        Puestos puesto=new Puestos();
        docente.setPuesto(puesto);
        Scanner in=new Scanner(System.in);
        
        Object menu[]={"Captura de empleado","Captura puesto",
        "Calcular pago","Calcular perseccion","Calcular impuesto",
        "Total a pagar","Salir"};
        
        String opcMenu=" ",nombre=" ",fecha=" ",descripcion=" ",funciones=" ";
        int numeroEmpleado=0,materias=0,numeroPuesto=0,nivel=0,tipo=0;
        float pago=0F,horas=0F,total=0;
        
        do{
            opcMenu=(String)JOptionPane.showInputDialog(null,"Opcion","Menu",JOptionPane.QUESTION_MESSAGE,
                    null,menu,menu[0]);
            switch(opcMenu){
                case (String)"Captura de empleado":
                    numeroEmpleado=Integer.parseInt(JOptionPane.showInputDialog(null,"Numero empleado","Capturar",JOptionPane.QUESTION_MESSAGE));
                    nombre=(String)JOptionPane.showInputDialog(null,"Nombre","Capturar",JOptionPane.QUESTION_MESSAGE);
                    fecha=(String)JOptionPane.showInputDialog(null,"Fecha","Capturar",JOptionPane.QUESTION_MESSAGE);
                    materias=Integer.parseInt(JOptionPane.showInputDialog(null,"Numero materias","Capturar",JOptionPane.QUESTION_MESSAGE));
                    pago=Float.parseFloat(JOptionPane.showInputDialog(null,"Pago por hora","Capturar",JOptionPane.QUESTION_MESSAGE));
                    docente.setNumeroEmpleado(numeroEmpleado);
                    docente.setNombre(nombre);
                    docente.setFechaIngreso(fecha);
                    docente.setNumeroMaterias(materias);
                    docente.setPagoHora(pago);
                    break;
                case (String)"Captura puesto":
                    numeroPuesto=Integer.parseInt(JOptionPane.showInputDialog(null,"Numero puesto","Capturar",JOptionPane.QUESTION_MESSAGE));
                    descripcion=(String)JOptionPane.showInputDialog(null,"Descripcion","Capturar",JOptionPane.QUESTION_MESSAGE);
                    funciones=(String)JOptionPane.showInputDialog(null,"Funciones","Capturar",JOptionPane.QUESTION_MESSAGE);
                    do{
                    nivel=Integer.parseInt(JOptionPane.showInputDialog(null,"1=Tecnico\n2=Lic.Ing\n3=Maestria\n4=Doctorado"
                            ,"Capturar",JOptionPane.QUESTION_MESSAGE));
                    }while(nivel<0 || nivel >4);
                    do{
                    tipo=Integer.parseInt(JOptionPane.showInputDialog(null,"1=Eventual\n2=Base",
                            "Capturar",JOptionPane.QUESTION_MESSAGE));
                    }while(tipo<0 || tipo>2);
                    puesto.setNumeroPuesto(numeroPuesto);
                    puesto.setDescripcion(descripcion);
                    puesto.setFunciones(funciones);
                    puesto.setNivelAcademico(nivel);
                    puesto.setPuesto(tipo);
                    break;
                case (String)"Calcular pago":
                    horas=Float.parseFloat(JOptionPane.showInputDialog(null,"Horas trabajadas","Calcular pago",JOptionPane.QUESTION_MESSAGE));
                    JOptionPane.showMessageDialog(null," Horas Trabajadas "+horas+"\n Pago $"+docente.calcularPago(horas)+" Pesos");
                    break;
                case (String)"Calcular perseccion":
                    JOptionPane.showMessageDialog(null,"Numero de materias "+docente.getNumeroMaterias()+"\n Perseccion $"+docente.calcularPerseccion(horas)+" pesos");
                    break;
                case (String)"Calcular impuesto":
                    JOptionPane.showMessageDialog(null,"Impuesto $"+docente.calcularImpuesto(horas)+" pesos");
                    break;
                case (String)"Total a pagar":
                    total=docente.calcularPago(horas)+docente.calcularPerseccion(horas)-docente.calcularImpuesto(horas);
                    JOptionPane.showMessageDialog(null,"Su pago total es $"+total+" pesos");
                    break;
                        
            }
        }while(!menu.equals("Salir"));
    }
    
}
