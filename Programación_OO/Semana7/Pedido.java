package Programación_OO.Semana7;

import java.util.Arrays;
import java.util.Date;

public class Pedido {
    
    private ClienteP clienteP;
    private Producto [] producto;
    private Date fecha;
    private int numeroTarjetacredito;
    
    public Pedido(ClienteP clienteP, Producto[] producto, Date fecha, int numeroTarjetacredito) {
        this.clienteP = clienteP;
        this.producto = producto;
        this.fecha = fecha;
        this.numeroTarjetacredito = numeroTarjetacredito;
    }

    @Override
    public String toString() {
        return "Pedido [cliente=" + clienteP + ", producto=" + Arrays.toString(producto) + ", fecha=" + fecha
                + ", numeroTarjetacredito=" + numeroTarjetacredito + "]";
    }

    public boolean validarTarjeta(){
        return this.numeroTarjetacredito > 0;
    }
}
