package Programación_OO.Semana7;

import java.util.Arrays;
import java.util.Date;

public class Pedido {
    
    private ClienteP clienteP;
    private Producto [] producto;
    private Date fecha;
    private String tipoPago;
    
    public Pedido(ClienteP clienteP, Producto[] producto, Date fecha, String tipoPago) {
        this.clienteP = clienteP;
        this.producto = producto;
        this.fecha = fecha;
        this.tipoPago = tipoPago;
    }

    @Override
    public String toString() {
        return "Pedido [cliente=" + clienteP + ", producto=" + Arrays.toString(producto) + ", fecha=" + fecha
                + ", tipoPago=" + tipoPago + "]";
    }

}
