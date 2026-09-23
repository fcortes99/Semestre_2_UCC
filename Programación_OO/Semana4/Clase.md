Firma del metodo

Metodo (JAVA) -> sub rutina, sub proceso



public class CuentaBancaria {
    //Atributos
    private int id;
    private String titular;
    private String numeroCuenta;
    private double saldo;

    //Constructor de la clase --> Recuerde que tiene el mismo nombre de la clase
    public CuentaBancaria(int id, String titular, String numeroCuenta, double saldo){
        this.id = id;
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //Método consignar
    public double consignar(double valor){
        double total = saldo + valor;
        return total;
    }

    @override
    public String toString(){
        retunr "CuentaBancaria [ id: " + id + " titular: " + titular + " numeroCuenta: " + 
                                         numeroCuenta + " saldo: " + saldo + "]";
    }

}