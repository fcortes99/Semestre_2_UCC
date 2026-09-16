public class Banco {

    // Atributos

    
    private double saldo;
    private String titular;
    private int numeroCuent;
    private String tipoCuenta;

    // Constructor

    public Banco(double saldo, String titular, int numeroCuent, String tipoCuenta){

        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuent = numeroCuent;
        this.tipoCuenta = tipoCuenta;

    }

    public String toString(){
        return "Banco[ Saldo: " + saldo + " Titular: " + titular + " Numero de Cuenta: " + numeroCuent + " Tipo de cuenta: " + tipoCuenta + " ]";
    }

    public double consignacion(double cantidadaConsig){
        return cantidadaConsig + saldo;
    };

    public double retiro(double cantidadaRetirar){
        return  saldo - cantidadaRetirar;
    };
}

