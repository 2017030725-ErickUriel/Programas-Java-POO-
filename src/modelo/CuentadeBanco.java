/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Erick
 */
public class CuentadeBanco {
    //Atributos
   private String nombreCliente;
   private String domicilioCliente;
   private String fechaNacimiento;
   private int numeroCuenta;
   private float saldoCuenta;
   private String fechaApertura;
   private String nombreSucursal;
   
   //Constructores
  public CuentadeBanco(){
       //Cosntructor por omision
       this.nombreCliente="Erick Uriel";
       this.domicilioCliente=" Cerro colorado #336";
       this.fechaNacimiento="13/08/97";
       this.numeroCuenta=1;
       this.saldoCuenta=5000;
       this.fechaApertura="26/09/2018";
       this.nombreSucursal="Bancomer Centro";
   }
  public CuentadeBanco(String nombre,String domicilio,String fechaNacimiento,int cuenta, int saldo, String fechaApertura,String sucursal){
      //Constructor con Argumentos
      this.nombreCliente=nombre;
      this.domicilioCliente=domicilio;
      this.fechaNacimiento=fechaNacimiento;
      this.numeroCuenta=cuenta;
      this.saldoCuenta=saldo;
      this.fechaApertura=fechaApertura;
      this.nombreSucursal=sucursal;
      
  }
  public CuentadeBanco(CuentadeBanco cuenta){
      //Constructor Copia
      this.nombreCliente=cuenta.nombreCliente;
      this.domicilioCliente=cuenta.domicilioCliente;
      this.fechaNacimiento=cuenta.fechaNacimiento;
      this.numeroCuenta=cuenta.numeroCuenta;
      this.saldoCuenta=cuenta.saldoCuenta;
      this.fechaApertura=cuenta.fechaApertura;
      this.nombreSucursal=cuenta.nombreSucursal;
  }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the domicilioCliente
     */
    public String getDomicilioCliente() {
        return domicilioCliente;
    }

    /**
     * @param domicilioCliente the domicilioCliente to set
     */
    public void setDomicilioCliente(String domicilioCliente) {
        this.domicilioCliente = domicilioCliente;
    }

    /**
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the numeroCuenta
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * @param numeroCuenta the numeroCuenta to set
     */
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * @return the saldoCuenta
     */
    public float getSaldoCuenta() {
        return saldoCuenta;
    }

    /**
     * @param saldoCuenta the saldoCuenta to set
     */
    public void setSaldoCuenta(float saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    /**
     * @return the fechaApertura
     */
    public String getFechaApertura() {
        return fechaApertura;
    }

    /**
     * @param fechaApertura the fechaApertura to set
     */
    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    /**
     * @return the nombreSucursal
     */
    public String getNombreSucursal() {
        return nombreSucursal;
    }

    /**
     * @param nombreSucursal the nombreSucursal to set
     */
    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }
  
  //Metodos
    public boolean aperturarCuenta(float saldoInicial,int edadCliente){
        if(saldoInicial>=1000 && edadCliente >=18)
            return true;
        else 
            return false;
    }
    
    public void depositarSaldo(float saldo)
    {
        saldoCuenta+=saldo;
    }
    public boolean retirarSaldo(float saldo)
    {
        if(saldo<=saldoCuenta)
        {
            saldoCuenta-=saldo;
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
