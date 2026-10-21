package Programación_OO.Semana7;

public class Tarjetacredito extends Pago{
    private String nombreBanco;
    private int cvv;
    
    public Tarjetacredito(double monto, String nombreBanco, int cvv) {
        super(monto);
        this.nombreBanco = nombreBanco;
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "Tarjetacredito [nombreBanco=" + nombreBanco + ", cvv=" + cvv + "]";
    }

} 
