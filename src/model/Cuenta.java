package model;

public class Cuenta {
   private String nombreBanco;
   private TipoCuenta tipoCuenta;
   private double saldoActual; 

   public Cuenta(String nombreBanco, TipoCuenta tipoCuenta, double saldoActual){
    this.nombreBanco=nombreBanco;
    this.tipoCuenta=tipoCuenta;
    this.saldoActual=saldoActual;
   }

   public String getnombreBanco(){
    return nombreBanco;
   }

   public void setnombreBanco(String nombreBanco){
    this.nombreBanco=nombreBanco;

   }

   public TipoCuenta gettipoCuenta(){
    return tipoCuenta;
   }

   public void settipoCuenta(TipoCuenta tipoCuenta){
    this.tipoCuenta=tipoCuenta;

   }

   public double getsaldoActual(){
    return saldoActual;
   }

   public void setsaldoActual(double saldoActual){
    this.saldoActual=saldoActual;

   }
}

public double retirarDineroCuenta(double monto){
    if (saldo<0){
        System.out.println("No se puede retirar esa cantidad de dinero");
        return 0;
    } else {
        this.saldoActual = saldoActual - monto;
        return monto;
    }
}
