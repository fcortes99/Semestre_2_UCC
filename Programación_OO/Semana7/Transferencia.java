package Programación_OO.Semana7;

public class Transferencia extends Pago{
    private String pasarela;
    private int numeroTransferencia;
    
    public Transferencia(double monto, String pasarela, int numeroTransferencia) {
        super(monto);
        this.pasarela = pasarela;
        this.numeroTransferencia = numeroTransferencia;
    }

    
}
