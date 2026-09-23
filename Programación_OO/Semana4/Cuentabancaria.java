public class Cuentabancaria {

    // Atributos

    
    private double saldo;
    private String titular;
    private String numeroCuent;
    private String tipoCuenta;

    // Constructor

    public Cuentabancaria(double saldo, String titular, String numeroCuent, String tipoCuenta){

        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuent = numeroCuent;
        this.tipoCuenta = tipoCuenta;
    }

    //Metodo 

    public double consignar(double valor){
        return saldo = saldo + valor;
    }

    public double retirar(double valor){
        if (valor < 0){
            System.out.println("Valor invalido");
            return saldo;
        }else if (valor > saldo){
            System.out.println("Saldo insuficiente");
            return saldo;
        }else
            return saldo = saldo - valor;
    }

    public double consultarSaldo(){
        return saldo;
    }

    public String toString(){
        return "Cuentabancaria[ titular: "+ titular + " Tipo de Cuenta: " + tipoCuenta +" Numero de Cuenta: " + numeroCuent + " Saldo: " + saldo +"]";
    }

}
