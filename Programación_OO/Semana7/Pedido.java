package Programación_OO.Semana7;

import java.util.Arrays;
import java.util.Date;

public class Pedido {
    
    private Cliente cliente;
    private Producto [] producto;
    private Date fecha;
    private int numeroTarjetacredito;
    
    public Pedido(Cliente cliente, Producto[] producto, Date fecha, int numeroTarjetacredito) {
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.numeroTarjetacredito = numeroTarjetacredito;
    }

    @Override
    public String toString() {
        return "Pedido [cliente=" + cliente + ", producto=" + Arrays.toString(producto) + ", fecha=" + fecha
                + ", numeroTarjetacredito=" + numeroTarjetacredito + "]";
    }

    
}
