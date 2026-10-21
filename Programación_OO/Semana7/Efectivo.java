package Programación_OO.Semana7;

public class Efectivo extends Pago{
    private double montoRecivido;
    private double montoDevuelto;

    public Efectivo(double monto, double montoRecivido) {
        super(monto);
        this.montoRecivido = montoRecivido;
        this.montoDevuelto = montoDevuelto(montoRecivido);
    }

    public double montoDevuelto(double montoDevuelto){
        return (double) (montoRecivido - getMonto());
    }

    @Override
    public String toString() {
        return "Efectivo [montoRecivido=" + montoRecivido + ", montoDevuelto=" + montoDevuelto + "]";
    }

    
}
